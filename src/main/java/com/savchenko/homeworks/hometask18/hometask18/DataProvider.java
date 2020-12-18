package com.savchenko.homeworks.hometask18.hometask18;

import java.io.FileNotFoundException;
import java.util.List;

public interface DataProvider {

    List <Person> provide(String fileName) throws FileNotFoundException;
}
