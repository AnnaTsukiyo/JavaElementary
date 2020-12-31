package com.savchenko.homeworks.hometask16;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataProviderTest {

    @Test
    void provideWithNotExistingFile() {
        List<Person> personList = new DataProvider().provide("Not_Existing_File");
        assertNotNull(personList);
        assertTrue(personList.isEmpty());
    }

    @Test
    void provide() throws IOException {
        List<Person> personList = new DataProvider().provide("./src/test/resources/data.csv");
        assertNotNull(personList);
        assertFalse(personList.isEmpty());
    }
}