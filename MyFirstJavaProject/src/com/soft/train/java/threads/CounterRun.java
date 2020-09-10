package com.soft.train.java.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CounterRun {

    public static long counter = 0;

    public static synchronized void increase() {
        CounterRun.counter++;
    }

    public static long get() {
        synchronized (CounterRun.class) {
            return CounterRun.counter;
        }
    }


    public static AtomicLong    atomicCounter = new AtomicLong();

    public static ReentrantLock rl            = new ReentrantLock();

    public static void increaseLock() {
        try {
            CounterRun.rl.lock();
            //            boolean tryLockLoc = CounterRun.rl.tryLock(100,
            //                                                       TimeUnit.MILLISECONDS);

            CounterRun.counter++;
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            CounterRun.rl.unlock();
        }
    }

    public static long getLock() {
        try {
            CounterRun.rl.lock();
            return CounterRun.counter;
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            CounterRun.rl.unlock();
        }
        return CounterRun.counter;
    }

    public static ReentrantReadWriteLock rwrl = new ReentrantReadWriteLock();

    public static void increaseRWLock() {
        try {
            CounterRun.rwrl.writeLock()
                           .lock();
            //            boolean tryLockLoc = CounterRun.rl.tryLock(100,
            //                                                       TimeUnit.MILLISECONDS);

            CounterRun.counter++;
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            CounterRun.rwrl.writeLock()
                           .unlock();
        }
    }

    public static long getRWLock() {
        try {
            CounterRun.rwrl.readLock()
                           .lock();
            return CounterRun.counter;
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            CounterRun.rwrl.readLock()
                           .unlock();
        }
        return CounterRun.counter;
    }


    public static void main(final String[] args) {
        CounterThread[] counterThreadLoc = new CounterThread[10];
        CountDownLatch cdl = new CountDownLatch(10);
        Semaphore semaphoreLoc = new Semaphore(3);
        try {
            semaphoreLoc.acquire();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            counterThreadLoc[iLoc] = new CounterThread(iLoc,
                                                       cdl);
            counterThreadLoc[iLoc].start();
        }
        try {
            cdl.await();
        } catch (InterruptedException e) {
        }
        long totalCounter = 0;
        for (CounterThread counterThread2Loc : counterThreadLoc) {
            totalCounter += counterThread2Loc.getLocalCounter();
        }
        System.out.println("Sonuç : " + totalCounter);
        System.out.println("Atomic Sonuç : " + CounterRun.atomicCounter.get());
    }
}
