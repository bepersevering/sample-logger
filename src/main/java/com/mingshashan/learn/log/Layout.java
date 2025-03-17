package com.mingshashan.learn.log;

/**
 * layout
 */
public interface Layout {

    /**
     * format
     *
     * @param logLevel
     * @param msg
     * @return
     */
    String format(LogLevel logLevel, String msg);

}
