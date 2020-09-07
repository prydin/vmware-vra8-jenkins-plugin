package net.virtualviking.vra.jenkinsplugin.testutils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileUtils {
  private static final int BUFSIZE = 8192;

  public static String loadResource(final String name) throws IOException {
    try (final Reader rdr = new InputStreamReader(FileUtils.class.getResourceAsStream(name))) {
      final char[] buffer = new char[BUFSIZE];
      int n;
      final StringBuilder sb = new StringBuilder(BUFSIZE * 2);
      while ((n = rdr.read(buffer)) > 0) {
        sb.append(buffer, 0, n);
      }
      return sb.toString();
    }
  }
}
