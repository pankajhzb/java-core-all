package com.test.oops;

public class Temp {
public int id;
private int id2;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getId2() {
	return id2;
}
public void setId2(int id2) {
	this.id2 = id2;
}
private void testOverriding(){
	System.out.println("i am inside testOverriding in Class Test.");
}
public void testOverriding2(){
	System.out.println("i am inside testOverriding2 in Class Test.");
}
}
