package com.mingshashan.learn.log;

public class SimpleLoggerTest {
    public static void main(String[] args) {
        Layout layout = new DefaultLayout();
        Appender consoleAppender = new ConsoleAppender(layout);
        Appender fileAppender = new FileAppender(layout, "simple-logger.log");
        Filter filter = new LevelFilter(LogLevel.INFO);

        Logger logger = new Logger(consoleAppender, filter);
        Logger fileLogger = new Logger(fileAppender, filter);

        logger.debug("This is a debug message (won't be logged)");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");

        fileLogger.info("This info message is logged in file");
        fileLogger.info("This info message is logged in file");
        fileLogger.error("This error message is logged in file");
    }
}