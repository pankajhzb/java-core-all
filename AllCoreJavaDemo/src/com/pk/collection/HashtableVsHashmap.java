package com.pk.collection;
/**
 * Difference between Hashtable and HashMap
 * 1.Thread safe or Synchronized : 		Hashtable is synchronized
 * 2.Null Values : 				   		Hashtable can't accept null value as a key
 * 3.Insertion Order : 			   		Hashtable maintain the insertion order
 * 4.Iterator and Enumerator context :  Hashtable can change the Iterator
 */

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableVsHashmap {
    public static void main(String[] args) {
        //Hashtable Integer,String
        System.out.println("Hashtable<Integer ,String>_________________________________");
        Hashtable<Integer, String> hs = new Hashtable<Integer, String>();
        hs.put(1, "manju");
        hs.put(3, "jitu");
        hs.put(2, "guddi");
        //for unique key ,need to override hashCode() and equals() methods
        hs.put(4, "pawan");
        hs.put(4, "anju");
        //here for taking null as an key in hashtable is not
        //Permissible,so runtime exception will come.

        //hs.put(null, "Value not available");
        //if assigned repeated key
        System.out.println("Hashtable Value:" + hs.get(4));
        //Retrieving values of hashtable,maintain as a key

        System.out.println("Hashtable values : " + hs);
        System.out.println("Hashtable<String ,String>_________________________________");
        //Hashtable String,String
        Hashtable<String, String> hss = new Hashtable<String, String>();
        hss.put("abc", "manju");
        hss.put("lmn", "anju");
        hss.put("def", "jitu");
        hss.put("ijk", "guddi");
        //for unique key ,need to override hashCode() and equals() methods
        hss.put("lmn", "pawan");
        //here for taking null as an key in hashtable is not
        //Permissible,so runtime exception will come.

        //hss.put(null, "Value not available");
        //if assigned repeated key
        System.out.println("Hashtable Value:" + hss.get("lmn"));
        //Retrieving values of Hashtable,maintain oder as a key
        System.out.println("Hashtable values : " + hss);

        //HashMap
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("pankaj", 14785);
        hm.put("guddi", 14787);
        hm.put("anju", 1245);
        hm.put("pawan", 4567);
        hm.put("jitu", 0231);
        hm.put("jitu", 564123);

        //hashmap can have null key,if more than one key last
        //null key will be access.

        hm.put(null, 1390);
        hm.put(null, 1490);

        int d = hm.get("pankaj");
        int nulvalue = hm.get(null);
        System.out.println("value:" + d);
        System.out.println("Null value:" + nulvalue);

        System.out.println("HashMap Values :" + hm);

    }

}
