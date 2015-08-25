package com.magnet;

public class MagnetServiceException extends Exception {
  private int code;

  public MagnetServiceException() {
  }

  public MagnetServiceException(int code) {
    this.code = code;
  }

  public MagnetServiceException(String message) {
    this(message, 0);
  }

  public MagnetServiceException(String message, int code) {
    this(message, null, code);
  }

  public MagnetServiceException(String message, Throwable cause) {
    this(message, cause, 0);
  }

  public MagnetServiceException(String message, Throwable cause, int code) {
    super(message, cause);
    this.code = code;
  }

  public MagnetServiceException(Throwable cause) {
    this(cause, 0);
  }

  public MagnetServiceException(Throwable cause, int code) {
    this(null, cause, code);
  }

  public int getCode() {
    return code;
  }
}
