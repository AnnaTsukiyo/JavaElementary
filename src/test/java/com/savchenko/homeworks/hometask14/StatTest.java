package com.savchenko.homeworks.hometask14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StatTest {
    private Integer[] intData;
    private Integer[] intData2;
    private Double[] doubleData;
    private List<Integer> listOfNumbers = new ArrayList<>();

    @BeforeEach
    void setUp() {
        intData = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        intData2 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        doubleData = new Double[]{21.31, 43.12, 76.87, 98.09, 34.2321};
        listOfNumbers.add(4);
        listOfNumbers.add(6);
        listOfNumbers.add(6);
        listOfNumbers.add(6);

    }

    @Test
    void printData() {
        new Stat<>(intData).printData();
        new Stat<>(doubleData).printData();
    }

    @Test
    void average() {
        assertEquals(5.0, new Stat(intData).average());
        assertEquals(54.72442000000001, new Stat(doubleData).average());
    }

    @Test
    void isSameAverage() {
        Stat<Integer> integerStat = new Stat<>(intData2);
        new Stat<>(intData2);
        assertTrue(new Stat<>(intData).isSameAverage(integerStat));
    }
}
