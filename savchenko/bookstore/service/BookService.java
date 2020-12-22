package com.savchenko.bookstore.service;

import com.savchenko.bookstore.model.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);

    void updateBook(Book book);

    boolean removeBook(Long id);

    Book getBookById(Long id);

    List<Book> getAllBooks();

}