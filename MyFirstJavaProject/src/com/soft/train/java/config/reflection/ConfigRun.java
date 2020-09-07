package com.soft.train.java.config.reflection;


public class ConfigRun {

    public static void main(final String[] args) {
        Application applicationLoc = new Application();
        TestConf confLoc = new TestConf();
        PropertyEngine engineLoc = new PropertyEngine();
        engineLoc.process(applicationLoc);
        System.out.println(applicationLoc);
        engineLoc.process(confLoc);
        System.out.println(confLoc);
    }
}
