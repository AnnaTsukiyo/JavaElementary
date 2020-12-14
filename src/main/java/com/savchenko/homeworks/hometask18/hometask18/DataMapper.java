package com.savchenko.homeworks.hometask18.hometask18;

public class DataMapper {

    public Person map(String userData) {
        String[] data = userData.split(",");
        return new Person(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5]);
    }
}