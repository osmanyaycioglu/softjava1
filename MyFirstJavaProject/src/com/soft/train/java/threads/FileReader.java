package com.soft.train.java.threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FileReader extends Thread {

    public static BlockingQueue<String> linesToProcess = new ArrayBlockingQueue<>(1_000_000);


    public FileReader() {
        this.setName("FileReader");
    }

    @Override
    public void run() {
        while (true) {
            try {
                String pollLoc = FolderWatcher.filesToProcess.take();
                // Read file line by line
                for (int iLoc = 0; iLoc < 10_000; iLoc++) {
                    FileReader.linesToProcess.add("line" + new Random().nextInt());
                }
            } catch (Exception eLoc) {
            }
        }
    }
}
