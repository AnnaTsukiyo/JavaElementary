package com.savchenko.homeworks.hometask1;

/**
 * 2. Heron's formula to calculate area of triangle:
 * S = √p*(p-a)*(p-b)*(p-c))
 * where p = a+b+c / 2 - half-perimeter of the triangle.
 * Example: a=3, b=4, c =5 Result: 6.0
 */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the side 1 of the triangle");
        double s1 = scan.nextDouble();
        System.out.println("Please enter the side 2 of the triangle");
        double s2 = scan.nextDouble();
        System.out.println("Please enter the side 3 of the triangle");
        double s3 = scan.nextDouble();
        System.out.println("The area of a triangle is " + triangleArea(s1, s2, s3));
    }

    public static double triangleArea(double s1, double s2, double s3) {

        double p = (s1 + s2 + s3) / 2.0d;
        double s = Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
        return s;
    }

}
