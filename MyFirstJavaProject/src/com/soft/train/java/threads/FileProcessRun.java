package com.soft.train.java.threads;


public class FileProcessRun {

    public static void main(final String[] args) {
        FolderWatcher folderWatcherLoc = new FolderWatcher();
        folderWatcherLoc.start();
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            FileReader fileReaderLoc = new FileReader();
            fileReaderLoc.start();
        }

        for (int iLoc = 0; iLoc < 256; iLoc++) {
            LineProcessThread lineProcessThreadLoc = new LineProcessThread();
            lineProcessThreadLoc.start();
        }

    }
}
