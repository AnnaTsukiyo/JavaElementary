package com.savchenko.homeworks.hometask19;

/**
 * 1.Generate arrays for 1_000_000 random ints. Calculate the arithmetic mean, while measuring the execution time.
 * Do the same using 4 streams (4 arrays with 250_000 elements each).
 * Do not forget about adding the result of the work of threads in main
 */

public class ThreadsExample implements Runnable {

    long startTime = System.currentTimeMillis();
    long endTime = System.currentTimeMillis();

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        int[] randomNumbersMain = new int[1_000_000];
        averageNumberFinding(randomNumbersMain);
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("The program with one thread ran for " + timeSpent + " milliseconds");

        Thread t1 = new Thread(new ThreadsExample(), "t1");
        Thread t2 = new Thread(new ThreadsExample(), "t2");
        Thread t3 = new Thread(new ThreadsExample(), "t3");
        Thread t4 = new Thread(new ThreadsExample(), "t4");
        long startingTime = System.nanoTime();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        int[] randomNumbers = new int[250_000];
        averageNumberFinding(randomNumbers);
        t1.join();

        int[] randomNumbers2 = new int[250_000];
        averageNumberFinding(randomNumbers2);
        t2.join();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] randomNumbers3 = new int[250_000];
        averageNumberFinding(randomNumbers3);
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] randomNumbers4 = new int[250_000];
        averageNumberFinding(randomNumbers4);
        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long finishingTime = System.nanoTime();
        System.out.println("Have passed : " + (finishingTime - startingTime) + " milliseconds");
    }

    public static void averageNumberFinding(int[] numbers) {
        double average = 0;
        double sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = (int) (Math.random() * 1_000_000);
            sum += numbers[j];
        }
        average = sum / numbers.length;
        System.out.println("An average number is : " + average);
    }

    long start() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    @Override
    public void run() {

        long runTime = 0L;
        while (endTime - startTime < 1000L) {
            runTime += 1L;
            endTime = System.currentTimeMillis();
        }
        System.out.println(Thread.currentThread().getName() + " done " +
                " Thread Execution Time " + endTime);
    }
}

