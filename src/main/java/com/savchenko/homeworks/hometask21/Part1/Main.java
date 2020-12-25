package com.savchenko.homeworks.hometask21.Part1;

import com.savchenko.homeworks.hometask21.Part1.AverageCounter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static java.time.temporal.ChronoUnit.MILLIS;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        LocalDateTime now = LocalDateTime.now();
        int[] randomNumbers = new int[1_000_000];
        double average1;
        long sum = 0L;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 1_000_000);
            sum += randomNumbers[i];
        }
        average1 = sum / randomNumbers.length;
        System.out.println("An average number is : " + average1);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.printf("The program with one thread ran for : %dmilliseconds%n %n ", MILLIS.between(now, now1));

        LocalDateTime now2 = LocalDateTime.now();
        double average2 = 0;
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Future<Double>> list = new ArrayList();
        Callable<Double> callable = new AverageCounter();

        for (int j = 0; j <= 4; j++) {
            Future<Double> future = executor.submit(callable);
            list.add(future);
        }
        for (Future<Double> fut : list) {
            average1 += fut.get();
        }
            average2 = sum / randomNumbers.length;
            System.out.println("An average number is : " + average2);
            executor.shutdown();
            LocalDateTime now3 = LocalDateTime.now();
            System.out.printf("The program with four threads ran for : %dmilliseconds%n %n ", MILLIS.between(now2, now3));

    }
}

