package com.soft.train.java.threads;

public class LineProcessThread extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                String pollLoc = FileReader.linesToProcess.take();
                // Line process
            } catch (Exception eLoc) {
            }
        }
    }
}
