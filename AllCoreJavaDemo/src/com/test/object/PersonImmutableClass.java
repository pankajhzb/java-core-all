package com.test.object;

/**
 * What is Immutable Objects? 
 * Immutable Objects are those objects whose state( or value )
 * cannot be changed once it is created. This type of object is useful in
 * concurrent applications because it can not change its state so it cannot be
 * corrupted by any thread. In java, String objects are immutable. We can also
 * create our own immutable objects.
 */

/**
 * Strategy To Create Immutable Class In Java .
 * 1. Make all fields final and private. 
 * 2. Do not provide setter method that can modify the fields’ value. 
 * 3. Do not allow subclasses to override methods i.e. create final class. 
 * 4. If instance field has references to mutable objects then do not allow changing those objects.
 */
final public class PersonImmutableClass {
	final private int height;
	final private int weight;
	final private String name;

	public PersonImmutableClass(int height, int weight, String name) {
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}
}
