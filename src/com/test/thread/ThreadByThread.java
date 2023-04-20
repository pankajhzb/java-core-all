package com.test.thread;

public class ThreadByThread extends Thread {
    public void run() {
        int count = 0;
        try {
            for (int i = 0; i < 10; i++) {
                count += 2;
                System.out.println("count value of ThreadByThread:" + count);
                Thread.sleep(5000);
                wait();
                System.out.println("after wait in ThreadByThread");
                //notify();
                //System.out.println("after notify in ThreadByThread");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
