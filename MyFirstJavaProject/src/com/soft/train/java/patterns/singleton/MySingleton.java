package com.soft.train.java.patterns.singleton;


public class MySingleton {

    private static MySingleton instance = new MySingleton();

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        return MySingleton.instance;
    }

}
