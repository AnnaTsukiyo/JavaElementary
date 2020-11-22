package com.savchenko.homeworks.hometask19;

public class AverageCounter implements Runnable {

    public static void main(String[] args) {

        int[] array = new int[250_000];
        int sum = 0;

        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * 250_000);
            sum += array[j];
        }
        double average = sum / array.length;
    }

    @Override
    public void run() {
    }
}
