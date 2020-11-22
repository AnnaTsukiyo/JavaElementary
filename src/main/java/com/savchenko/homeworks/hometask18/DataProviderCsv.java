package com.savchenko.homeworks.hometask18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DataProviderCsv implements DataProvider {

    private DataMapper mapper = new DataMapper();

    @Override
    public List <Person> provide(String fileName) {
        
        ArrayList<Person> result = new ArrayList<>();
        return result;
    }
}


