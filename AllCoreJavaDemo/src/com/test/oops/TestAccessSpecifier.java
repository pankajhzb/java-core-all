package com.test.oops;

public class TestAccessSpecifier {
	public static void main(String[] args) {
Temp t = new Temp() ;
t.setId(5);
t.setId2(8);

System.out.println(t.getId());
System.out.println(t.getId2());
t.id = 10;
//t.id2 = 20; specifier - private

	}

}
