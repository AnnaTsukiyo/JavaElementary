package com.savchenko.homeworks.hometask21.Part1;

import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.MILLIS;

/**
 * 1.Generate arrays for 1_000_000 random ints. Calculate the arithmetic mean, while measuring the execution time.
 * Do the same using 4 streams (4 arrays with 250_000 elements each).
 * Do not forget about adding the result of the work of threads in main
 */

public class MultiThreadsAverageResult {

    public static double averageNumberOfOneArray(int[] arrayOfNumbers) {

        LocalDateTime now = LocalDateTime.now();
        double average;
        double sum = 0;
        for (int j = 0; j < arrayOfNumbers.length; j++) {
            arrayOfNumbers[j] = (int) (Math.random() * 1_000_000);
            sum += arrayOfNumbers[j];
        }
        average = sum / arrayOfNumbers.length;
        System.out.println("An average number is : " + average);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("The program ran for : : %dmilliseconds%n %n " + MILLIS.between(now, now1));
        return average;
    }

    public static double multiThreadAverage(int[] arrayOfNumbers) {

        ThreadMultiply t1 = new ThreadMultiply(arrayOfNumbers, 0, arrayOfNumbers.length / 4);
        Thread thread1 = new Thread(t1);
        ThreadMultiply t2 = new ThreadMultiply(arrayOfNumbers, arrayOfNumbers.length / 4, arrayOfNumbers.length / 2);
        Thread thread2 = new Thread(t2);
        ThreadMultiply t3 = new ThreadMultiply(arrayOfNumbers, arrayOfNumbers.length / 2, arrayOfNumbers.length / 4);
        Thread thread3 = new Thread(t3);
        ThreadMultiply t4 = new ThreadMultiply(arrayOfNumbers, arrayOfNumbers.length / 4, arrayOfNumbers.length);
        Thread thread4 = new Thread(t4);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double finalResult = t1.getResult() + t2.getResult() + t3.getResult() + t4.getResult() / 4;
        return finalResult;
    }
}
