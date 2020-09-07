package com.pk.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashmapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		HashMap<String, Integer> hm3 = new HashMap<String, Integer>();
		
		hm.put("pankaj", 14785);
		hm.put("balendra", 14787);
		//hm.clear();
		System.out.println("containsKey :"+hm.containsKey("pankaj"));
		System.out.println("containsKey(\"mohan\") :"+hm.containsKey("mohan"));
		System.out.println("containsValue(14785) :"+hm.containsValue(14785));
		System.out.println("entrySet:"+hm.entrySet());
		System.out.println(hm.get("mohan"));
		System.out.println("hashCode :"+hm.hashCode());
		System.out.println("isEmpty :"+hm.isEmpty());
		System.out.println("keySet :"+hm.keySet());
		hm.remove("pankaj");
		hm.remove("mohan");
		System.out.println("now size :"+hm.size());
		System.out.println("toString :"+hm.toString());
		System.out.println("values :"+hm.values());
		
		//
		hm2.put("sonam", 12345);
		hm2.put("aashish", 654321);
		hm2.put("ayush", 897654);
		hm2.put("soni", 345633);
		
		//
		hm3.put("pankaj", 14785);
		hm3.put("balendra", 14787);
		System.out.println("equals :"+hm.equals(hm3));
		hm.putAll(hm2);
		System.out.println("now size :"+hm.size());
		System.out.println("value " + hm.get("pankaj"));
		System.out.println("value " + hm.get("sonam"));
		
		//check Iterator is available direct from in list ref, but not in hash map
		List<String> l  =  new ArrayList<String>();
		l.iterator();
		
		//get iterator from enumeration
		
		
		
		//iterate by using keys
		Set<String> hmkey = hm.keySet();
		Iterator<String> it = hmkey.iterator();
		while(it.hasNext()){
			//Map.Entry<K, V> element = (Entry<K, V>)it.next();
			System.out.println(hm.get(it.next()));
		}
		
		//iterate by using values
		Set<Entry<String, Integer>> hmentrykey = hm.entrySet();
		Iterator<Entry<String, Integer>> it2 = hmentrykey.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
			System.out.println(it2.next().getValue());
		}
	}
}
