package com.mingshashan.learn.log;

/**
 * filter
 */
interface Filter {
    boolean shouldLog(LogLevel level);
}
