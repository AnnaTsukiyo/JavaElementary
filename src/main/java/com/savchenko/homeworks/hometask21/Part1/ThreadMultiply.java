package com.savchenko.homeworks.hometask21.Part1;

public class ThreadMultiply implements Runnable {

    private final int[] array;
    private double result;
    int first;
    int last;

    public double getResult() {
        return result;
    }

    public ThreadMultiply(int[] array, int first, int last) {
        this.array = array;
        this.first = first;
        this.last = last;
    }

    @Override
    public void run() {
        double sum = 0;
        for (int i = first; i < last; i++) {
            sum = sum + array[i];
        }
        result = sum / (last - first);
    }
}

