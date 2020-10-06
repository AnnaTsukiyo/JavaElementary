package com.savchenko.homeworks.hometask10;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@EqualsAndHashCode(callSuper = true)

public class Car extends Transport {

    final int ID;
    private final String make;
    private final double price;
    private final String trimLevel;
    private final Date dateOfSale;
    private final String FullNameOfTheBuyer;

    public Car(int yearOfRelease, String countryOfOrigin, String make, double price, String trimLevel, Date dateOfSale, String FullNameOfTheBuyer, int id) {
        super(yearOfRelease,countryOfOrigin);
        this.make = make;
        this.price = price;
        this.trimLevel = trimLevel;
        this.dateOfSale = new Date(dateOfSale.getTime());
        this.FullNameOfTheBuyer = FullNameOfTheBuyer;
        ID = id;
    }

    public Date getIssueDate() {
        return new Date(dateOfSale.getTime());
    }

}
