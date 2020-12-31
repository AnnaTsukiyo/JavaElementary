package com.savchenko.bookstore.dao;

import com.savchenko.bookstore.model.Book;

import java.util.List;

public interface BookDao {

    void addBook(Book book);

    void updateBook(Book book);

    boolean removeBook(Long id);

    Book getBookById(Long id);

    List<Book> getAllBooks();

}