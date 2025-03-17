package com.mingshashan.learn.log;

/**
 * console appender
 *
 * @author mingshashan
 */
public class ConsoleAppender implements Appender {

    private final Layout layout;

    public ConsoleAppender(Layout layout) {
        this.layout = layout;
    }


    @Override
    public void append(LogLevel logLevel, String message) {
        System.out.println(layout.format(logLevel, message));
    }
}
