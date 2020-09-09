package com.soft.train.java.generics;


public class ValueHolder<T> {

    private T value;


    public T getValue() {
        return this.value;
    }


    public void setValue(final T valueParam) {
        this.value = valueParam;
    }


}
