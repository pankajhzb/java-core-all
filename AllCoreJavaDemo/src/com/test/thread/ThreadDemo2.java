package com.test.thread;

public class ThreadDemo2 {
	static Thread hardy, laurel;
	static int counter= 0;
	public static void main(String[] args) {
		laurel = new Thread(){
			public void run(){
				System.out.println("A");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("B");
					e.printStackTrace();
				}	
				System.out.println("C");
			}
		};
		
		hardy = new Thread(){
			public void run(){
				System.out.println("D");
				try {
					synchronized (hardy) {
						if(counter >3){
							System.out.println(counter);
							laurel.wait();
						}
					}
					counter++;
				} catch (InterruptedException e) {
					System.out.println("E");
					e.printStackTrace();
				}
				System.out.println("F");
				}
			};
			laurel.start();
			hardy.start();
	}
}