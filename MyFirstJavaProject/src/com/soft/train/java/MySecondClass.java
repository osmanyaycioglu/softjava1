package com.soft.train.java;


public class MySecondClass {

    private final String name = "osman";
    private final int    age  = 50;


    public MySecondClass() {
    }

    public void take(final String stringParam) {
        String tempRef = stringParam;
        String concatLoc = tempRef.concat(" test");
        System.out.println(concatLoc);
    }

}
