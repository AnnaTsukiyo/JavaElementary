package com.savchenko.homeworks.hometask11;


public class ConsoleLogger extends Logger {

    @java.lang.Override
    public void log(String message) {
        System.out.println(getTimeStamp() + " : " + message);
    }

    @Override
    public void log(LogLevel level, String message) {
        System.out.println(getTimeStamp() + " " + level + ": " + message);
    }
}
