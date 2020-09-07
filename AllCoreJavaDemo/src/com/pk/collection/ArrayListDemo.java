package com.pk.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// A Vector defaults to doubling the size of its array,
		// while the ArrayList increases its array size by 50 percent.

		// Polymorfic initialisation list reference
		// if required this list can be set to other collection object

//create a list
		final List<Object> list = new ArrayList<Object>(12);// check final

//add all type, premitive and object
		list.add("pankaj");
		list.add(10);
//list.add(new Emp(20));
//list.add(new Emp(30));
//list.add(10, "mohan");
		list.addAll(list);
//list.clear();
		list.contains("pankaj");
		list.containsAll(list);
		list.equals(list);
//list.get(10);
		list.indexOf(list);
		list.isEmpty();
		list.lastIndexOf("pankaj");
		list.remove(1);
		list.remove("pankaj");
		list.removeAll(list);
		list.retainAll(list);
//list.set(9, "sonam");
		list.size();
//list.subList(2, 10);
		list.toArray();
		list.toArray(new String[list.size()]);
		list.toString();

//clears the list
//lis.clear();

//allows sequential access to the element
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) { // return true if the collection has element left
								// to return
			Object o = (Object) it.next();// move the cursor to the next element
			if (o instanceof Emp) {
			}
			// new Emp().getAge(); // if getter / setter defined
			System.out.println("List Value:" + o.toString());
		}

//Using listiterator
//ListIterator<Object> listIterator = list.listIterator<Object>();

//Create a ArrayList.
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("rahul".equals("rahu") ? "ok" : "not ok");
		arrList.add("sunil");
		arrList.add("dk");

//allows sequential access to the element
		Iterator<String> i2 = arrList.iterator();
		while (i2.hasNext()) {
			String s = i2.next();
			// return as the insertion order
			System.out.println("ArrayList value:" + s);
		}
	}
}
