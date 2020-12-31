package com.savchenko.bookstore.service;

import com.savchenko.bookstore.model.Order;
import com.savchenko.bookstore.rest.requests.CreateOrderRequest;

public interface OrderService {

    Long createOrder(CreateOrderRequest request);

    Iterable<Order> getOrders();
}
