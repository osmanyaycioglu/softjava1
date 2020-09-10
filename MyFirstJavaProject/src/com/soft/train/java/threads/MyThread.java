package com.soft.train.java.threads;


public class MyThread extends Thread {

    private boolean run = true;

    @Override
    public void run() {
        while (this.run) {
            try {
                System.out.println("Thread start");
                for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
                    System.out.println("Hello world");
                }
                if (this.isInterrupted()) {
                    return;
                }
            } catch (Exception eLoc) {
                eLoc.printStackTrace();
            }
        }
    }

    public boolean isRun() {
        return this.run;
    }

    public void setRun(final boolean runParam) {
        this.run = runParam;
    }


}
