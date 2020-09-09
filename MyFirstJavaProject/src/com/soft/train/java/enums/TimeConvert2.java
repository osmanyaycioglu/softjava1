package com.soft.train.java.enums;


public enum TimeConvert2 {

    MILISECOND(1),
    SECOND(1000),
    MINUTE(60 * 1000),
    HOUR(60 * 60 * 1000),
    DAY(24 * 60 * 60 * 1000);


    private final int mult;

    private TimeConvert2(final int mult) {
        this.mult = mult;

    }

    public long toMilis(final long input) {
        return input * this.mult;
    }
}
