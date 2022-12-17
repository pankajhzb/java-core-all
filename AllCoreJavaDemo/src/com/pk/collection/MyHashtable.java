package com.pk.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class MyHashtable {
    public static void main(String[] args) {
        // getHashtableValue();

        Hashtable<String, Double> balance = new Hashtable<String, Double>();
        Enumeration<String> names;
        String str;
        Double bal;
        balance.put("John Doe", new Double(3434.34));
        balance.put("Tom Smith", new Double(22.34));
        balance.put("Ralph Smith", new Double(-19.08));

        names = balance.keys();
        // System.out.println("names" + names.hashCode() + ","
        // + names.nextElement() + "," + names.toString() + ","
        // + names.hasMoreElements());

        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + "'s Balance is:" + balance.get(str));
        }
    }

    public static void getHashtableValue() {
        Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
        numbers.put("one", new Integer(1));
        numbers.put("two", new Integer(2));
        numbers.put("three", new Integer(3));
        // To retrieve a number, use the following code:
        Integer n = (Integer) numbers.get("two");
        if (n != null) {
            System.out.println("two = " + n);
            System.out.println("hashcode" + n.hashCode());
        }

    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

}
