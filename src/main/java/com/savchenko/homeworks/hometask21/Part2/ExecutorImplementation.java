package com.savchenko.homeworks.hometask21.Part2;

import java.util.concurrent.*;

import static java.lang.System.nanoTime;

/**
 * Create Executor with a fixed number of threads (4) upload 10 threads to this executor,
 * each should write: "<Thread name> sleeps" Sleep 10 seconds and print "<Thread name> finished".
 * Analyze the result of the execution.
 */

public class ExecutorImplementation {

    public static void main(String[] args) throws InterruptedException {
        long startTime = nanoTime();
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            final int number = i;
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Running internal thread " + number);
                    sleep();
                    System.out.println(Thread.currentThread().getName() + " under internal thread number " + number + " finished");
                }
            });
        }
        long duration = System.nanoTime() - startTime;
        System.out.printf("Duration of the program running is %d milliseconds%n", duration);
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
    }

    private static void sleep() {
        try {
            Thread.sleep(10_000);
            System.out.println(Thread.currentThread().getName() + " sleeps");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
