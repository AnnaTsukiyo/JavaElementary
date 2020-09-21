package com.savchenko.homeworks.hometask4;

import java.nio.charset.Charset;
import java.util.Random;

/**
 * Lecture 3 Tasks "Loops. Arrays"
 *
 * Task1.Write a class StringUtils which has one static method randomString. This method takes two params: String type and int length.
 * • Method would return new string of given length and containing random symbols of given type.
 * • Types: alpha (only letters), numeric (only numbers),alphanumeric ([a…z & 0..9]
 */

public class StringUtils {

    static String randomString(String s, int n) {

        byte[] array = new byte[256];
        new Random().nextBytes(array);

        String randomString = new String(array, Charset.forName("UTF-8"));
        StringBuffer r = new StringBuffer();
        String AlphaNumericString = randomString.replaceAll("[^A-Za-z0-9]", "");

        for (int k = 0; k < AlphaNumericString.length(); k++) {
            if (Character.isLetter(AlphaNumericString.charAt(k)) && (n > 0) || Character.isDigit(AlphaNumericString.charAt(k)) && (n > 0)) {
                r.append(AlphaNumericString.charAt(k));
                n--;
            }
        }
        return r.toString();
    }

    public static void main(String[] args) {

        String s = "";
        int n = 20;
        System.out.println(randomString(s, n));
    }
}

