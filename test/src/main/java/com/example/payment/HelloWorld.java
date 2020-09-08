package com.example.payment;

import java.util.logging.Logger;

public class HelloWorld {

    public static void runme() {
        System.out.println("runme çalıştı");
    }

    public static void main(final String... args) {
        Logger logger = Logger.getLogger(HelloWorld.class.getName());
        logger.info("This is a Hello World!");
    }
}
