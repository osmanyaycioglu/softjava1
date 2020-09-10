package com.soft.train.java.threads;

import java.util.concurrent.CountDownLatch;

public class CounterThread extends Thread {

    private final int            threadIndex;
    private long                 localCounter;
    private final CountDownLatch cdl;

    public CounterThread(final int threadIndexParam,
                         final CountDownLatch cdlParam) {
        super();
        this.threadIndex = threadIndexParam;
        this.cdl = cdlParam;
    }


    @Override
    public void run() {
        for (int iLoc = 0; iLoc < 30_000_000; iLoc++) {
            // CounterRun.counter++;
            // CounterRun.increase();
            //this.localCounter++;
            //            if ((this.localCounter % 1_000_000) == 0) {
            //                try {
            //                    Thread.sleep(300);
            //                } catch (Exception eLoc) {
            //                }
            //            }
            CounterRun.atomicCounter.incrementAndGet();
        }
        System.out.println("Thread " + this.threadIndex + " bitti.");
        this.cdl.countDown();
    }


    public long getLocalCounter() {
        return this.localCounter;
    }


    public void setLocalCounter(final long localCounterParam) {
        this.localCounter = localCounterParam;
    }
}
