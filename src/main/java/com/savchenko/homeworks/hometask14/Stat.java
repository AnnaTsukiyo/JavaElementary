package com.savchenko.homeworks.hometask14;

import java.util.Arrays;

/**
 * Create a Generic class Stat, which accepts the data array in its constructor (For example, Integers / Doubles / Longs)
 * And has a printData method
 * If you call this method - this should be output to the console
 * 2. Only accept that extends Number
 * Average method - calculates the arithmetic mean and returns it (double)
 * 3. Write a method in Stat isSameAverage that takes another Stat object
 **/
public class Stat<T extends Number> {

    private final T[] data;

    public Stat(T[] data) {
        this.data = data;
    }

    public void printData() {
        System.out.println(Arrays.toString(data));
    }

    public double average() {
        double average = 0;
        for (T dataItem : data) {
            average += dataItem.doubleValue();
        }
        return average / data.length;
    }

    public boolean isSameAverage(Stat<?> stat) {
        return average() == stat.average();
    }
}

