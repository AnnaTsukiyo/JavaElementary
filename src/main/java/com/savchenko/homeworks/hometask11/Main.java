package com.savchenko.homeworks.hometask11;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        Logger logCons = new ConsoleLogger();
        Logger logFile = new FileLogger();
        logCons.log("First console Log");
        logFile.log("First file Log");
        logCons.log(LogLevel.INFO,"First console message with the LogLevel");
        logFile.log(LogLevel.INFO, "First file log message with the LogLevel");

        Thread.sleep(3000);
        logCons.log("Second console Log");
        logFile.log("Second file Log");
        logCons.log(LogLevel.INFO,"Second console message with the LogLevel");
        logFile.log(LogLevel.INFO,"Second console message with the LogLevel");

    }
}
