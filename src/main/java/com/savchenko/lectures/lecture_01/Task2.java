package com.savchenko.lectures.lecture_01;

import java.util.Scanner;

public class Task2 {

    /**
     * I have a cat and a dog. I got them at the same time as kitten/puppy. That was humanYears years ago.
     * Calculate their respective ages now.
     * <p>
     * NOTES:
     * humanYears >= 1
     * humanYears are whole numbers only
     * Cat Years
     * 15 cat years for first year
     * +9 cat years for second year
     * +4 cat years for each year after that
     * <p>
     * Dog Years
     * 15 dog years for first year
     * +9 dog years for second year
     * +5 dog years for each year after that
     * <p>
     * EXAMPLE output:
     * HumanYears: 4
     * CatYears: 32
     * DogYears: 34
     **/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int catYears;
        int dogYears;
        System.out.println("Please enter the Human years (whole numbers only)");
        int humanYears = scanner.nextInt();

        if (humanYears == 1) {
            catYears = 15;
            dogYears = 15;
            System.out.println("HumanYears : 1");
            System.out.println("CatYears : 15");
            System.out.println("DogYears : 15");

        } else if (humanYears == 2) {
            catYears = 24;
            dogYears = 24;
            System.out.println("HumanYears : 2");
            System.out.println("CatYears : 24");
            System.out.println("DogYears : 24");

        } else if (humanYears >= 3) {
            catYears = 4 * (humanYears - 2) + 24;
            dogYears = 5 * (humanYears - 2) + 24;

            System.out.println("HumanYears :" + humanYears);
            System.out.println("CatYears : " + catYears);
            System.out.println("DogYears : " + dogYears);
        }
    }
}





