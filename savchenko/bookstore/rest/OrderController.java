package com.savchenko.bookstore.rest;

import com.savchenko.bookstore.model.Order;
import com.savchenko.bookstore.rest.requests.CreateOrderRequest;
import com.savchenko.bookstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public Long createOrder(@RequestBody CreateOrderRequest request) {
        return orderService.createOrder(request);
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public Iterable<Order> getAllBooks() {
        return orderService.getOrders();
    }
}