package com.savchenko.homeworks.hometask6;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {

    private static Fraction fraction1;
    private static Fraction fraction2;
    private static Fraction fraction3;
    private static Fraction fraction4;

    @BeforeAll
    static void init() {
        fraction1 = new FractionNumber(1, 3);
        fraction2 = new FractionNumber(2, 3);
        fraction3 = new FractionNumber(3, 4);
        fraction4 = new FractionNumber(1, 4);
    }

    @Test
    void testPlusWithTheSameDenominator() {
        Fraction result1 = fraction1.plus(fraction2);
        Fraction result2 = fraction3.plus(fraction4);
        assertEquals(new FractionNumber(3, 3), result1);
        assertEquals(new FractionNumber(1, 1), result1);
        assertEquals(new FractionNumber(4, 4), result2);
        assertEquals(new FractionNumber(1, 1), result2);
    }

    @Test
    void testPlusWithNotTheSameDenominator() {
        Fraction result = fraction1.plus(fraction3);
        assertEquals(new FractionNumber(13, 12), result);
    }

    @Test
    void testMinusWithTheSameDenominator() {
        Fraction result1 = fraction2.minus(fraction1);
        Fraction result2 = fraction3.minus(fraction4);
        assertEquals(new FractionNumber(1, 3), result1);
        assertEquals(new FractionNumber(1, 2), result2);
    }

    @Test
    void testMinusWithNotTheSameDenominator() {
        Fraction result1 = fraction1.minus(fraction4);
        Fraction result2 = fraction3.minus(fraction1);
        assertEquals(new FractionNumber(1, 12), result1);
        assertEquals(new FractionNumber(5, 12), result2);
    }

    @Test
    void testDivideWithTheSameDenominator() {
        Fraction result1 = fraction2.divide(fraction1);
        Fraction result2 = fraction3.divide(fraction4);
        assertEquals(new FractionNumber(6, 3), result1); //6/3
        assertEquals(new FractionNumber(12, 4), result2);  //2/2
    }

    @Test
    void testDivideWithNotTheSameDenominator() {
        Fraction result1 = fraction4.divide(fraction1);
        Fraction result2 = fraction2.divide(fraction3);
        assertEquals(new FractionNumber(3, 4), result1);
        assertEquals(new FractionNumber(8, 9), result2);
    }

    @Test
    void testMultiplyWithTheSameDenominator() {
        Fraction result1 = fraction1.multiply(fraction2);
        Fraction result2 = fraction3.multiply(fraction4);
        assertEquals(new FractionNumber(2, 9), result1);
        assertEquals(new FractionNumber(3, 16), result2);
    }

    @Test
    void testMultiplyWithNotTheSameDenominator() {
        Fraction result1 = fraction1.multiply(fraction3);
        Fraction result2 = fraction3.multiply(fraction2);
        assertEquals(new FractionNumber(3, 12), result1);
        assertEquals(new FractionNumber(1, 4), result1);
        assertEquals(new FractionNumber(1, 2), result2);
    }
}

