package com.mingshashan.learn.log;

/**
 * appender
 *
 * @author mingshashan
 */
public interface Appender {

    void append(LogLevel logLevel, String message);
}
