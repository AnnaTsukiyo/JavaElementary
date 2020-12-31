package com.savchenko.bookstore.dao;

import com.savchenko.bookstore.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends CrudRepository<Order,Long> {
}
