package com.savchenko.homeworks.hometask20;

/**
 * 2. Three philosophers sit at a round table. Forks lie on the table between each pair of nearby philosophers.
 * It means: 3 philosophers / 3 forks
 * Every philosopher can either eat or sleep.
 * A philosopher can only eat when he holds two forks.
 * He takes the forks in turn, first the left, then the right.
 * Write the following algorithm that should lead to a deadlock on one of the iterations:
 *
 * Take the left fork.
 * Take the right fork.
 * Eat
 * Put the left fork
 * Put the right fork
 * Repeat the algorithm from the beginning
 *
 * //explanation:
 * Philosophers are threads (Runnable accepting 2 forks in the constructor)
 * Forks are resources (objects of the Fork class having take and put methods)
 * I draw your attention to the fact that two philosophers should not be able to simultaneously take one fork
 * (i.e. call the take method on the same fork twice in a row without an intermediate put)
 */

public class DiningPhilosophers {

    private static final int NUM_PHILOSOPHERS = 3;

    public static void main (String[] args) {

        Fork[] forks = new Fork[NUM_PHILOSOPHERS];

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new Fork();
        }

        Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            philosophers[i] = new Philosopher(i, forks[i], forks[(i+1)%NUM_PHILOSOPHERS]);
            new Thread(philosophers[i]).start();
        }
    }
}