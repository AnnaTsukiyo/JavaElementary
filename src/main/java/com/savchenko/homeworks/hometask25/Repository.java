package com.savchenko.homeworks.hometask25;

import java.util.List;

public interface Repository<T> {

    T getById(long id);

    List<T> getAll();

    void delete(long id);

    boolean exists(long id);

    Long count();

    T insert(T object);
}