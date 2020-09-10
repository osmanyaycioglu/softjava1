package com.soft.train.java.threads.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Runner {

    public static void main(final String[] args) {
        List<String> stringsLoc = new CopyOnWriteArrayList<>();
        AddToCollection addToCollectionLoc = new AddToCollection(stringsLoc);
        addToCollectionLoc.start();
        GetCollection collectionLoc = new GetCollection(stringsLoc);
        collectionLoc.start();
    }
}
