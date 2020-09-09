package com.soft.train.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPlayground {

    public static void main(final String[] args) {
        Map<String, MyCollectionObj> mapLoc = new HashMap<>();
        mapLoc.put("osman1",
                   new MyCollectionObj("abc",
                                       100));
        mapLoc.put("osman2",
                   new MyCollectionObj("abc",
                                       100));
        mapLoc.put("osman1",
                   new MyCollectionObj("abc",
                                       101));

        MyCollectionObj myCollectionObjLoc1 = mapLoc.get("osman1");
        MyCollectionObj myCollectionObjLoc2 = mapLoc.get("deney");

        Set<String> keySetLoc = mapLoc.keySet();
        for (String stringLoc : keySetLoc) {
            MyCollectionObj myCollectionObjLoc = mapLoc.get(stringLoc);
            System.out.println(myCollectionObjLoc);
        }

        Collection<MyCollectionObj> valuesLoc = mapLoc.values();
        for (MyCollectionObj myCollectionObjLoc : valuesLoc) {
            System.out.println("from values : " + myCollectionObjLoc);
        }

        Set<Entry<String, MyCollectionObj>> entrySetLoc = mapLoc.entrySet();
        for (Entry<String, MyCollectionObj> entryLoc : entrySetLoc) {
            String keyLoc = entryLoc.getKey();
            MyCollectionObj valueLoc = entryLoc.getValue();

        }
    }
}
