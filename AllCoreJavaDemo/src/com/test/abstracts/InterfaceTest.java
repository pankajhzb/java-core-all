package com.test.abstracts;

public class InterfaceTest {
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.add();
		c1.sub();
		//c1.a = 20; // can't change fial variable a of iterface I1.
		System.out.println(new C1().a);
		I1 i1 = new I1(){

			@Override
			public void add() {
				//change modifier of c1 to final
				//c1.a = 20;
				System.out.println("i am at I1-add ");				
			}
			@Override
			public int sub() {
				System.out.println("i am at I1-sub ");				
				return 0;
			}
		};
		System.out.println(I1.a);
		i1.add();
		i1.sub();
		
	}
}
