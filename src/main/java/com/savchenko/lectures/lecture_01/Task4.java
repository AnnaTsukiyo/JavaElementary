package com.savchenko.lectures.lecture_01;

/**
 * Given any sentence. Write a program that will change first letter of each word to capital letter
 * For ex: "This is just an example string for test"
 * Should be: "This Is Just An Example String For Test"
 */

public class Task4 {
    public static void main(String[] args) {

        String input = "This Is Just An Example String For Test";
        String output = "";
        String[] strings = input.split(" ");
        for (String s : strings) {
            output = output + s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        System.out.println(output);
    }
}
