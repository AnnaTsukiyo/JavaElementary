package com.savchenko.homeworks.hometask12;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Cat {

    LinkedBlockingDeque<Mouse> belly = new LinkedBlockingDeque<>(5);
    HashSet<Mouse> substance;

    void eat(Mouse mouse) {
        belly.addFirst(mouse);
        System.out.printf("The mouse %s is added to belly%n", mouse.getName());
    }

      ArrayList<Mouse> mice = new ArrayList<>(belly);
        Collections.sort(mice);
        belly.removeFirst();
        System.out.println("The mouse is removed");
    }

    private HashSet takingLaxative() {
        substance.addAll(belly);
        belly.clear();
        System.out.println("The mice are removed from the belly. Now you can eat a few fresh mice if you are hungry!");
        return substance;
    }
}
