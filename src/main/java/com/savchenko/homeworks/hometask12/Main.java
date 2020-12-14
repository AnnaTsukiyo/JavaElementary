package com.savchenko.homeworks.hometask12;

import java.util.HashSet;

/**

 * Rewrite  the previous homework so that the least-calorie mice are digested first
 **/

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();

        Mouse mouse1 = new Mouse("Jerry", 460);
        Mouse mouse2 = new Mouse("Jane", 245);

        Mouse mouse1 = new Mouse("Jerry", 460);
        Mouse mouse2 = new Mouse("Jane", 245);

        cat.eat(mouse1);
        cat.eat(mouse2);

    }
}
