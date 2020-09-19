package com.savchenko.homeworks.hometask4;

import java.util.Scanner;

/**
 * Lecture 3 Tasks "Loops. Arrays"
 * 1.Write a program which finds minimal number in int array
 * 2.Write a program which checks if a string (array of chars) is a palindrome
 * 3.Write a program which calculates the sum of two columns. Print table with results if columns have the same size (col_1| col_2 | sum). Otherwise print which column has bigger size
 * 4.* Write a program which checks if given number is STRONG, i.e. the sum of the factorials of its digits is equal to number itself: 1! + 4! + 5! = 1 + 24 + 120 = 145
 **/

public class Lecture3Tasks {

    public static void main(String[] args) {

        int[] numbers = new int[]{10, 94, 753, 9, 8, -2, 0, 56, 47, 132};

        System.out.println("\nThe minimum number in the array is " + getMinNumber(numbers));//Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter a string in order to check whether it's palindrome or not");
        String input = scanner.next();
        isPalindrome(input); //Task2
        System.out.print("\nEnter the number to check whether it's strong or not: ");
        int array[][] = {{95, 1}, {0, 26}, {-9, 217}, {2, 5}, {98}, {753, 95}, {3, 2}, {-124}};
        sumOfColumns(array); //Task3
        int number = scanner.nextInt();
        isNumberStrong(number);//Task 4
    }

    private static int getMinNumber(int[] array) { //Task 1

        int minValue = array[0];
        for (int value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    private static boolean isPalindrome(String word) { //Task2

        String myWord = word.replaceAll("\\s+", "");
        String reverse = new StringBuffer(myWord).reverse().toString();
        if (word.equals(reverse)) {
            System.out.println("The entered String is a Palindrome");
        } else {
            System.out.println("The entered String is Not a Palindrome");
        }
        return reverse.equalsIgnoreCase(myWord);
    }

    private static void sumOfColumns(int[][] matrix) { //Task3
        int length = 0;

        for (int r = 0; r < matrix.length; r++) {
            int currLength = matrix[r].length;
            if (currLength > length) length = currLength;
        }

        for (int currentRow = 0; currentRow < matrix.length; currentRow++) {
            int sumRow = 0;
            for (int col = 0; col < matrix[currentRow].length; col++) {
                sumRow = sumRow + matrix[currentRow][col];
                System.out.print("|" + matrix[currentRow][col]);
            }
            System.out.print("| Sum is : " + sumRow + "|");
            System.out.println();
        }
    }

    private static int isNumberStrong(int givenNumber) { //Task4

        int sum = 0;
        int temp = givenNumber;
        while (givenNumber != 0) {
            int i = 1;
            int fact = 1;
            int rem = givenNumber % 10;

            while (i <= rem) {
                fact = fact * i;
                i++;
            }
            sum = sum + fact;
            givenNumber = givenNumber / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is a strong number\n");
        } else {
            System.out.println(temp + " is not a strong number\n");
        }
        System.out.println();
        return temp;
    }
}
