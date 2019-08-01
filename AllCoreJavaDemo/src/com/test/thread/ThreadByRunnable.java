package com.test.thread;

public class ThreadByRunnable implements Runnable{

	public void run() {
		int count=0;
			for(int i=0;i<10;i++){
				count+=3;
				System.out.println("count value of ThreadByRunnable:"+count);
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("after wait ThreadByRunnable:");
				//notify();
				//System.out.println("after notify ThreadByRunnable:");
			}
		
	}
}
