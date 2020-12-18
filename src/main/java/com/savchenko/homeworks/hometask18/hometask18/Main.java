package com.savchenko.homeworks.hometask18.hometask18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static DataProvider dataProvider;

    public static void main(String[] args) throws IOException {
        List<Person> userList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the name of the file");
        String fileName = bufferedReader.readLine();
        configure(fileName);
    }

    static void configure(String fileName) {
        String[] split = fileName.split("\\.");
        String ext = split[split.length - 1];
        if (ext.equals("dat")) {
            dataProvider  = new DataProviderDat();
        } else if (ext.equals("csv")) {
             dataProvider = new DataProviderCsv();
        } else {
            System.out.println("Error in the file extension!");
        }
    }
}
