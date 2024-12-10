package org.example.creational.tp.singleton;

public class Demo {
    public static void main(String[] args) {

        Configuration config1 = Configuration.getInstance();

        System.out.println("DB URL: " + config1.getSetting("db_url"));


        config1.setSetting("api_key", "newApiKey123");

        Configuration config2 = Configuration.getInstance();

        System.out.println("API Key (config1): " + config1.getSetting("api_key"));
        System.out.println("API Key (config2): " + config2.getSetting("api_key"));

        System.out.println("Same instance? " + (config1 == config2));
    }
}
