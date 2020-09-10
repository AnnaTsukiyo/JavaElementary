package com.savchenko.lectures.lecture_01;

/**
 * Task #1
 * Develop a program that can switch values between two variables
 * a) using additional variable b) without additional variable (only for int)
 */

public class Task1 {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 11;

        a = c - a;            //a) using additional variable
        System.out.println(a);
        b = c - b;
        System.out.println(b);

        a += b; // b) without additional variable (only for int)
        b = a - b;
        System.out.println(b);
        a -= b;
        System.out.println(a);
    }
}
