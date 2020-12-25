package com.savchenko.homeworks.hometask23;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {

        Class cl = Class.forName("com/savchenko/homeworks/hometask23/FractionMyTest.java");

        Method[] method = cl.getMethods();
        for (Method md : method) {
            if (md.isAnnotationPresent(MyTest.class)) {
                md.invoke(null);
            }
        }
        System.out.println("The end");
    }
}