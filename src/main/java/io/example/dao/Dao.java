package io.example.dao;

import java.util.List;

public interface Dao<T> {
    List<T> getAll();
     
    boolean add(T t);
}