package com.savchenko.homeworks.hometask2;

import java.util.Scanner;

/**
 * Write function bmi that calculates body mass index (bmi
 * = weight / height ^ 2).
 * if bmi <= 18.5 return "Underweight"
 * if bmi <= 25.0 return "Normal"
 * if bmi <= 30.0 return "Overweight"
 * if bmi > 30 return "Obese"
 */

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight in kilograms");
        double weightOfBody = scanner.nextDouble();
        System.out.println("Please enter your height in metres");
        double heightOfBody = scanner.nextDouble();

        bodyMassIndexCalculating(weightOfBody, heightOfBody);
    }

    private static double bodyMassIndexCalculating(double weightOfBody, double heightOfBody) {

        double bodyMassIndex = weightOfBody / Math.pow(heightOfBody, 2.0);

        if (bodyMassIndex <= 18.5) {
            System.out.println("Your body mass index is " + bodyMassIndex + " , which is considered Underweight");
        }
        if (bodyMassIndex > 18.5 && bodyMassIndex <= 25.0) {
            System.out.println("Your body mass index is " + bodyMassIndex + " , which is considered Normal");
        }
        if (bodyMassIndex > 25.0 && bodyMassIndex <= 30.0) {
            System.out.println("Your body mass index is " + bodyMassIndex + " , which is considered Overweight");
        }
        if (bodyMassIndex > 30.0) {
            System.out.println("Your body mass index is " + bodyMassIndex + " , which is considered Obese");
        }
        return bodyMassIndex;
    }
}

