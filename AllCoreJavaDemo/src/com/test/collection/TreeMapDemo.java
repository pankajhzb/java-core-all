package com.test.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(38);
		p1.setFirstName("Pankaj");
		p1.setLastName("Kumar");

		Person p2 = new Person();
		p2.setAge(23);
		p2.setFirstName("Rahul");
		p2.setLastName("Roy");

		Person p3 = new Person();
		p3.setAge(34);
		p3.setFirstName("Satish");
		p3.setLastName("Ponna");
		
		Person p4 = new Person();
		p4.setAge(34);
		p4.setFirstName("Satish");
		p4.setLastName("Mahajan");
		
		Person p5 = new Person();
		p5.setAge(34);
		p5.setFirstName("Ramesh");
		p5.setLastName("Ponna");
		
		Person p6 = new Person();
		p6.setAge(34);
		p6.setFirstName("Saho");
		p6.setLastName("Ponna");

		TreeMap<Integer, Person> tm = new TreeMap<Integer, Person>();
		//tm.put(null, p1); // runtime fails
		tm.put(23, p2);
		tm.put(34, p3);
		tm.put(18, p1);
		tm.put(21, p2);
		tm.put(13, p3);
		tm.put(78, p1);

		System.out.println("Treemap Size : " + tm.size());
		// Default Output
		for (Map.Entry<Integer, Person> m : tm.entrySet()) {
			System.out.println(m.getKey() + "- " + m.getValue().getFirstName() + " " + m.getValue().getLastName());
		}
		
		// Output after removing the element
		tm.remove(23);
		System.out.println("After remove Treemap Size : " + tm.size());
		for (Map.Entry<Integer, Person> m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		// navigable
		 //Maintains descending order  
	      System.out.println("descendingMap: "+tm.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+tm.headMap(102,true));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+tm.tailMap(102,true));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+tm.subMap(100, false, 102, true));   
	}

}
