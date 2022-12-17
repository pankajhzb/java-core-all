package com.pk.collection;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapTest {
    /**
     * @param args
     */

    public static void main(String[] args) {

        Hashtable<String, String> ht = new Hashtable<String, String>(); // synchronised
        ht.put("a", "1");
        ht.put("b", "2");
        ht.put("c", "3");
        ht.put("d", "4");
        ht.put("e", "5");
        ht.put("f", "6");
        Enumeration<String> it = ht.elements();
        ht.put("g", "7");

        while (it.hasMoreElements()) {
            System.out.println(it.nextElement());
        }

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("1", "2");
        hm.put("3", "4");
        hm.put("5", "6");
        hm.put("7", "8");
        hm.put("9", "8");
        Iterator<Entry<String, String>> myVeryOwnIterator = hm.entrySet()
                .iterator();
        hm.put("11", "12");

        while (myVeryOwnIterator.hasNext()) {
            System.out.println(myVeryOwnIterator.next());
        }

    }
}
