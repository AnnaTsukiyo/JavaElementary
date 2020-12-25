package com.savchenko.homeworks.hometask12;

import java.util.HashSet;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * Write the classes "Mouse" and "Cat".
 * Mouse - contains two fields: name and number of kilocalories.
 * The cat will contain a "belly" inside. A cat's belly can contain a maximum of 5 mice.
 * 1) A cat can eat mice. (Eat method). If a cat tries to eat the 6th mouse when it already has 5 in its stomach, it should not work for it.
 * 2) The cat also has a method for removing mice from the body in a natural way, naturally, the most digested mouse is removed from the body first.
 * 3) the cat can also take a laxative and remove all mice from the body at once. They are excreted as a substance containing all mice. those. the method must return this substance.
 * The only thing we want to do with this substance in the client code is to find out as quickly as possible whether there is Jerry's mouse with an energy value of 460 kcal among the victims of the cat.
 */
/**

 * Rewrite  the previous homework so that the least-calorie mice are digested first
 **/


        LinkedBlockingDeque belly = new LinkedBlockingDeque<>(5);
        Mouse mouse1 = new Mouse("Jerry", 460);
        Mouse mouse2 = new Mouse("Jane", 245);
        cat.eat(belly, mouse1);
        cat.eat(belly, mouse2);
        HashSet<Mouse> substance = new HashSet<>(belly);
        substance.addAll(belly);
        Mouse key = new Mouse("Jerry", 460);
        System.out.println("Substance contains Jerry or not:" + substance.contains(key));


        Mouse mouse1 = new Mouse("Jerry", 460);
        Mouse mouse2 = new Mouse("Jane", 245);

        Mouse mouse1 = new Mouse("Jerry", 460);
        Mouse mouse2 = new Mouse("Jane", 245);

        cat.eat(mouse1);
        cat.eat(mouse2);


    }
}
