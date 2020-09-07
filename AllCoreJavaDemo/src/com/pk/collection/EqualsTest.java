package com.pk.collection;

public class EqualsTest {
String s = 	"abc";
String s1 = "abc";

	public static void main(String[] args) {
		EqualsTest ob1 = new EqualsTest();
		EqualsTest ob2 = new EqualsTest();
		
		//equals() test, compares the two object values have same value.
		if(ob1.s.equals(ob2.s1));
			System.out.println("Two string litral have same value compare with equals()");
		
		//== test, Also compares the object value, without equals().
		if(ob1.s==ob2.s1);
			System.out.println("Two string litral have same value compare values with ==");
			
		//== test, compares the object reference, ie refer to the same object.
		if(ob1==ob2);
			System.out.println("Two string litral have same value compare object references with ==");
			
		Car c1 = new Car();
		Car c2 = new SportCar();
		Dog d1 = new Dog();
		//== test, compares the object , having same attributes.
		if(c1==c2);
			System.out.println("Two class have same attributes, compare with ==");
		
		if(c1.equals(c2));
			System.out.println("Two object have same attributes, compares equals()");
			
		if(c1.equals(d1));
			System.out.println("Two object have different attributes, compares equals()");
	}
}
 class Car{
	 int code = 23123;
	 String vin = "WQASED123ED";
	 String color = "blue";
 }
 
 class SportCar extends Car{
	 //test with add same attribute
	 String vin = "WQASED123ED";
 }
 
 class Dog{
	 
 }