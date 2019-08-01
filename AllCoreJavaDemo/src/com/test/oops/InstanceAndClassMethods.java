package com.test.oops;

class A {
	public static  void getValue(int a){
		System.out.println("i am at A value is--->>"+a);
	}
	public void getPosition(){
		System.out.println("Hi,i am at A");
	}
}
class B extends A{
	public static  void getValue(int a){
		System.out.println("i am at B value is--->>"+a);
	}
	public void getPosition(){
		System.out.println("Hi,i am at B");
	}
}
public class InstanceAndClassMethods {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A a1 = b;
		a1.getPosition();//op- i am at B
		
		//B b1 = (B) a; // op class cast exception
		//b1.getPosition();
		
		B b2 = (B)a1; 
		b2.getPosition();//op- I am at B
	}
	
}
