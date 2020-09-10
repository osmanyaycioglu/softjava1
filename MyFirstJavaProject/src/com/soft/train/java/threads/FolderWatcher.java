package com.soft.train.java.threads;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FolderWatcher extends Thread {

    public static BlockingQueue<String> filesToProcess  = new ArrayBlockingQueue<>(1_000);

    public static Deque<String>         filesToProcess2 = new ArrayDeque<>();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1_000);
                // Folder a bak yeni gelenleri
                String fileName = "file" + new Random().nextInt();
                FolderWatcher.filesToProcess.add(fileName);
                fileName = "file" + new Random().nextInt();
                FolderWatcher.filesToProcess.add(fileName);
                fileName = "file" + new Random().nextInt();
                FolderWatcher.filesToProcess.add(fileName);
            } catch (Exception eLoc) {
            }
        }
    }
}
