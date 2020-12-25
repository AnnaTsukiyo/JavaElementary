package com.savchenko.homeworks.hometask18;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeFile {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        try {
            List<Person> fileOutputStream = new DataProviderCsv().provide("/Users/annasavchenko/IdeaProjects/JavaElementary/src/test/resources/data.csv");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/annasavchenko/IdeaProjects/JavaElementary/src/test/resources/data.dat"));
            for (Person person : persons) {
                oos.writeObject(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}