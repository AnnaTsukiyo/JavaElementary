package com.savchenko.homeworks.hometask21.Part1;

import lombok.AllArgsConstructor;

import java.util.concurrent.Callable;

@AllArgsConstructor
public class AverageCounter implements Callable<Double> {

    @Override
    public synchronized Double call() throws Exception {
        double average = 0;
            int[] array = new int[250_000];
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 250_000);
            }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
             average = (double) sum / array.length;
            return average;
        }
    }


