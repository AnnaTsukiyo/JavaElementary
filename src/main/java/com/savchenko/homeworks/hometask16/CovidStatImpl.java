package com.savchenko.homeworks.hometask16;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.TreeMap;

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
    public String getMostPopularSurname() {
        persons.sort((p1, p2) -> p1.getSurname().compareTo(p2.getSurname()));
        int index = 0;
        int maxCounter = 1;
        int counter = 1;
        for (int i = 1; i < persons.size(); i++) {
            if (persons.get(i).getSurname().equals(persons.get(i - 1).getSurname())) {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter;
                    index = i;
                }
            } else {
                counter = 1;
            }
        }
        return persons.get(index).getSurname();
    }

    @Override
    public String getMostPopularDomain() {
        TreeMap<String, Integer> domainsMap = new TreeMap<>();

        for (Person p : persons) {
            String domain = p.getEmail().split("@")[1];
            if (domainsMap.get(domain) != null) {
                domainsMap.put(domain, domainsMap.get(domain) + 1);
            } else {
                domainsMap.put(domain, 1);
            }
        }
        int maxCounter = 1;
        String mostPopularDomain = "";
        for (String key : domainsMap.keySet()) {
            if (domainsMap.get(key) > maxCounter) {
                mostPopularDomain = key;
                maxCounter = domainsMap.get(key);
            }
        }
        return mostPopularDomain;
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
