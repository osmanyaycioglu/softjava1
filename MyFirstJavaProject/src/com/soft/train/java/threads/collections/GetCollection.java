package com.soft.train.java.threads.collections;

import java.util.List;

public class GetCollection extends Thread {

    private final List<String> strList;


    public GetCollection(final List<String> strListParam) {
        super();
        this.strList = strListParam;
    }


    @Override
    public void run() {
        for (String stringLoc : this.strList) {
            System.out.println(stringLoc);
        }
    }
}
