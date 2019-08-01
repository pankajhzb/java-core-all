package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapTest {
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
