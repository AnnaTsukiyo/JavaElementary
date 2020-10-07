package com.savchenko.homeworks.hometask10;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@EqualsAndHashCode(callSuper = true)

public final class SpecialEquipment extends Car {

    private final String type;
    private final int weight;

    public SpecialEquipment(int yearOfRelease, String countryOfOrigin, String make, double price, String trimLevel, Date dateOfSale, String FullNameOfTheBuyer, String type, int weight, int id) {
        super(yearOfRelease, countryOfOrigin, make, price, trimLevel, dateOfSale, FullNameOfTheBuyer, id);
        this.type = type;
        this.weight = weight;
    }
}
