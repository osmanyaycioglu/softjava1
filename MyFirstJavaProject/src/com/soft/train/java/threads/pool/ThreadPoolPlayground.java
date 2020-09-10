package com.soft.train.java.threads.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadPoolPlayground {

    public static void main(final String[] args) {
        ExecutorService newFixedThreadPoolLoc = Executors.newFixedThreadPool(10);
        //        MyRunnable myRunnableLoc = new MyRunnable();
        //        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
        //            newFixedThreadPoolLoc.execute(myRunnableLoc);
        //        }

        MyCallable callableLoc = new MyCallable();
        System.out.println(System.currentTimeMillis() + "- submit");
        Future<String> submitLoc = newFixedThreadPoolLoc.submit(callableLoc);
        System.out.println(System.currentTimeMillis() + "- extra process star");
        // Extra code
        try {
            Thread.sleep(1_000);
        } catch (Exception eLoc) {
        }
        System.out.println(System.currentTimeMillis() + "- extra process stop");
        try {
            String stringLoc = submitLoc.get();
            String string2Loc = submitLoc.get(1_000,
                                              TimeUnit.MILLISECONDS);
            if (submitLoc.isDone()) {

            }
            System.out.println(System.currentTimeMillis() + "- Sonuç : " + stringLoc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
