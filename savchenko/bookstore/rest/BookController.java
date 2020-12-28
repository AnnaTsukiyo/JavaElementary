package com.savchenko.bookstore.rest;

import com.savchenko.bookstore.model.Book;
import com.savchenko.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = (List<Book>) bookService.getAllBooks();
        if (books.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getBookById(@PathVariable("id") long id) {
        Optional<Book> book = bookService.getBookById(id);
        if (book.isEmpty()) {
            return new ResponseEntity<>(("ERROR: Book Id " + id + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public ResponseEntity<?> addBook(@RequestBody Book book, UriComponentsBuilder ucBuilder) {
        bookService.addBook(book);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/book/{id}")
                .buildAndExpand(book.getId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateBook(@PathVariable("id") long id, @RequestBody Book book) {

        Optional<Book> currentBook = bookService.getBookById(id);
        currentBook.get().setTitle(book.getTitle());
        currentBook.get().setIssueYear(book.getIssueYear());
        currentBook.get().setAuthor(book.getAuthor());
        currentBook.get().setTitle(book.getTitle());
        bookService.updateBook(currentBook);
        return new ResponseEntity<>(currentBook, HttpStatus.OK);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBook(@PathVariable("id") long id) {
        Optional<Book> book = bookService.getBookById(id);
        bookService.removeBook(id);
        return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
    }
}