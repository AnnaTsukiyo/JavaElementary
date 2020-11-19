package com.savchenko.homeworks.hometask19;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;

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

        double average2;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 1_000_000);
            sum += randomNumbers[i];
        }
        {
            average2 = sum / randomNumbers.length;
            System.out.println("An average number is : " + average2);
            LocalDateTime now3 = LocalDateTime.now();
            System.out.printf("The program with four threads ran for : %dmilliseconds%n %n ", MILLIS.between(now2, now3));
        }
    }
}
