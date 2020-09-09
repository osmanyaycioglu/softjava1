package com.soft.train.java.enums;

import java.util.concurrent.TimeUnit;

public class EnumRun {

    public static void main(final String[] args) {
        EInputStates eInputStatesLoc = EInputStates.INPUT_STATE_RUNNING;
        eInputStatesLoc.check();
        System.out.println(TimeConvert.MINUTE.toMilis(15));
        System.out.println(TimeConvert2.MINUTE.toMilis(15));

        System.out.println(TimeUnit.MINUTES.toMillis(15));
        System.out.println(TimeUnit.MILLISECONDS.convert(15,
                                                         TimeUnit.MINUTES));
    }
}
