package com.savchenko.bookstore.rest;

import com.savchenko.bookstore.service.HelloGreater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Autowired
    HelloGreater helloGreater;

    @RequestMapping("/")
    String home() {
        return helloGreater.printHello();
    }
}