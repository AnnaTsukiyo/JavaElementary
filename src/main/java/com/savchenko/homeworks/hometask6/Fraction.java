package com.savchenko.homeworks.hometask6;

public interface Fraction {

    int getNumerator();

    int getDenominator();

    Fraction plus(Fraction other);

    Fraction minus(Fraction other);

    Fraction divide(Fraction other);

    Fraction multiply(Fraction other);

}
