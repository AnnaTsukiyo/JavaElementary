package com.savchenko.homeworks.hometask1;

import java.util.Scanner;

/**
 * 1.Using following make a program to calculate logarithm of b with the base of a
 * log a (b)  = log10 b / log10 a
 *  Example: a=2, b=8 Result: 3.0
 * */


public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int b = scanner.nextInt();
        System.out.println("Please enter the base of the number");
        int a = scanner.nextInt();

        System.out.println("Logarithm of the number " + b + " to the base " + a + " = " + logarithmCalc(a, b));
    }

    private static double logarithmCalc(int a, int b) {

        return  Math.log10(b) / Math.log10(a);
    }
}

