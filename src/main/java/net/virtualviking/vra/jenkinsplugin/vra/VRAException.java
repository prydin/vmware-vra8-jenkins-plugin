package net.virtualviking.vra.jenkinsplugin.vra;

public class VRAException extends Exception {
    private static final long serialVersionUID = -8737312817686320611L;

    public VRAException() {
    super();
  }

  public VRAException(final String message) {
    super(message);
  }

  public VRAException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public VRAException(final Throwable cause) {
    super(cause);
  }

  protected VRAException(
          final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
