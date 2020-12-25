package com.savchenko.homeworks.hometask21.Part1;

import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.MILLIS;

public class OneThreadAverage {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        int [] arrayOfRandomNumbers = new int[1_000_000];
        long sum = 0;
        double average;
        for (int j = 0; j < arrayOfRandomNumbers.length; j++) {
            arrayOfRandomNumbers[j] = (int) (Math.random() * 1_000_000);
            sum += arrayOfRandomNumbers[j];
        }
        for (int i :arrayOfRandomNumbers) {
            sum+=i;
        }
         average = (double) sum / arrayOfRandomNumbers.length;
        System.out.printf("An average number is : ", average);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.printf("The program ran for : milliseconds", MILLIS.between(now, now1));
    }
}
