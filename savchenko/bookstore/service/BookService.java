package com.savchenko.bookstore.service;

import com.savchenko.bookstore.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    void addBook(Book book);

    void updateBook(Optional<Book> book);

    boolean removeBook(Long id);

    Optional<Book> getBookById(Long id);

    Iterable<Book> getAllBooks();

    Iterable<Book> searchByTitle(String search);

    List<Book> findBookByIdIn(List<Long> Ids);
}