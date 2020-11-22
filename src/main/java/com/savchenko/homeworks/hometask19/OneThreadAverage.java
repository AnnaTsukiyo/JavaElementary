package com.savchenko.homeworks.hometask19;

import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.MILLIS;

public class OneThreadAverage {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        int [] arrayOfRandomNumbers = new int[1_000_000];
        double sum = 0;
        for (int j = 0; j < arrayOfRandomNumbers.length; j++) {
            arrayOfRandomNumbers[j] = (int) (Math.random() * 1_000_000);
            sum += arrayOfRandomNumbers[j];
        }
        double average = sum / arrayOfRandomNumbers.length;
        System.out.printf("An average number is : ", average);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.printf("The program ran for : milliseconds", MILLIS.between(now, now1));
    }
}
