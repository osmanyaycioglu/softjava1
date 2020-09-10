package com.soft.train.java.patterns.singleton;


public class MySingletonLazy {

    private static volatile MySingletonLazy instance;

    private MySingletonLazy() {
    }

    public static MySingletonLazy getInstance() {
        if (MySingletonLazy.instance == null) {
            synchronized (MySingletonLazy.class) {
                if (MySingletonLazy.instance == null) {
                    MySingletonLazy.instance = new MySingletonLazy();
                }
            }
        }
        return MySingletonLazy.instance;
    }

}
