package com.savchenko.homeworks.hometask12;

import java.util.*;
import java.util.concurrent.BlockingDeque;

public class Cat {

    void eat(BlockingDeque<Mouse> belly, Mouse mouse) {
        if (belly.size() < 5) {
            belly.addFirst(mouse);
            System.out.println("The mouse is added to belly");
        } else {
            System.out.println("Error!The belly is full, glutton");
        }
    }

    void miceRemovingFromOrganism(BlockingDeque<Mouse> belly) {
        belly.removeFirst();
        System.out.println("The mouse is removed");
    }

    private void takingLaxative(HashSet<String> substance) {
        substance.clear();
        System.out.println("The mice are removed from the belly. Now you can eat a few fresh mice if you are hungry!");
    }
}
