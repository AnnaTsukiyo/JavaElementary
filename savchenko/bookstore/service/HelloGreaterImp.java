package com.savchenko.bookstore.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloGreaterImp implements HelloGreater {

    @Value("${main.user}")
    String userName;

    public HelloGreaterImp() {
        log.info("CREATION HelloGreaterImp");
    }

    @Override
    public String printHello() {
        return "Hello, " + userName;
    }
}
