package net.virtualviking.vra.jenkinsplugin.vra;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import net.virtualviking.vra.jenkinsplugin.model.AuthenticationRequest;
import net.virtualviking.vra.jenkinsplugin.model.AuthenticationResponse;
import net.virtualviking.vra.jenkinsplugin.model.blueprint.Blueprint;
import net.virtualviking.vra.jenkinsplugin.model.blueprint.PageOfBlueprint;
import net.virtualviking.vra.jenkinsplugin.model.catalog.CatalogItem;
import net.virtualviking.vra.jenkinsplugin.model.catalog.CatalogItemRequest;
import net.virtualviking.vra.jenkinsplugin.model.catalog.CatalogItemRequestResponse;
import net.virtualviking.vra.jenkinsplugin.model.catalog.Deployment;
import net.virtualviking.vra.jenkinsplugin.model.catalog.PageOfCatalogItem;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Project;
import net.virtualviking.vra.jenkinsplugin.model.iaas.ProjectResult;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;

public class VRAClient implements Serializable {
  private static final long serialVersionUID = -3538449737600216823L;
  private static final String API_VERSION = "2019-09-12";
  private final String refreshToken;
  private final String baseUrl;
  private final Gson gson;
  private final long deploymentPollInterval = 30000;

  public VRAClient(final String url, final String token) throws VRAException {
    gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateTypeAdapter()).create();
    baseUrl = url;
    final AuthenticationResponse resp =
        post(
            url + "/iaas/api/login",
            null,
            new AuthenticationRequest(token),
            AuthenticationResponse.class);
    refreshToken = resp.getToken();
  }

  private static String readAll(final InputStream in) throws IOException {
    final InputStreamReader rdr = new InputStreamReader(in);
    final StringBuilder sb = new StringBuilder();
    final char[] buffer = new char[8192];
    int n;
    while ((n = rdr.read(buffer)) > 0) {
      sb.append(buffer, 0, n);
    }
    return sb.toString();
  }

  private static void checkResponseSingleton(final List<?> content) throws VRAException {
    if (content == null) {
      throw new VRAException("No content was found");
    }
    if (content.size() != 1) {
      throw new VRAException("Expected 1 item, got " + content.size());
    }
  }

  private static Map<String, String> mapOf(final String... s) throws IllegalArgumentException {
    if (s.length % 2 != 0) {
      throw new IllegalArgumentException("Map inputs must be an even number");
    }
    final Map<String, String> map = new HashMap<>();

    for (int i = 0; i < s.length; i += 2) {
      map.put(s[i], s[i + 1]);
    }
    return map;
  }

  private static String buildQuery(final Map<String, String> queries)
      throws UnsupportedEncodingException {
    if (queries == null) {
      return "";
    }
    queries.put("apiVersion", API_VERSION);
    String s = "?";
    boolean amp = false;
    for (final Map.Entry<String, String> q : queries.entrySet()) {
      if (amp) {
        s += '&';
      }
      s += q.getKey() + "=" + URLEncoder.encode(q.getValue(), Charset.defaultCharset().name());
      amp = true;
    }
    return s;
  }

  public Blueprint getBlueprintByName(final String name) throws VRAException {
    final PageOfBlueprint page =
        get(baseUrl + "/blueprint/api/blueprints", mapOf("name", name), PageOfBlueprint.class);
    if (page.isEmpty()) {
      return null;
    }
    final List<Blueprint> content = page.getContent();
    checkResponseSingleton(content);
    return content.get(0);
  }

  public Blueprint getBlueprintById(final String id) throws VRAException {
    return get(baseUrl + "/blueprint/api/blueprints/" + id, null, Blueprint.class);
  }

  public CatalogItem getCatalogItemByName(final String name) throws VRAException {
    final PageOfCatalogItem page =
        get(
            baseUrl + "/catalog/api/items",
            mapOf("search", name, "size", "1000000"),
            PageOfCatalogItem.class);
    final List<CatalogItem> content = page.getContent();
    return content.stream()
        .filter((c) -> c.getName().equals(name))
        .findFirst()
        .orElseGet(() -> null);
  }

  public Project getProjectByName(final String name) throws VRAException {
    final ProjectResult projs =
        get(
            baseUrl + "/iaas/api/projects",
            mapOf("$filter", "name eq '" + name + "'"),
            ProjectResult.class);
    checkResponseSingleton(projs.getContent());
    return projs.getContent().get(0);
  }

  public Project getProjectById(final String id) throws VRAException {
    return get(baseUrl + "/iaas/api/projects/" + id, null, Project.class);
  }

  public CatalogItem getCatalogItemById(final String id) throws VRAException {
    return get(baseUrl + "/catalog/api/items/" + id, null, CatalogItem.class);
  }

  private <R> R get(final String url, final Map<String, String> query, final Class<R> responseClass)
      throws VRAException {
    try {
      final String content = get(url, query);
      return gson.fromJson(content, responseClass);
    } catch (final IOException e) {
      throw new VRAException(e);
    }
  }

  private <R> R delete(
      final String url, final Map<String, String> query, final Class<R> responseClass)
      throws VRAException {
    try {
      final String content = delete(url, query);
      return gson.fromJson(content, responseClass);
    } catch (final IOException e) {
      throw new VRAException(e);
    }
  }

  public CatalogItemRequestResponse[] deployFromCatalog(
      final String ciName,
      final String version,
      final String project,
      final String deploymentName,
      final String reason,
      final Map inputs,
      final int count)
      throws VRAException {
    final CatalogItem ci = getCatalogItemByName(ciName);
    final Project proj = getProjectByName(project);

    final CatalogItemRequest cir = new CatalogItemRequest();
    cir.setBulkRequestCount(count);
    cir.setDeploymentName(deploymentName);
    cir.setProjectId(proj.getId());
    cir.setVersion(version);
    cir.setReason(reason);
    cir.setInputs(inputs != null ? inputs : Collections.EMPTY_MAP);
    return post(
        baseUrl + "/catalog/api/items/" + ci.getId() + "/request",
        null,
        cir,
        CatalogItemRequestResponse[].class);
  }

  public Deployment getCatalogDeployment(final String deploymentId, final boolean expandResources)
      throws VRAException {
    return get(
        baseUrl + "/deployment/api/deployments/" + deploymentId,
        mapOf("expandResources", Boolean.toString(expandResources)),
        Deployment.class);
  }

  public Deployment deleteCatalogDeployment(final String deploymentId) throws VRAException {
    return delete(baseUrl + "/deployment/api/deployments/" + deploymentId, null, Deployment.class);
  }

  public Deployment waitForCatalogDeployment(final String deploymentId, final long timeout)
      throws TimeoutException, VRAException, InterruptedException {
    final long start = System.currentTimeMillis();
    for (; ; ) {
      final Deployment dep = getCatalogDeployment(deploymentId, false);
      if (dep != null || dep.getStatus() != null) {
        if (!dep.getStatus().getValue().endsWith("_INPROGRESS")) {
          return getCatalogDeployment(deploymentId, true);
        }
      }
      final long remaining = timeout - (System.currentTimeMillis() - start);
      if (remaining <= 0) {
        throw new TimeoutException("Timeout while waiting for deployment to finish");
      }
      Thread.sleep(Math.min(remaining, deploymentPollInterval));
    }
  }

  private <R> R post(
      final String url,
      final Map<String, String> query,
      final Object request,
      final Class<R> responseClass)
      throws VRAException {
    try {
      final String content = post(url, query, gson.toJson(request));
      return gson.fromJson(content, responseClass);
    } catch (final IOException e) {
      throw new VRAException(e);
    }
  }

  private CloseableHttpClient getClient() throws VRAException {
    // TODO: Don't assume self signed is OK!
    try {
      final SSLContextBuilder builder = new SSLContextBuilder();
      builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
      final SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(builder.build());
      return HttpClients.custom().setSSLSocketFactory(sslsf).build();
    } catch (final KeyStoreException e) {
      throw new VRAException(e);
    } catch (final KeyManagementException e) {
      throw new VRAException(e);
    } catch (final NoSuchAlgorithmException e) {
      throw new VRAException(e);
    }
  }

  private String post(final String url, final Map<String, String> query, final String payload)
      throws IOException, VRAException {
    final HttpPost postRequest = new HttpPost(url + buildQuery(query));
    final StringEntity input = new StringEntity(payload);
    input.setContentType("application/json");
    postRequest.setEntity(input);
    return executeRequest(postRequest);
  }

  private String get(final String url, final Map<String, String> query)
      throws IOException, VRAException {
    final HttpGet rq = new HttpGet(url + buildQuery(query));
    return executeRequest(rq);
  }

  private String delete(final String url, final Map<String, String> query)
      throws IOException, VRAException {
    final HttpDelete rq = new HttpDelete(url + buildQuery(query));
    return executeRequest(rq);
  }

  private String executeRequest(final HttpUriRequest rq) throws IOException, VRAException {
    CloseableHttpClient client = null;
    try {
      client = getClient();
      rq.setHeader("Accept", "application/json; charset=utf-8");
      if (StringUtils.isNotBlank(refreshToken)) {
        final String authorization = "Bearer " + refreshToken;
        rq.setHeader("Authorization", authorization);
      }

      // Send and handle response
      final HttpResponse resp = client.execute(rq);
      if (resp.getStatusLine().getStatusCode() != 200) {
        throw new VRAException(resp.getStatusLine().toString() + " URL:" + rq.getURI().toString());
      }
      return readAll(resp.getEntity().getContent());
    } finally {
      if (client != null) {
        client.close();
      }
    }
  }

  public static class DateTypeAdapter extends TypeAdapter<Date> {

    private DateFormat dateFormat;

    public DateTypeAdapter() {}

    public DateTypeAdapter(final DateFormat dateFormat) {
      this.dateFormat = dateFormat;
    }

    public void setFormat(final DateFormat dateFormat) {
      this.dateFormat = dateFormat;
    }

    @Override
    public void write(final JsonWriter out, final Date date) throws IOException {
      if (date == null) {
        out.nullValue();
      } else {
        final String value;
        if (dateFormat != null) {
          value = dateFormat.format(date);
        } else {
          value = ISO8601Utils.format(date, true);
        }
        out.value(value);
      }
    }

    @Override
    public Date read(final JsonReader in) throws IOException {
      try {
        switch (in.peek()) {
          case NULL:
            in.nextNull();
            return null;
          default:
            final String date = in.nextString();
            try {
              if (dateFormat != null) {
                return dateFormat.parse(date);
              }
              return ISO8601Utils.parse(date, new ParsePosition(0));
            } catch (final ParseException e) {
              throw new JsonParseException(e);
            }
        }
      } catch (final IllegalArgumentException e) {
        throw new JsonParseException(e);
      }
    }
  }
}
