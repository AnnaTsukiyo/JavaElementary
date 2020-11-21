package com.savchenko.homeworks.hometask18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DataProviderCsv implements DataProvider {

    private DataMapper mapper = new DataMapper();

//    public List<String> readDataFromFile(String fileName) {
//        try {
//            return Files.readAllLines(Path.of(fileName));
//        } catch (IOException e) {
//            System.out.println("No File!!!");
//            return new ArrayList<>();
//        }
//    }

    @Override
    public List <Person> provide(String fileName) {
        ArrayList<Person> result = new ArrayList<>();
    //    List<String> personsData = readDataFromFile(fileName);
     //   for (String s : personsData) {
     //       result.add(mapper.map(s));
      //  }
        return result;
    }
}


