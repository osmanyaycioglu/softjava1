package com.soft.train.java.generics;

import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

public class GenericUsage {

    public static void main(final String[] args) {
        StringValue stringValueLoc = new StringValue();
        stringValueLoc.setValue("str1");
        String valueLoc = stringValueLoc.getValue();

        ObjectValue genericValueLoc = new ObjectValue();
        genericValueLoc.setValue("str2");
        genericValueLoc.setValue(new Date());
        String value2Loc = (String) genericValueLoc.getValue();
        System.out.println(value2Loc);


        ValueHolder<Double> holderLoc = new ValueHolder<>();
        holderLoc.setValue(100D);
        Double value7Loc = holderLoc.getValue();

        ValueHolder<Integer> intHolderLoc = new ValueHolder<>();
        intHolderLoc.setValue(10);
        Integer value6Loc = intHolderLoc.getValue();

        GenericValue<String, Integer> sgv = new GenericValue<>(String.class);
        sgv.setValue("str3");
        String value3Loc = sgv.getValue();

        GenericValue<BigInteger, Date> bgv = new GenericValue<>(BigInteger.class);
        bgv.setValue(BigInteger.TEN);
        BigInteger value4Loc = bgv.getValue();

        GenericValue<Date, GregorianCalendar> dgv = new GenericValue<>(Date.class);
        dgv.setValue(new Date());
        Date value5Loc = dgv.getValue();
        dgv.setValue2(new GregorianCalendar());

    }

}
