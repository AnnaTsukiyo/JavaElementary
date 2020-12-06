package com.savchenko.homeworks.hometask16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private final DataMapper mapper = new DataMapper();

    public List<Person> provide(String fileName) {
        ArrayList<Person> result = new ArrayList<>();
        List<String> personsData = readDataFromFile(fileName);
        personsData.forEach(e -> result.add(mapper.map(e)));
        return result;
    }

    private List<String> readDataFromFile(String fileName) {
        try {
            return Files.readAllLines(Path.of(fileName));
        } catch (IOException e) {
            System.out.println("No File!!!");
            return new ArrayList<>();
        }
    }
}

