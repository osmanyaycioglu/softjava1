package com.soft.train.java.java8;


public class MyInterfaceImpl implements IMyInterface {

    @Override
    public String execute(final String strParam) {
        return "Hello " + strParam;
    }

}
