package com.magnet;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateFormatter {
  private static final String ISO8601_DATE_FORMATTER = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
  public static final SimpleDateFormat
          ISO860_FORMATTER = new SimpleDateFormat(ISO8601_DATE_FORMATTER, Locale.US);
}
