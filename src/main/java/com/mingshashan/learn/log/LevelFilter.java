package com.mingshashan.learn.log;

class LevelFilter implements Filter {
    private final LogLevel minLevel;
    public LevelFilter(LogLevel minLevel) {
        this.minLevel = minLevel;
    }

    @Override
    public boolean shouldLog(LogLevel level) {
        return level.ordinal() >= minLevel.ordinal();
    }
}
