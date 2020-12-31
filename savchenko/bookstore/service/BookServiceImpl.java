package com.savchenko.bookstore.service;

import com.savchenko.bookstore.dao.BookDao;
import com.savchenko.bookstore.dao.BookRepository;
import com.savchenko.bookstore.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void updateBook(Optional<Book> book) {
        //bookRepository.updateBook(book);
    }

    @Override
    public boolean removeBook(Long id) {
        // return bookRepository.removeBook(id);
        return true;
    }

    @Override
    @Transactional
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    @Transactional
    public Iterable<Book> getAllBooks() {
        //   return bookRepository.getAllBooks();
        return bookRepository.findAll();
    }

    @Override
    public Iterable<Book> searchByTitle(String search) {
        return bookRepository.findBookByTitle("%" + search + "%");
    }

    @Override
    public List<Book> findBookByIdIn(List<Long> bookIds) {
        return bookRepository.findBookByIdIn(bookIds);
    }
}

