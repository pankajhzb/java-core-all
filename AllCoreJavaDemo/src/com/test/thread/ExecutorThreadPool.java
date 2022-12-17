package com.test.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Executor framework manages threads. It provides thread pool.
 * We can submit our threads to thread pool and it will handle start, run and stop of threads effectively.
 * Let's understand framework step by step.
 * 1. Executor
 * Executor is an interface under the package java.util.concurrent.
 * The mechanics of thread start, run and shutdown is separated through Executor.
 * We can simply create the object of thread and submit to executor, now it is executor's
 * responsibility to handle the thread.
 * 2. Executors
 * This is a class under the package java.util.concurrent. Executors is a factory class and provides methods
 * that return ExecutorService, ScheduledExecutorService, ThreadFactory, Callable.
 * 3. newFixedThreadPool
 * This is a method in Executers class. newFixedThreadPool () creates a pool of thread and reuses the thread.
 * Before completion of thread , if a thread interrupts , a new thread from thread pool completes the task.
 */
public class ExecutorThreadPool {
    public static void main(String[] args) {
        int noOfThreadInPool = 3;

        Executor executor = Executors.newFixedThreadPool(noOfThreadInPool);
        //here we are executing 6 thread,bur noOfThreadInPool value is 3
        //so only 3 threads will execute.

        executor.execute(new ExecutorConcreteThread());
        executor.execute(new ExecutorConcreteThread());
        executor.execute(new ExecutorConcreteThread());
        executor.execute(new ExecutorConcreteThread());
        executor.execute(new ExecutorConcreteThread());
        executor.execute(new ExecutorConcreteThread());

        //Difference Between Executor and ExecutorService In Executor Framework
        //Executor and ExecutorService are the interface under the package java.util.concurrent.
        //ExecutorService provides the method awaitTermination, invokeAny, isShutdown and others.
        //ExecutorService is the subinterface of the Executor. ExecutorService provides more control over threads and thread pool.
        //Find the example how to use ExecutorService .Find the changed ConcreteStudy.java

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new ExecutorConcreteThread());
        executorService.shutdownNow();
    }

}
