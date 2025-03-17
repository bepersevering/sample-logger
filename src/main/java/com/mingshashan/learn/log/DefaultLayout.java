package com.mingshashan.learn.log;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * default layout
 *
 * @author mingshashan
 */
public class DefaultLayout implements Layout {
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public String format(LogLevel logLevel, String msg) {
        return String.format("[%s]-[%s] %s", dateFormat.format(new Date()), logLevel, msg);
    }
}
