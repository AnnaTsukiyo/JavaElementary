package com.savchenko.homeworks.hometask16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CovidStatTest {

    List<Person> people;
    CovidStat stat;

    @BeforeEach
    void setUp() {

        people = new ArrayList<>(List.of(

                new Person.PersonBuilder().name("Anna").surname("Salvatore").age(26).height(170).weight(110).mail("anna_salvatore@gmail.com").build(),
                new Person.PersonBuilder().name("Anna").surname("Salvatore").age(26).height(170).weight(110).mail("anna_salvatore@gmail.com").build(),
                new Person.PersonBuilder().name("Alex").surname("Ryan").age(34).height(160).weight(67).mail("bobryan@gmail.com").build(),
                new Person.PersonBuilder().name("Anna").surname("Aleksandrova").age(40).height(167).weight(76).mail("anna.alexeenko@mail.ru").build(),
                new Person.PersonBuilder().name("Andrew").surname("Tiram").age(35).height(171).weight(78).mail("andrewtiram@mail.ru").build(),
                new Person.PersonBuilder().name("Alex").surname("Leto").age(25).height(182).weight(99).mail("bobleto@mail.ru").build()));

        stat = new CovidStatImpl(people);
    }

    @Test
    void getMostPopularName() {
        assertEquals("Alex", stat.getMostPopularName());
    }

    @Test
    void getAverageAge() {
        assertEquals(32, stat.getAverageAge());

    }

    @Test
    void getAverageHeight() {
        assertEquals(170, stat.getAverageHeight());
    }

    @Test
    void getAverageWeight() {
        assertEquals(86, stat.getAverageWeight());

    }
}