package com.savchenko.homeworks.hometask1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * You are given real numbers a, b and c, where a ≠ 0.
 * Solve the quadratic equation and output all of its roots in ascending order.
 * Sample Input 1:
 * 1
 * -1
 * -2
 * Sample Output 1:
 * -1 2
 */


public class Task3 {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the first coefficient");
        double a = scan1.nextDouble();
        if (a == 0) {
            System.out.println("Please enter another number");
            a = scan1.nextDouble();
        }
        System.out.println("Please enter the second coefficient");
        double b = scan1.nextDouble();
        System.out.println("Please enter the third coefficient");
        double c = scan1.nextDouble();

        equationSolution(a, b, c);
    }

    private static double equationSolution(double a, double b, double c) {
        double arr[] = new double[2];
        double result = b * b - 4.0 * a * c;
        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            arr[0] = r1;
            arr[1] = r2;
            System.out.println("The roots are " + r1 + " and " + r2);
            for (int i = 0; i < arr.length; i++) {
                Arrays.sort(arr);
                System.out.println("The roots sorted in ascending order: " + arr[i]);
            }
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
        return result;
    }
}
