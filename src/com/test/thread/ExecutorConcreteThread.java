package com.test.thread;

public class ExecutorConcreteThread implements Runnable {

    public void run() {
        try {
            for (int cnt = 0; ; cnt++) {
                System.out.println(cnt);
                //Thread.sleep(1000);
                //Thread.sleep(1000);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
