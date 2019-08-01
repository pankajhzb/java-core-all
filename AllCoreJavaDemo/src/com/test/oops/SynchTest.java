package com.test.oops;

public class SynchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedCounter count = new SynchronizedCounter();
		count.increment();
		count.increment();
		System.out.println("synched value is :" + count.value());
		count.decrement();
		count.decrement();
		System.out.println("synched value is :" + count.value());
		count.decrement();
		count.decrement();
		count.decrement();
		count.decrement();
		
		System.out.println("synched value is :" + count.value());
		
	}

}


