package com.soft.train.java.threads;


public class ThreadRun {

    public static void main(final String[] args) {
        MyThread myThreadLoc = new MyThread();
        myThreadLoc.start();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            System.out.println("main method");
        }
    }
}
