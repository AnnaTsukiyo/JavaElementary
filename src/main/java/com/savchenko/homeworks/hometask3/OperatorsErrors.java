package com.savchenko.homeworks.hometask3;

/**
 * Common Errors while concatenating strings,
 * Types Casting ( Implicit and Explicit)
 */

public class OperatorsErrors {

    public static void main(String[] args) {
        typesCasting();
        exceptionsErrors();
        falseAndTrueComparison();
    }

    private static void typesCasting() {

        String s1 = "abc" + 2 + 2;
        System.out.println(s1); // s1 = abc22
        String s2 = 2 + 2 + "abc";
        System.out.println(s2);// s2 = 4abc
        long lVal = 1000; //an acceptable variant
       // int iVal = lVal; //
       // System.out.println(ival); // error: incompatible types: possible lossy conversion from long to int
        int iVal2 = (int) lVal; // an acceptable variant
        double h = 3.14159265359;
        float g = (float) h; // possible irrelevance
        System.out.println(g); // 3.1415927
        int l = 257;
        byte b = (byte) l; // possible irrelevance
        System.out.println(b); // 1

        //Operators - Example1

        int chinaPopulation = 1360000000;
        int indiaPopulation = 1240000000;
        int total = chinaPopulation + indiaPopulation;
        System.out.println(total); // incompatible types: possible lossy conversion from int to byte
        byte b1 = 1;
        byte b2 = 2;
     //   byte b3 = b1 + b2; // possible lossy conversion from int to byte

        //Operators - Example2

        int i = 123456789;
        float f = i;
        double d = i;
        short s = (short) i;
        System.out.println("int: " + i); //int: 123456789
        System.out.println("float: " + f); //float: 1.23456792E8
        System.out.println("double: " + d); //double: 1.23456789E8
        System.out.println("short: " + s); //short: -13035
    }

    private static void exceptionsErrors() {

        //Operators -  Example3
        int d = 1;
        int e = 0;
        int f = d / e;
        System.out.println(f); //Exception in thread "main" java.lang.ArithmeticException: / by zero

        //Operators -  Example4
        double a = 1;
        double b = 0;
        double c = a / b;
        System.out.println(c); //Infinity
        System.out.println("c+1 = " + (c + 1)); //c+1 = Infinity
        System.out.println("+0.0 == -0.0 : " + (0.0 == -0.0)); //+0.0 == -0.0 : true
        System.out.println("a/(+0.0) = " + (a / (+0.0))); //a/(+0.0) = Infinity
        System.out.println("a/(-0.0) = " + (a / (-0.0))); //a/(-0.0) = -Infinity
    }

    private static void falseAndTrueComparison() {

        //Operators -  Example5

        double a = 0;
        double b = 0;
        double c = a / b;
        System.out.println("c =" + c); //c =NaN
        System.out.println("c+0 =" + (c + 0)); //  c+0 =NaN
        System.out.println("c<0 =" + (c < 0)); //  c<0 =false
        System.out.println("c>0 =" + (c > 0)); //   c>0 =false
        System.out.println("c==0 =" + (c == 0)); // c==0 =false
        System.out.println("c!=0 =" + (c != 0)); // c!=0 =true
        System.out.println("c==c =" + (c == c)); // :) //  c==c =false
        System.out.println("c!=c =" + (c != c)); // :) //   c!=c =true

        System.out.println("c == NaN: " + (c == Double.NaN)); // :))) // c == NaN: false
        System.out.println("c is NaN: " + Double.isNaN(c)); //  c is NaN: true

    }