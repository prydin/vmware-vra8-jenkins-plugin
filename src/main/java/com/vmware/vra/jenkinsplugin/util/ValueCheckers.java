package com.vmware.vra.jenkinsplugin.util;

import com.vmware.vra.jenkinsplugin.vra.VRAException;

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
