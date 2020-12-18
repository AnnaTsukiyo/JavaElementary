package com.savchenko.bookstore.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValidatorService {
    private String nameOfService;

    public ValidatorService(String nameOfService) {
        log.info("CREATION Validator Service");
        this.nameOfService = nameOfService;
    }
}