package com.savchenko.lectures.lesson10;

public class ConfigurationManager {

    private static final String DB_URL = "db_url";
    private static final String DB_PORT = "db_port";
    private static final ConfigurationManager INSTANCE = new ConfigurationManager();

    private ConfigurationManager() {

    }

    public static ConfigurationManager getINSTANCE() {
        return INSTANCE;
    }

    public  String getDbPort() {
        return getValeOrDefault(DB_PORT, "3306");
    }

    public  String getDUrl() {
        return getValeOrDefault(DB_URL, "localhost");
    }

    private  String getValeOrDefault(String name, String defaultValue) {
        return System.getenv(name) == null ? defaultValue : System.getenv(name);
    }
}

