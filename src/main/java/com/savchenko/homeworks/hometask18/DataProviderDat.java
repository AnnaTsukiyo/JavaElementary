package com.savchenko.homeworks.hometask18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DataProviderDat implements DataProvider {
    @Override
    public List<Person> provide(String fileName) {

        List<Person> userList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(".src/test/resources/data.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o;
            while ((o = objectInputStream.readObject()) != null) {
                userList.add((Person) o);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        return userList;
    }
}
