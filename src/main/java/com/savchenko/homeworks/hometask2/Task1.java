package com.savchenko.homeworks.hometask2;

import java.util.Scanner;

/**
 * Nathan loves cycling.
 * Because Nathan knows it is important to stay hydrated,
 * he drinks 0.5 litres of water per hour of cycling.
 * You get given the time in hours and you need to return
 * the number of litres Nathan will drink, rounded to the
 * smallest value.
 * For example:
 * time = 3 ----> litres = 1
 * time = 6.7---> litres = 3
 * time = 11.8--> litres = 5
 **/


public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the time of cycling in hours ");
        double timeInHours = scanner.nextDouble();
        litresOfWaterDrinking(timeInHours);
    }

    private static int litresOfWaterDrinking(double timeInHours) {

        int litresOfWater = (int) Math.floor(timeInHours * 0.5);
        System.out.println("Nathan will drink " + litresOfWater + " litre(s) per " + timeInHours + " hours of cycling");

        return litresOfWater;
    }
}
