package com.savchenko.homeworks.hometask6;

import java.util.Objects;

/**
 * Write a FractionNumber class to represent the Fractional data type
 * The class must have two fields
 * The class must have methods (plus, minus, multiply, divide)
 * Also, the class must have a toString method that prints the fraction as "2/3"
 * Make this data type immutable
 */

public class FractionNumber {

    private final int numerator;
    private final int denominator;

    public FractionNumber(int numerator, int denominator) {
        if (denominator == 0)
            throw new ArithmeticException("Divide by zero: Denominator for Fraction is zero.");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
    public static FractionNumber negative (FractionNumber frac)
    {
        return new FractionNumber(-frac.getNumerator(), frac.getDenominator());
    }
    public FractionNumber negative()
    {
        return new FractionNumber(-numerator, denominator);
    }

        public FractionNumber minus(FractionNumber frac) {
        return new FractionNumber(numerator * frac.getDenominator()
                - denominator * frac.getNumerator(),
                denominator * frac.getDenominator());
    }

    public FractionNumber multiply(FractionNumber frac) {
        return new FractionNumber(numerator * frac.getNumerator(),
                denominator * frac.getDenominator());
    }

    public FractionNumber divide(FractionNumber other) {
        int n = numerator * other.denominator;
        int d = denominator * other.numerator;
        return new FractionNumber(n, d);
    }

    public int compareTo(FractionNumber other) {
        int myCommon = numerator * other.denominator;
        int otherCommon = other.numerator * denominator;
        return myCommon - otherCommon;
    }

    @Override
    public boolean equals(Object frac) {
        if (frac == null) {
            return false;
        }
        return frac instanceof FractionNumber
                && numerator == ((FractionNumber) frac).getNumerator()
                && denominator == ((FractionNumber) frac).getDenominator();
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
