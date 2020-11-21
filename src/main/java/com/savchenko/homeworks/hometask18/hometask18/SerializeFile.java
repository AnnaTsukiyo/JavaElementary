package com.savchenko.homeworks.hometask18.hometask18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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