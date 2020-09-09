package com.soft.train.java.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPlayground {

    public static void main(final String[] args) {
        // Set<String> mySetLoc = new HashSet<>();
        Set<String> mySetLoc = new TreeSet<>();
        mySetLoc.add("TEST1");
        mySetLoc.add("TEST1");
        mySetLoc.add("TEST1");
        mySetLoc.add("TEST1");
        mySetLoc.add("TEST8");
        mySetLoc.add("TEST2");
        for (String stringLoc : mySetLoc) {
            System.out.println(stringLoc);
        }
        Set<MyCollectionObj> setLoc2 = new HashSet<>();


        Set<String> mySetLoc2 = new HashSet<>();
        mySetLoc2.add("TEST1");
        mySetLoc2.add("TEST2");
        mySetLoc2.add("TEST3");
        mySetLoc2.add("TEST4");
        mySetLoc2.add("TEST5");
        mySetLoc2.add("TEST6");

        mySetLoc.addAll(mySetLoc2);
        for (String stringLoc : mySetLoc) {
            System.out.println("Sonuç : " + stringLoc);
        }


        MyCollectionObj collectionObjLoc = new MyCollectionObj();
        collectionObjLoc.setIntValue(10);
        collectionObjLoc.setStrValue("osman");
        setLoc2.add(collectionObjLoc);

        MyCollectionObj collectionObjLoc2 = new MyCollectionObj();
        collectionObjLoc2.setIntValue(10);
        collectionObjLoc2.setStrValue("osman");
        setLoc2.add(collectionObjLoc2);

        MyCollectionObj collectionObjLoc3 = new MyCollectionObj();
        collectionObjLoc3.setIntValue(10);
        collectionObjLoc3.setStrValue("osman");
        setLoc2.add(collectionObjLoc3);

        for (MyCollectionObj myCollectionObjLoc : setLoc2) {
            System.out.println(myCollectionObjLoc);
        }

    }
}
