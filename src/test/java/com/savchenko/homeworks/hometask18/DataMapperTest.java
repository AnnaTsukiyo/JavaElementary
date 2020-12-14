package com.savchenko.homeworks.hometask18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DataMapperTest {

    @Test
    void map() {
        Person expectedPerson = new Person.PersonBuilder().name("Eugene").surname("Berezhnyi").age(32).height(170).weight(81).email("berezhnoy87@gmail.com").build();
        Person person = new DataMapper().map("Eugene,Berezhnyi,32,170,81,berezhnoy87@gmail.com");
        assertEquals(expectedPerson, person);
    }
}