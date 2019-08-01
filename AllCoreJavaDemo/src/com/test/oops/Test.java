package com.test.oops;

public class Test extends Temp{

	private void testOverriding(){
		System.out.println("i am inside testOverriding in Class Test.");
	}
	
	public void testOverriding2(){
		System.out.println("i am inside testOverriding in Class Test.");
	}
	public static void main(String[] args) {
		Temp temp = new Temp();
		Temp testRef = new Test();
		Test test = new Test();
		
		//private method call
		//temp.testOverride // Not acceble here
		//testRef.testOverride //Not acceble here
		test.testOverriding();
		
		//public method call
		temp.testOverriding2();
		testRef.testOverriding2();
		test.testOverriding2();
		
	}

}
