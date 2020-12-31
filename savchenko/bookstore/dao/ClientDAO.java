package com.savchenko.bookstore.dao;

import com.savchenko.bookstore.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDAO extends CrudRepository<Client, Long> {
}
