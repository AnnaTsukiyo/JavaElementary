package com.savchenko.bookstore;

import com.savchenko.bookstore.service.ValidatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class BookStoreApplication {

    public static void main(String[] args) {
        log.info("MAIN");
        SpringApplication.run(BookStoreApplication.class, args);
    }

    @Bean
    ValidatorService getValidatorService() {
        log.info("CREATING VALIDATION BEAN");
        return new ValidatorService("validation service");
    }
}
