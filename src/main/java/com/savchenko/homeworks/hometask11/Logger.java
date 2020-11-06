package com.savchenko.homeworks.hometask11;

import org.apache.log4j.lf5.LogLevel;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Write 3 classes : Logger and children ConsoleLogger (writing to the console), FileLogger (Writing to a file).
 * They have two public methods log (String message) accepting a string and log (String message, LogLevel level)
 * Messages are printed as: 2020-10-08 21:25:07 INFO: Message to Log
 * When displaying a message, the logging level passed to the logger constructor is used by default
 */

public abstract class Logger {

    public abstract void log(String message) throws IOException;

    String getTimeStamp() {
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdt.format(new Date());
    }

    public abstract void log(LogLevel level, String message);

}

