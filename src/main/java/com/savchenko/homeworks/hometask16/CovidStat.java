package com.savchenko.homeworks.hometask16;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

@AllArgsConstructor
public class CovidStat {

    private final List<Person> personList;

    public String getMostPopularName() {
        return (getMostCommonAttribute(personList, Person::getName));
    }

    public String getMostPopularSurname() {
        return (getMostCommonAttribute(personList, Person::getSurname));
    }

    public String getMostPopularDomain() {
        return (getMostCommonAttribute(personList, Person::getEmail));
    }

    public double getAverageAge() {
        return (getAverageAttribute(personList, Person::getAge));
    }

    public double getAverageHeight() {
        return (getAverageAttribute(personList, Person::getHeight));
    }

    public double getAverageWeight() {
        return (getAverageAttribute(personList, Person::getWeight));
    }

    private String getMostCommonAttribute(List<Person> personList, Function<Person, String> getAttribute) {

        Map<String, Integer> map = new TreeMap<>();

        for (Person p : personList) {
            Integer value = map.get(getAttribute.apply(p));
            map.put(getAttribute.apply(p), value == null ? 1 : value + 1);

        }
        int max = 0;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (max < e.getValue()) {
                max = e.getValue();
            }
        }
        String result = null;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (max == e.getValue()) {
                result = e.getKey();
                break;
            }
        }
        return result;
    }

    private double getAverageAttribute(List<Person> personList, Function<Person, Integer> getAttribute) {
        final int[] sum = {0};
        personList.forEach(p-> sum[0] = getAttribute.apply(p));
        return (double) sum[0] / personList.size();
    }

}
