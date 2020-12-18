package com.savchenko.homeworks.hometask10;

import lombok.Data;

import java.util.HashMap;

@Data

public final class SoldCarsStorage {

    private HashMap<Integer, Car> inventory = new HashMap<>();
    private int maxSize = 1000;

    public void addCar(Car newCar) throws Exception {
        if (inventory.size() == maxSize) {
            throw new Exception("Size Exceeded");
        } else {
            inventory.put(newCar.ID, newCar);
        }
    }

    void printListOfCars() {
        inventory.forEach((k, v) -> System.out.println(inventory.get(k).toString()));
    }
}
