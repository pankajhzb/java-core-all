package com.pk.collection;
/**
 * Comparable example 
 * Arrays
 * Collections
 */
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Arrays;
import java.util.Collections;

public class ComparableTesting {

	public static void main(String[] args) {

		ArrayList<Person> personList = new ArrayList<Person>();
		
		Person[] persons = new Person[4];

		persons[0] = new Person(); 
		persons[0].setFirstName("Pankaj");
		persons[0].setLastName("Yadav");
		persons[0].setAge(31);
		personList.add(persons[0]);
		
		persons[3] = new Person();
		persons[3].setFirstName("Vishal");
		persons[3].setLastName("Sukla");
		persons[3].setAge(29);
		personList.add(persons[3]);
		
		persons[1] = new Person();
		persons[1].setFirstName("Rakesh");
		persons[1].setLastName("Tripathi");
		persons[1].setAge(34);
		personList.add(persons[1]);
		
		persons[2] = new Person();
		persons[2].setFirstName("Sheezan");
		persons[2].setLastName("Sadar");
		persons[2].setAge(33);
		personList.add(persons[2]);
		
		System.out.println("Natural Order");

		for (int i = 0; i < 4; i++) {
			Person person = personList.get(i);
			String lastName = person.getLastName();
			String firstName = person.getFirstName();
			int age = person.getAge();
			System.out.println(lastName + ", " + firstName + ". Age:" + age);
		}
		String[] persons1 = {"pankaj", "vishal", "sheezan", "rakesh"};
		
		//Arrays.sort sorts the java primitive and string type, NOT user defined generic types.
		Arrays.sort(persons1);
		//Now person list is
		System.out.println(persons1[0]);
		System.out.println(persons1[1]);
		System.out.println(persons1[2]);
		System.out.println(persons1[3]);
		
		//Sort the generic type personList
		Collections.sort(personList ,Person.LastNameComparator);
		
		
		//System.out.println("Sorted by age");
		System.out.println("Sorted by last name");

		for (int i = 0; i < 4; i++) {
			//use when consider as Arrays
//			Person person = persons[i];
//			String lastName = person.getLastName();
//			String firstName = person.getFirstName();
//			int age = person.getAge();
			
			Person person = personList.get(i);
			String lastName = person.getLastName();
			String firstName = person.getFirstName();
			int age = person.getAge();
			
			System.out.println(lastName + ", " + firstName + ". Age:" + age);

		}
	}
}
