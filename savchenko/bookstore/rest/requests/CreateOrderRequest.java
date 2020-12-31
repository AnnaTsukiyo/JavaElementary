package com.savchenko.bookstore.rest.requests;

import lombok.Data;

import java.util.List;

@Data
public class CreateOrderRequest {
    private Long clientId;
    private List<Long> bookIds;


//    public Long getClientId() {
//    }
}
