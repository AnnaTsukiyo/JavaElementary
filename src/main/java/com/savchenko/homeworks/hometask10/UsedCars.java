package com.savchenko.homeworks.hometask10;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@EqualsAndHashCode(callSuper = true)

public final class UsedCars extends Car {

    private final int mileage;
    private final String FullNameOfTheBuyer;

    public UsedCars(int yearOfRelease, String countryOfOrigin, String make, double price, String trimLevel, Date dateOfSale, String FullNameOfTheBuyer, int mileage, String fullNameOfTheBuyer, int id) {
        super(yearOfRelease, countryOfOrigin, make, price, trimLevel, dateOfSale, FullNameOfTheBuyer, id);
        this.mileage = mileage;
        this.FullNameOfTheBuyer = fullNameOfTheBuyer;
    }
}
