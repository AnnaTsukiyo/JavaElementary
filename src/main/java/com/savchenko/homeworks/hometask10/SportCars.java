package com.savchenko.homeworks.hometask10;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@EqualsAndHashCode(callSuper = true)

public class SportCars extends Car {

    private final double MaxSpeed;
    private final double EngineVolume;
    private final double Power;

    public SportCars(int yearOfRelease, String countryOfOrigin, String make, double price, String trimLevel, Date dateOfSale, String FullNameOfTheBuyer, double maxSpeed, double engineVolume, double power, int id) {
        super(yearOfRelease, countryOfOrigin, make, price, trimLevel, dateOfSale, FullNameOfTheBuyer, id);
        MaxSpeed = maxSpeed;
        EngineVolume = engineVolume;
        Power = power;
    }
}
