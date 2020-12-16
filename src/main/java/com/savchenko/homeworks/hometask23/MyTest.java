package com.savchenko.homeworks.hometask23;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 1.Copy the testes that were for Fraction
 * 2.For simplicity, if you had the @Before annotation, you can remove it and make initialization where the fields are declared
 * 3.Create Annotation MyTest
 * 4.Replace @Test annotations with @MyTest annotations
 * 5.Write your own test runner which will call the methods marked annotation test using reflection.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyTest {

}
