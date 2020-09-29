package com.savchenko.homeworks.hometask6;

import java.util.Objects;

/**
 * Write a FractionNumber class to represent the Fractional data type
 * The class must have two fields
 * The class must have methods (plus, minus, multiply, divide)
 * Also, the class must have a toString method that prints the fraction as "2/3"
 * Make this data type immutable
 */

public class FractionNumber implements Fraction {

    private final int numerator;
    private final int denominator;

    public FractionNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Divide by zero: Denominator for Fraction is zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    @Override
    public Fraction plus(Fraction other) {
        int numerator = getNumerator() * other.getDenominator() + other.getNumerator() * getDenominator();
        int denominator = getDenominator() * other.getDenominator();
        if (denominator % numerator == 0) {
            denominator = denominator / numerator;
            numerator = numerator / numerator;
        }
        return new FractionNumber(numerator, denominator);
    }

    @Override
    public Fraction minus(Fraction other) {
        int numerator = getNumerator() * other.getDenominator() - other.getNumerator() * getDenominator();
        int denominator = getDenominator() * other.getDenominator();
        if (denominator % numerator == 0) {
            denominator = denominator / numerator;
            numerator = numerator / numerator;
        }
        return new FractionNumber(numerator, denominator);
    }

    @Override
    public Fraction divide(Fraction other) {

        int numerator = getNumerator() * other.getDenominator();
        int denominator = getDenominator() * other.getNumerator();
        if (denominator % numerator == 0) {
            denominator = denominator / numerator;
            numerator = numerator / numerator;
        }
        return new FractionNumber(numerator, denominator);
    }

    @Override
    public Fraction multiply(Fraction other) {
        int numerator = getNumerator() * other.getNumerator();
        int denominator = getDenominator() * other.getDenominator();
        if (denominator % numerator == 0) {
            denominator = denominator / numerator;
            numerator = numerator / numerator;
        }
        return new FractionNumber(numerator, denominator);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!getClass().equals(object.getClass())) {
            return false;
        }
        final Fraction other = (Fraction) object;
        return getNumerator() / (double) getDenominator()
                == other.getNumerator() / (double) other.getDenominator();
    }

    @Override
    public int hashCode() {
        double result = (double) numerator / (double) denominator;
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
