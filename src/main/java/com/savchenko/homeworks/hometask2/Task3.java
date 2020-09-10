package com.savchenko.homeworks.hometask2;

import java.util.Scanner;

/**
 * Introduction
 * The first century spans from the year 1 up to and including the year 100,
 * The second - from the year 101 up to and including the year 200, etc.
 * Task :
 * Given a year, return the century it is in.
 * Input , Output Examples :
 * centuryFromYear(1705) returns (18)
 * centuryFromYear(1900) returns (19)
 * centuryFromYear(1601) returns (17)
 * centuryFromYear(2000) returns (20)
 */

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = scanner.nextInt();
        int century = (int) (year / 100) + ((year % 100 == 0) ? 0 : 1);
        System.out.println("The given year is in the century " + century);
    }
}
