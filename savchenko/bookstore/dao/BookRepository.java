package com.savchenko.bookstore.dao;

import com.savchenko.bookstore.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {

    @Override
    Optional<Book> findById (Long along);

    Iterable<Book> findBookByTitle (String Title);
    List<Book> findBookByIdIn (List<Long> Ids);

}