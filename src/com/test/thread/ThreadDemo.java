package com.test.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        //Thread class have start method
        new ThreadByThread().start();
//new ThreadByThread().start();
//new ThreadByThread().start();
//new ThreadByThread().start();
//new ThreadByThread().start();
//new ThreadByThread().start();
// but here ThreadByRunnable class implements Runnable having only run method,
//so need to initialise thread object and handover the runnable class object.
        Thread t = new Thread(new ThreadByRunnable());
        t.start();
//t.start();
//t.start();
//t.start();
//to do implement wait,notify,notifyAll
    }
}
