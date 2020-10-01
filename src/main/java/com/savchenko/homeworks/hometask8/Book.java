package com.savchenko.homeworks.hometask8;


import java.util.Date;
import java.util.Objects;

/**
 * Create an immutable class Book containing fields Author author, Date issueDate, Genre genre (Enum), Long isbn.
 * Author must contain fields firstName, lastName, dateOfBirth;
 * Equals, hashCode, toString needs to be redefined everywhere
 * In Enum constants for example FAIRY_TALE while printing should print "Fairy tale"
 */
public final class Book {

    private static Genre genre;
    private final Author author;
    private final Date issueDate;
    private final Long isbn;

    public Book(Author author, Date issueDate, Genre genre, Long isbn) {
        this.author = author;
        this.issueDate = issueDate;
        this.genre = genre;
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public Long getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(issueDate, book.issueDate) &&
                genre == book.genre &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, issueDate, genre, isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", issue date=" + issueDate +
                ", genre=" + genre +
                ", isbn of the book=" + isbn +
                '}';
    }
}
