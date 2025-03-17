package com.mingshashan.learn.log;

import java.io.FileWriter;
import java.io.IOException;

/**
 * console appender
 *
 * @author mingshashan
 */
public class FileAppender implements Appender {

    private final Layout layout;

    private final String filePath;

    public FileAppender(Layout layout, String filePath) {
        this.layout = layout;
        this.filePath = filePath;
    }


    @Override
    public void append(LogLevel logLevel, String message) {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(layout.format(logLevel, message));
            fileWriter.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
