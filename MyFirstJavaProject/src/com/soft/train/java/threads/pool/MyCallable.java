package com.soft.train.java.threads.pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(1_000);
        } catch (Exception eLoc) {
        }
        return "Hello world";
    }

}
