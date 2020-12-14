package com.savchenko.homeworks.hometask18.hometask18;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Serialize and save in a file with the data extension of all COVID-patients from the previous homework
 * Write the date of the provider who can read from this file
 * Add a factory method to the main class https://refactoring.guru/uk/design-patterns/factory-method/java/example configure which, based on the file extension, will decide which of the data providers to create file name
 */

@Data
@Builder

public class Person implements Serializable {

    final static long SerialVersionID = 1L;

    private final String name;
    private final String surname;
    private final int age;
    private final int height;
    private final int weight;
    private final String email;


}
