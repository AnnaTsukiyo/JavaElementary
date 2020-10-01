package com.savchenko.homeworks.hometask8;

import java.util.Date;

public class Author {

    private static String firstName;
    private static String lastName;
    private static Date dateOfBirth;

    public Author(String firstName, String lastName, Date dateOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Author's name is :" + firstName + '\'' + lastName + '\'' + " Date of birth is " + dateOfBirth;
    }
}
