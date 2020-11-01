package com.savchenko.homeworks.hometask16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private DataMapper mapper = new DataMapper();

    public List<Person> provide(String fileName) {
        ArrayList<Person> result = new ArrayList<>();
        List<String> personsData = readDataFromFile(fileName);
        for (String s : personsData) {
            result.add(mapper.map(s));
        }
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

