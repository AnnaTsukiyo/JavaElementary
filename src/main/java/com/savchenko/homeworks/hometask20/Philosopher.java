package com.savchenko.homeworks.hometask20;

import java.util.Random;

public class Philosopher implements Runnable {

    private final Random numGenerator = new Random();
    private final int id;

    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(int id, Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run() {
        try {
            while (true) {
                sleep();
                takeLeftFork();
                takeRightFork();
                eat();
                putDownForks();
            }
        } catch (InterruptedException e) {
            System.out.println("Philosopher " + id + " was interrupted.\n");
        }
    }

    private void sleep() throws InterruptedException {
        System.out.println("Philosopher " + id + " is sleeping.\n");
        System.out.flush();
        Thread.sleep(numGenerator.nextInt(10));
    }

    private void takeLeftFork() throws InterruptedException {
        leftFork.take();
        System.out.println("Philosopher " + id + " is holding left fork.\n");
        System.out.flush();
    }

    private void takeRightFork() throws InterruptedException {
        rightFork.take();
        System.out.println("Philosopher " + id + " is holding right fork.\n");
    }

    private void eat() throws InterruptedException {
        System.out.println("Philosopher " + id + " is eating.\n");
        System.out.flush();
        Thread.sleep(numGenerator.nextInt(10));
    }

    private void putDownForks() {
        leftFork.put();
        rightFork.put();
    }
}