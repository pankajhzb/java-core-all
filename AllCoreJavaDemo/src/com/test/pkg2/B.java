package com.test.pkg2;

import com.test.pkg1.A;

public class B extends A {
	public void getValue() {
		System.out.println("x : " + new B().x);// protected
		System.out.println("y : " + new B().y);// public

		// System.out.println("y : " + new B().u);//private not accessible
		// System.out.println("z : "+new B().z); default not accessible
		// System.out.println(new A().);//here value x not accessible of class A

		System.out.println(x);// protected
		System.out.println(y);// public
		// System.out.println(z);

		B b = (B) new A();
		A a = new B();

	}
}
