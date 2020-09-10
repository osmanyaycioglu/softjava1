package com.soft.train.java.threads.collections;

import java.util.List;

public class AddToCollection extends Thread {

    private final List<String> strList;


    public AddToCollection(final List<String> strListParam) {
        super();
        this.strList = strListParam;
    }


    @Override
    public void run() {
        for (int iLoc = 0; iLoc < 100; iLoc++) {
            this.strList.add("str" + iLoc);
        }
    }
}
