package com.savchenko.homeworks.hometask18;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataProviderCsvTest {

    @Test
    void provideWithNotExistingFile() {
        List<Person> personList = new DataProviderCsv().provide("Not_Existing_File");
        assertNotNull(personList);
        assertTrue(personList.isEmpty());
    }

    @Test
    void provide() throws IOException {
        List<Person> personList = new DataProviderCsv().provide("./src/test/resources/data.csv");
        assertNotNull(personList);
        assertFalse(personList.isEmpty());
    }
}