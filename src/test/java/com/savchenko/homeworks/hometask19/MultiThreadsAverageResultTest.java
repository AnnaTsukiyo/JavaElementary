package com.savchenko.homeworks.hometask19;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

class MultiThreadsAverageResultTest {

    static int[] arrayForTest = new int[1_000_000];
    double multiThreadResult;
    double multiThreadResult1;

    @BeforeAll
    static void setUp() {
        Random random = new Random();
        for (int i = 0; i < arrayForTest.length; i++) {
            arrayForTest[i] = random.nextInt(500);
        }
    }

    @Test
    void averageNumberOfOneArray() {

        System.out.println("The test for one thread is to start");
        multiThreadResult = MultiThreadsAverageResult.averageNumberOfOneArray(arrayForTest);
        System.out.println("The test for one thread running is finished");
    }

    @Test
    void multiThreadAverage() {

        System.out.println("Starting calculating the time");
        try {
            multiThreadResult1 = MultiThreadsAverageResult.multiThreadAverage(arrayForTest);
        } catch (IllegalArgumentException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The test for one thread running is finished " + multiThreadResult1);
    }
}