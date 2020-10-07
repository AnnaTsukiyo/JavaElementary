package com.savchenko.homeworks.hometask10;

import lombok.*;

/**
 * Cars sale.
 * Create parent abstract class "Transport" (year of release, country of origin)
 * And the specific class "Car" extended from it (brand, price, equipment, date of sale, buyer's full name) and child classes:
 * -) "Used car" (mileage, full name of the owner)
 * -) "Sports car" (max speed, engine capacity, power)
 * -) "Special equipment" (type, weight)
 * Implement a class for storing sold cars with a method for adding a new car (maximum 1000 cars) and a method for displaying a list of cars
 * Implement additional classes if necessary.
 */

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public abstract class Transport {

    protected int yearOfRelease;
    protected String countryOfOrigin;
}
