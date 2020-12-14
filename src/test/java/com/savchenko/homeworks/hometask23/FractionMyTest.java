package com.savchenko.homeworks.hometask23;

import com.savchenko.homeworks.hometask6.Fraction;
import com.savchenko.homeworks.hometask6.FractionNumber;

import static org.junit.jupiter.api.Assertions.*;

public class FractionMyTest {

    private static final Fraction fraction1 = new FractionNumber(1, 3);
    private static final Fraction fraction2 = new FractionNumber(2, 3);
    private static final Fraction fraction3 = new FractionNumber(3, 4);
    private static final Fraction fraction4 = new FractionNumber(1, 4);

    @MyTest
    static void badFractionCreation() {
        assertThrows(IllegalArgumentException.class, () -> new FractionNumber(1, 0));
    }

    @MyTest
    static void testEquals() throws ClassNotFoundException {
      
        Class c = Class.forName("src/test/java/com/savchenko/homeworks/hometask23/FractionMyTest.java");
        System.out.println(c.toString());
        assertEquals(new FractionNumber(1, 3), fraction1);
        assertEquals(new FractionNumber(2, 3), fraction1);
        assertEquals(new FractionNumber(3, 4), new FractionNumber(1, 4));

    }

    @MyTest
    static void testPlusWithTheSameDenominator() {
        Fraction result1 = fraction1.plus(fraction2);
        Fraction result2 = fraction3.plus(fraction4);
        assertEquals(new FractionNumber(3, 3), result1);
        assertEquals(new FractionNumber(1, 1), result1);
        assertEquals(new FractionNumber(4, 4), result2);
        assertEquals(new FractionNumber(1, 1), result2);
    }

    @MyTest
    static void testPlusWithNotTheSameDenominator() {
        Fraction result = fraction1.plus(fraction3);
        assertEquals(new FractionNumber(13, 12), result);
    }

    @MyTest
    static void testMinusWithTheSameDenominator() {
        Fraction result1 = fraction2.minus(fraction1);
        Fraction result2 = fraction3.minus(fraction4);
        assertEquals(new FractionNumber(1, 3), result1);
        assertEquals(new FractionNumber(1, 2), result2);
    }

    @MyTest
    void testMinusWithNotTheSameDenominator() {
        Fraction result1 = fraction1.minus(fraction4);
        Fraction result2 = fraction3.minus(fraction1);
        assertEquals(new FractionNumber(1, 12), result1);
        assertEquals(new FractionNumber(5, 12), result2);
    }

    @MyTest
    void testDivideWithTheSameDenominator() {
        Fraction result1 = fraction2.divide(fraction1);
        Fraction result2 = fraction3.divide(fraction4);
        assertEquals(new FractionNumber(6, 3), result1);
        assertEquals(new FractionNumber(12, 4), result2);
    }

    @MyTest
    void testDivideWithNotTheSameDenominator() {
        Fraction result1 = fraction4.divide(fraction1);
        Fraction result2 = fraction2.divide(fraction3);
        assertEquals(new FractionNumber(3, 4), result1);
        assertEquals(new FractionNumber(8, 9), result2);
    }

    @MyTest
    void testMultiplyWithTheSameDenominator() {
        Fraction result1 = fraction1.multiply(fraction2);
        Fraction result2 = fraction3.multiply(fraction4);
        assertEquals(new FractionNumber(2, 9), result1);
        assertEquals(new FractionNumber(3, 16), result2);
    }

    @MyTest
    void testMultiplyWithNotTheSameDenominator() {
        Fraction result1 = fraction1.multiply(fraction3);
        Fraction result2 = fraction3.multiply(fraction2);
        assertEquals(new FractionNumber(3, 12), result1);
        assertEquals(new FractionNumber(1, 4), result1);
        assertEquals(new FractionNumber(1, 2), result2);
    }
}