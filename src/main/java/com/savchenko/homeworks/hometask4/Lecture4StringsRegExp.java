package com.savchenko.homeworks.hometask4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

/***
 *
 * Lecture 4 Tasks "Strings. Regular Expressions"
 *
 * Task 0.Write a program which reverse given word
 *
 * Task2
 * Product code validation eg: AX6BYU56UX6CV6BNT7NM 287430
 * • 1st part can contain only capital letters and 6 digits. 2nd
 * part is all digits and = the product of the first 6 digits
 * taken in groups of two from the left. Eg 65*66*67 =
 * 287430
 *
 * Task3
 * Write a simple regex to validate a username. Allowed
 * characters are:
 * • lowercase letters,
 * • numbers,
 * • underscore
 * • Length should be between 4 and 16 characters (both
 * included).
 *
 * Task4
 * Given a string of digits, you should replace any digit
 * below 5 with '0' and any digit 5 and above with '1'. Return
 * the resulting string.
 * */


public class Lecture4StringsRegExp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word"); //Task0
        String word = scan.next();
        System.out.println(ReverseWord(word));
        System.out.println("Please enter a product code");
        String userEntry = scan.nextLine();
        String result = "Valid";
        int DoubleCounter = 0;
        double newDouble;
        List<Double> NumberList = new ArrayList<Double>();
        for (int i = 0; i < userEntry.length(); i++) {
            if (Character.isLowerCase(userEntry.codePointAt(i))) {
                result = "Fail";
                if (userEntry.matches("[0-9]")) {
                    DoubleCounter += 1;
                    newDouble = userEntry.charAt(i);
                    NumberList.add(newDouble);
                }
            }
        }
        if (isValid(userEntry) == true) {
            System.out.println("Valid product code");
        } else {
            System.out.println("Invalid product code");
        }
        System.out.println("Please enter the user name"); //Task3
        String userName = scan.nextLine();
        usernameValidation(userName);

        String digits = "54524667510393514056654258346046826340"; //Task4
        digitsReplacement(digits);

    }

    private static String ReverseWord(String word) { //Task0

        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(word);
        String result = "";
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                result = temp[i] + result;
            } else {
                result = " " + temp[i] + result;
            }
        }
        return result;
    }

    private static boolean isValid(String s) {   //Task2

        String[] parts = s.split(" ");
        int[] ints = extractIntegers(parts[0]);
        int target = parseInt(parts[1]);
        return product(ints) == target;
    }

    private static int[] extractIntegers(String s) {

        String digits = s.replaceAll("[^0-9]+", "");
        int[] ints = new int[digits.length() / 2];
        for (int i = 0; i < digits.length(); i += 2) {
            ints[i / 2] = parseInt(digits.substring(i, i + 2));
        }
        return ints;
    }

    private static int product(int[] ints) {
        int result = 1;
        for (int num : ints) {
            result *= num;
        }
        return result;
    }

    private static void usernameValidation(String userName) { //Task3

        String regExp = ("^[a-z]|[0-9]{4,16}$");
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(userName);
        if (userName.matches(regExp)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }

    private static void digitsReplacement(String digits) { //Task4

        System.out.println("Before Replacement: \n" + digits);
        Pattern pattern1 = Pattern.compile("[0-4]");
        Matcher matcher1 = pattern1.matcher(digits);
        Pattern pattern2 = Pattern.compile("[5-9]");
        Matcher matcher2 = pattern2.matcher(digits);
        System.out.println("After Replacement digits below 5 with '0' : \n" + matcher1.replaceAll("0"));
        System.out.println("After Replacement digits above 5 with '1' : \n" + matcher2.replaceAll("1"));
    }
}
