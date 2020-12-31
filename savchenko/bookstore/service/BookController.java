package com.savchenko.bookstore.service;

import com.savchenko.bookstore.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        if (books.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getBookById(@PathVariable("id") long id) {
        Book book = bookService.getBookById(id);
        if (book == null) {
            return new ResponseEntity<>(("ERROR: Book Id " + id + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public ResponseEntity<?> addBook(@RequestBody Book book,
                                        UriComponentsBuilder ucBuilder) {

        bookService.addBook(book);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/book/{id}")
                .buildAndExpand(book.getId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateBook(@PathVariable("id") long id,
                                        @RequestBody Book book) {

        Book currentBook = bookService.getBookById(id);
        currentBook.setTitle(book.getTitle());
        book.setAuthor(book.getIssueYear());
        currentBook.setAuthor(book.getAuthor());
        currentBook.setPrice(book.getPrice());
        bookService.updateBook(currentBook);
        return new ResponseEntity<>(currentBook, HttpStatus.OK);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBook(@PathVariable("id") long id) {

        Book book = bookService.getBookById(id);
        bookService.removeBook(id);
        return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
    }
}
