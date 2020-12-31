package com.savchenko.bookstore.service;

import com.savchenko.bookstore.dao.OrderDao;
import com.savchenko.bookstore.model.Book;
import com.savchenko.bookstore.model.Client;
import com.savchenko.bookstore.model.Order;
import com.savchenko.bookstore.rest.requests.CreateOrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Autowired
    ClientService clientService;

    @Autowired
    BookService bookService;

    @Override
    public Long createOrder(CreateOrderRequest request) {
        Order order = new Order();
        List<Book> books = bookService.findBookByIdIn(request.getBookIds());
        Optional<Client> clientOptional = clientService.getClient(request.getClientId());
        if (clientOptional.isPresent()) {
            Client client = clientOptional.get();
            order.setClient(client);
            order.setBooks(books);
            order = orderDao.save(order);
            return order.getId();
        }
        return 0L;
    }

    @Override
    public Iterable<Order> getOrders() {
        return orderDao.findAll();
    }
}
