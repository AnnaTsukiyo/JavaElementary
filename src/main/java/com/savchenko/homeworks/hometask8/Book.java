package com.savchenko.homeworks.hometask8;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

/**
 * Create an immutable class Book containing fields Author author, Date issueDate, Genre genre (Enum), Long isbn.
 * Author must contain fields firstName, lastName, dateOfBirth;
 * Equals, hashCode, toString needs to be redefined everywhere
 * In Enum constants for example FAIRY_TALE while printing should print "Fairy tale"
 */

@Getter
@EqualsAndHashCode
@ToString

public final class Book {

    @Getter
    private final Author author;
    @Getter
    private final Long isbn;
    private final Date issueDate;
    @Getter
    private Genre genre;

    public Book(Author author, Date issueDate, Genre genre, Long isbn) {
        this.author = author;
        this.issueDate = new Date(issueDate.getTime());
        this.genre = genre;
        this.isbn = isbn;
    }

    public Date getIssueDate() {
        return new Date(issueDate.getTime());
    }

}

