package com.test.synchronization;
public class TestSynchronization {
	private static final String x = "ABC";
	
	//synchronized method, calling object of this method is hold the lock
	//Also one object can hold more than one lock, (if this object will call another synchronized method.)
	public synchronized int getValue() throws InterruptedException{
		int i = 0;
		while(i<10){
			i++;
		}
		wait(1000);
		return i;
	}
		public static void main(String[] args) {
		final TestSynchronization ts1 = new TestSynchronization();
		final TestSynchronization ts2 = new TestSynchronization();
		TestSynchronization ts3 = new TestSynchronization();
		TestSynchronization ts4 = new TestSynchronization();
		
		//Thread one 
		new Thread() {
			@Override
			public void run() {
				try {
					System.out.println("i am at thread one : - " +ts1.getValue());
					System.out.println("i am at thread one : - " +ts2.getValue());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();

		//Thread two
		new Thread() {
			@Override
			public void run() {
				try {
					System.out.println("i am at thread two : - "+ts1.getValue());
					System.out.println("i am at thread two : - "+ts2.getValue());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
}
