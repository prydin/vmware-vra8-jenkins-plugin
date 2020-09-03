package net.virtualviking.vra.jenkinsplugin.util;

import net.virtualviking.vra.jenkinsplugin.vra.VRAException;

public class ValueCheckers {
  public static <T> T notNull(final T value, final String property) throws VRAException {
    if (value == null) {
      throw new VRAException(property + " must not be null");
    }
    return value;
  }

  public static String notBlank(final String value, final String property) throws VRAException {
    if (value == null) {
      throw new VRAException(property + " must not be null");
    }
    return value;
  }
}
