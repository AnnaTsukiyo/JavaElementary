package com.savchenko.homeworks.hometask8;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@EqualsAndHashCode
@ToString

public class Author {

    @Getter
    private final String firstName;
    @Getter
    private final String lastName;
    private final Date dateOfBirth;

    public Author(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }

}
