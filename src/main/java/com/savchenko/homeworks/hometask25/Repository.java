package com.savchenko.homeworks.hometask25;

import java.util.List;

/**
 * 1.Create POJOs in DB
 * 2.Create the Repository <T> interface
 * 3.Create methods in it
 *
 * T getById (Long Id);
 * List <T> getAll ();
 * void delete (Long Id);
 * boolean exists (Long id)
 * Long count ();
 * T insert (T);
 *
 * 4.Create the implementation of this repository CityRepository <City>
 * 5.Create an implementation of this repository CountryRepository <Country>
 * Country code can be thought of as ID
 *
 * */

public interface Repository<T> {

    T getById(long id);

    List<T> getAll();

    void delete(long id);

    boolean exists(long id);

    Long count();

    T insert(T object);
}

