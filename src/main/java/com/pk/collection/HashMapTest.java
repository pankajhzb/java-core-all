package com.pk.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] agrs) {
        updateHashMapValueOnSameKey();
    }

    public static void updateHashMapValueOnSameKey() {
        HashMap hm = new HashMap();
        hm.put("apple", 3);
        hm.put("banana", 4);
        hm.put("orange", 5);

        int applevalue = (int) hm.get("apple");
        hm.put("apple", applevalue + 4);

        System.out.println(hm);

    }

    public void getHashmap() {
        HashMap<String, Double> hm = new HashMap<String, Double>();
        // put element to the map
        hm.put("John Doe", new Double(3434.25));
        // get a set of the entries
        Set<Entry<String, Double>> set = hm.entrySet();
        // get an iterator
        Iterator<Entry<String, Double>> i = set.iterator();
        // display elements
        while (i.hasNext()) {
            Map.Entry<String, Double> me = (Map.Entry<String, Double>) i.next();
            System.out.println(me.getKey() + ":" + me.getValue());
        }
        // deposit 1000 into jhon doe's account
        Double balance = (Double) hm.get("John Doe").doubleValue();
        hm.put("John Doe", new Double(balance + 1000));
        System.out.println("John Doe's new balance is:" + hm.get("John Doe"));

    }

}
