package com.savchenko.lecture_03;


public class Task01 {

    public static void main(String[] args) {

        String s = "sdsdfs";
        Class<? extends String> aClass = s.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.println(classLoader);
        Task01 task01 = new Task01();
        System.out.println(task01.getClass().getClassLoader());
    }
}
