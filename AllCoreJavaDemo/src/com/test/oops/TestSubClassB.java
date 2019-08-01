package com.test.oops;

public class TestSubClassB extends TestClassA{
	int a ;
	int b = 9;
	String str = "aaisha";
	TestClassA testClassA = null;
	
	TestSubClassB(){
		System.out.println("I am at TestSubClassB");
	}
	public int getIntValue(){
		return a;
	}
	
	public static void main(String[] args){
	new TestSubClassB();	
	new TestClassA();
	}
}
