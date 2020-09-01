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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.virtualviking.vra.jenkinsplugin.model.AuthenticationRequest;
import net.virtualviking.vra.jenkinsplugin.model.AuthenticationResponse;
import net.virtualviking.vra.jenkinsplugin.model.blueprint.Blueprint;
import net.virtualviking.vra.jenkinsplugin.model.blueprint.PageOfBlueprint;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;

public class VRAClient implements Serializable {
  private static final long serialVersionUID = -3538449737600216823L;
  private final String API_VERSION = "2019-09-12";
  private final String refreshToken;
  private final String baseUrl;
  private final Gson gson;

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

  public Blueprint getBlueprintByName(final String name) throws VRAException {
    final PageOfBlueprint page =
        get(baseUrl + "/blueprint/api/blueprints", mapOf("name", name), PageOfBlueprint.class);
    if (page.isEmpty()) {
      return null;
    }
    final List<Blueprint> content = page.getContent();
    if (content.size() != 1) {
      throw new VRAException("Expected 1 item, got " + content.size());
    }
    return content.get(0);
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

  private String post(String url, Map<String, String> query, final String payload)
      throws IOException, VRAException {
    CloseableHttpClient client = null;
    try {
      client = getClient();

      // Build request
      if (query == null) {
        query = new HashMap<>();
      }
      query.put("apiVersion", API_VERSION);
      url += buildQuery(query);
      final HttpPost postRequest = new HttpPost(url);
      final StringEntity input = new StringEntity(payload);
      input.setContentType("application/json");
      postRequest.setEntity(input);
      postRequest.setHeader("Content-Type", "application/json");
      postRequest.setHeader("Accept", "application/json; charset=utf-8");
      if (StringUtils.isNotBlank(refreshToken)) {
        final String authorization = "Bearer " + refreshToken;
        postRequest.setHeader("Authorization", authorization);
      }

      // Send and handle response
      final HttpResponse resp = client.execute(postRequest);
      if (resp.getStatusLine().getStatusCode() != 200) {
        throw new VRAException(resp.getStatusLine().toString());
      }
      return readAll(resp.getEntity().getContent());
    } finally {
      if (client != null) {
        client.close();
      }
    }
  }

  private String get(String url, Map<String, String> query) throws IOException, VRAException {
    CloseableHttpClient client = null;
    try {
      client = getClient();

      // Build request
      if (query == null) {
        query = new HashMap<>();
      }
      query.put("apiVersion", API_VERSION);
      url += buildQuery(query);
      final HttpGet postRequest = new HttpGet(url);
      postRequest.setHeader("Accept", "application/json; charset=utf-8");
      if (StringUtils.isNotBlank(refreshToken)) {
        final String authorization = "Bearer " + refreshToken;
        postRequest.setHeader("Authorization", authorization);
      }

      // Send and handle response
      final HttpResponse resp = client.execute(postRequest);
      if (resp.getStatusLine().getStatusCode() != 200) {
        throw new VRAException(resp.getStatusLine().toString());
      }
      return readAll(resp.getEntity().getContent());
    } finally {
      if (client != null) {
        client.close();
      }
    }
  }

  private String buildQuery(final Map<String, String> queries) throws UnsupportedEncodingException {
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

  private Map<String, String> mapOf(final String key, final String value) {
    final Map<String, String> map = new HashMap<>();
    map.put(key, value);
    return map;
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
