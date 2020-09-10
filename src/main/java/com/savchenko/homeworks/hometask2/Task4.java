package com.savchenko.homeworks.hometask2;

import java.util.Scanner;

/**
 * You are given a function describeAge that takes a parameter age (which
 * will always be a positive integer) and does the following:
 * If the age is 12 or lower, it return "You're a(n) kid"
 * If the age is anything between 13 and 17 (inclusive), it return "You're a(n)
 * teenager"
 * If the age is anything between 18 and 64 (inclusive), it return "You're a(n)
 * adult"
 * If the age is 65 or above, it return "You're a(n) elderly"
 * Your task is to shorten the code as much as possible
 */

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        System.out.println(describeAge(age));
    }

    public static String describeAge(int age) {

        String young = age > 12 && age < 18 ? "You're a teenager" : "You're a kid";
        String old = age > 17 && age < 65 ? "You're an adult" : "You're an elderly";
        String oldOrYoung = age > 17 ? old : young;

        if (age < 0) {
            System.out.println("Please enter the correct data");
        }
        return oldOrYoung;
    }
}


