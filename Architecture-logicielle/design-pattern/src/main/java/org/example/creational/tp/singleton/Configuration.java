package org.example.creational.tp.singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    private static Configuration instance;
    private Map<String, String> settings;


    private Configuration() {
        settings = new HashMap<>();
        loadDefaultSettings();
    }

    public static synchronized Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    private void loadDefaultSettings() {
        settings.put("db_url", "jdbc:mysql://localhost:3306/mydb");
        settings.put("api_key", "defaultApiKey");
        settings.put("environment", "development");
    }


    public String getSetting(String key) {
        return settings.get(key);
    }


    public void setSetting(String key, String value) {
        settings.put(key, value);
    }
}
