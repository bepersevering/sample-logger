package com.mingshashan.learn.log;

public class Logger {

    private final Appender appender;
    private final Filter filter;

    public Logger(Appender appender, Filter filter) {
        this.appender = appender;
        this.filter = filter;
    }

    public void log(LogLevel level, String message) {
        if (filter.shouldLog(level)) {
            appender.append(level, message);
        }
    }

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void warn(String message) {
        log(LogLevel.WARN, message);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

}
