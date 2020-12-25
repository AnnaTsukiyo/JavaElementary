package com.savchenko.homeworks.hometask16;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor

public class CovidStatImpl implements CovidStat {

    private final List<Person> persons;

    @Override
    public String getMostPopularName() {
        persons.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        int index = 0;
        int maxCounter = 1;
        int counter = 1;
        for (int i = 1; i < persons.size(); i++) {
            if (persons.get(i).getName().equals(persons.get(i - 1).getName())) {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter;
                    index = i;
                }
            } else {
                counter = 1;
            }
        }
        return persons.get(index).getName();
    }

    @Override

    public double getAverageAge() {
        double sumOfAges = 0;
        for (Person person : persons) {
            sumOfAges += person.getAge();
        }
        return sumOfAges / persons.size();
    }

    @Override
    public double getAverageHeight() {
        double sumOfHeights = 0;
        for (Person person : persons) {
            sumOfHeights += person.getHeight();
        }
        return sumOfHeights / persons.size();
    }

    @Override
    public double getAverageWeight() {
        double sumOfAWeights = 0;
        for (Person person : persons) {
            sumOfAWeights += person.getWeight();
        }
        return sumOfAWeights / persons.size();
    }
}
