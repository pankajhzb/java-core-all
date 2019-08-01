package com.test.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		/**
		 * LinkedList is ordered by index position,like ArrayList, 
		 * except that the elements are doubly-linked to one another.
		 * LinkedList may iterate more slowly than an ArrayList,but its good choice when we need
		 * fast insertion and deletion.
		 */
LinkedList<String> linkedList = new LinkedList<String>();
linkedList.add("pankaj");
linkedList.add("rahul");
linkedList.add("tushar");
linkedList.addFirst("sonam");
linkedList.addLast("pranav");
linkedList.offer("ramesh");
linkedList.offerFirst("pikku");
linkedList.offerLast("nikku");
linkedList.peek();//returns the head of the list
linkedList.poll();//remove the head element
linkedList.peekFirst();
linkedList.peekLast();
linkedList.pop();
linkedList.push("Top");
linkedList.remove();//remove first element
linkedList.set(1, "Second Top");

System.out.println(linkedList.element());//the head of the list

//Descending Iterator
Iterator<String> dit = linkedList.descendingIterator();
System.out.println("Descending---");
while(dit.hasNext()){
	String s = dit.next();
	System.out.println(s);
}

//Ascending Iterator
Iterator<String> ait = linkedList.iterator();
System.out.println("Ascending---");
	while(ait.hasNext()){
		String s = ait.next();
		System.out.println(s);
	}
   }
}