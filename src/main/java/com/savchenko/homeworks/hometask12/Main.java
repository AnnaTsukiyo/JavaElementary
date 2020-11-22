package com.savchenko.homeworks.hometask12;

import java.util.HashSet;
import java.util.concurrent.LinkedBlockingDeque;

 * Rewrite  the previous homework so that the least-calorie mice are digested first
 **/

public class Main {

        Mouse mouse1 = new Mouse("Jerry", 460);
        Mouse mouse2 = new Mouse("Jane", 245);

        Mouse mouse3 = new Mouse("Jacky", 123);
        cat.eat(mouse1);
        cat.eat(mouse2);
        cat.eat(mouse3);
        cat.miceRemovingFromOrganism();
        System.out.println(cat.belly);

        cat.eat(mouse1);
        cat.eat(mouse2);

        HashSet<Mouse> substance = new HashSet<>(cat.belly);
        substance.addAll(cat.belly);
        Mouse key = new Mouse("Jerry", 460);
        System.out.println("Substance contains Jerry or not:" + substance.contains(key));

    }
}
