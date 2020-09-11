package com.savchenko.homeworks.hometask3;

/**
 * Variables defining and visibility
 * Flow Control(loops)
 */

public class BlocksAndFlowControlErrors {

    //Blocks -example


    public class BlockDemo {
        static int a = 0; // error! variable a is within class visibility /Inner classes cannot have static declarations
    }

    public static void main(String[] args) {
        int a = 1; // defining the variable, is not acceptable!
        {
            a = 2; // acceptable
            int a = 3; // Error: already defined in the scope
            int b = 4; // acceptable
        }
        b = 5; // Error: cannot resolve symbol 'b'
        int b = 6; // acceptable

        //Flow Control: for loop

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World!");
        }
        for (int i = 0, j = 10; i <= 10; i++, j--) {
            System.out.println(i + " " + j);
        }

        int i = 0;
        while (true) { // error: reached end of file while parsing
            System.out.println("Hello, World!");
            i++;
            if (i > 5)
                break;
        }

    }
}

