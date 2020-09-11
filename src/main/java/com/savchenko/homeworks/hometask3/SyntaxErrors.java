package com.savchenko.homeworks.hometask3;

/**
 * Syntax errors and their explanations
 * Primitive and reference data types correct usage
 * Arrays declaring and resizing
 */

public class SyntaxErrors {

    public static void main(String[] args) {

        dataTypesCorrectRecording();
        arraysRecording();
    }

    private static void dataTypesCorrectRecording() {
        int oct = 0123; // 83 in octal, not 123;
        int hex = 0xCAFE; // 51966 in hexidecimal;
        long badLong = 3000000000; // error: integer number too large;
        long goodLong = 3000000000L; // an acceptable variant to use the number 3000000000;
        long smallL = 3000000000l; // better to use Capital letter "L";
        int binary = 0b0101010110101010; //21930 in binary
        float badFloat = 1.0; // error: incompatible types: possible lossy conversion from double to float
        float goodFloat = 1.0f;  // an acceptable variant
        double pi = 3.14159265359; // default as double
        double e = 2.71828182846d; // 'd'is not required to add;
        double speedOfLight = 3e8; // 'scientific format'of 3 * 10^8
        char b = 'a' + 1;
        int x;
        System.out.println(x); // error: variable 'x' hasn't benn initialized;
        String s1 = ""; // String literal of 0 seize
        String s2 = "Hello, World!"; // an implicit String object creation
        String s3 = new String("Hello, World!"); // яan explicit String object creation
        final int tattuqoltuae = 42;
        int four = 2 * 2;
        int noInit;
        double a, c, x1, x2; //not recommended
    }

    private static void arraysRecording() {

        //Arrays - Declaring
        int[] a, b; // Declaring of the Arrays a and b a и b;
        int c[], d; // Declaring of the Arrays a and variable d;
        int[] e, f; // better variant of the above declaring;
        String[] s; // objects array declaring is the same as for the primitive

        //Arrays - resizing

        int[] elements = {1, 2, 3, 4, 5}; // array of 5 elements;
        int[] tmp = new int[10]; //
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
        for (int e1 : elements) {
            System.out.println(e1);  //Each of new line: 1 2 3 4 5 0 0 0 0 0
        }
    }
}

