package com.soft.train.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListPlayground {

    public static void main(final String[] args) {
        // Yanlış
        ArrayList<String> astringListLoc = new ArrayList<>();
        astringListLoc.trimToSize();

        // Doğru
        List<String> stringListLoc = new ArrayList<>();
        stringListLoc.add("str1");
        stringListLoc.add("str2");

        String stringLoc = stringListLoc.get(1);

        List<Integer> intListLoc = new ArrayList<>();
        intListLoc.add(10);
        intListLoc.add(20);
        Integer integerLoc = intListLoc.get(1);
        // listenin boyutu
        int sizeLoc = intListLoc.size();
        for (int iLoc = 0; iLoc < intListLoc.size(); iLoc++) {
            Integer integer2Loc = intListLoc.get(iLoc);
        }

        for (Integer integer2Loc : intListLoc) {

        }

        intListLoc.remove(0);

        // intListLoc.addAll(intListLoc);
        // Bunun sadece küçük listelerde kullanın
        intListLoc.contains(20);
        intListLoc.clear();


        List<Integer> testListLoc = new ArrayList<>(1_000_000);
        // List<Integer> testListLoc = new LinkedList<>();
        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10_000_000; iLoc++) {
            testListLoc.add(iLoc);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            Integer integer2Loc = testListLoc.get(iLoc);
        }
        System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            testListLoc.remove(0);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));

        List<String> stringListLoc2 = new LinkedList<>();
        List<String> stringListLoc3 = new Vector<>();

        List<Integer> synchronizedListLoc = Collections.synchronizedList(testListLoc);

        Collections.sort(testListLoc);
        Collections.sort(testListLoc,
                         new Comparator<Integer>() {

                             @Override
                             public int compare(final Integer o1Param,
                                                final Integer o2Param) {
                                 return o1Param - o2Param;
                             }
                         });
        List<Integer> unmodifiableListLoc = Collections.unmodifiableList(testListLoc);

    }
}
