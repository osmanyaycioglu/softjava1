package com.soft.train.java.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigMain {

    public static void main(final String[] args) {
        try {
            Properties propertiesLoc = new Properties();
            File fileLoc = new File("myconf.properties");
            FileInputStream inputStream = new FileInputStream(fileLoc);
            propertiesLoc.load(inputStream);
            Application applicationLoc = new Application();
            String appNameLoc = propertiesLoc.getProperty("app.name");
            applicationLoc.setName(appNameLoc);
            int testCountLoc = Integer.parseInt(propertiesLoc.getProperty("app.test.count"));
            applicationLoc.setTestCount(testCountLoc);
            long thresholdLoc = Long.parseLong(propertiesLoc.getProperty("app.threshold"));
            applicationLoc.setThreshold(thresholdLoc);
            System.out.println(applicationLoc);
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }

    }
}
