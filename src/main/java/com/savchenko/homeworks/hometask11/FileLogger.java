package com.savchenko.homeworks.hometask11;

import java.io.*;

public class FileLogger extends Logger {

    @java.lang.Override
    public void log(String message) throws IOException {
        try (Writer fwNew = new FileWriter("My_Loggers.txt",true)) {
            fwNew.write(getTimeStamp()+ ":" + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void log(LogLevel level, String message) {
        try (Writer fwWriter = new FileWriter("My_loggers_Levels.txt", true)) {
            fwWriter.write(getTimeStamp() + " " + level + ":" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
