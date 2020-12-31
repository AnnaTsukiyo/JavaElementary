package com.savchenko.homeworks.hometask16;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Person {

    private final String name;
    private final String surname;
    private final int age;
    private final int height;
    private final int weight;
    private final String email;


}
