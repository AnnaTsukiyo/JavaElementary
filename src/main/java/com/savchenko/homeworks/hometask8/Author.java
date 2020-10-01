package com.savchenko.homeworks.hometask8;

import java.util.Date;
import java.util.Objects;

public class Author {

    private final String firstName;
    private final String lastName;
    private final Date dateOfBirth;

    public Author(String firstName, String lastName, Date dateOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName) &&
                lastName.equals(author.lastName) &&
                dateOfBirth.equals(author.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Author's name is :" + firstName + '\'' + lastName + '\'' + " Date of birth is " + dateOfBirth;
    }
}
