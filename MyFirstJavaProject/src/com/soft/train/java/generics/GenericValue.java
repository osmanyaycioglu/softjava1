package com.soft.train.java.generics;

import java.lang.reflect.Array;

public class GenericValue<U, R> {

    private U         value;
    private R         value2;
    private final U[] values;


    public GenericValue(final Class<U> clazzz) {
        this.values = (U[]) Array.newInstance(clazzz,
                                              10);
    }


    public U getValue() {
        return this.value;
    }

    public void setValue(final U valueParam) {
        this.value = valueParam;
    }


    public R getValue2() {
        return this.value2;
    }


    public void setValue2(final R value2Param) {
        this.value2 = value2Param;
    }


    public U[] getValues() {
        return this.values;
    }


}
