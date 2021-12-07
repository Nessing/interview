package ru.nessing.interview.lesson_5.dao;

import java.util.ArrayList;

public abstract class Dao<T> {
    public abstract void insert(T student);

    public abstract T getById(long id);

    public abstract void updateById(long id, T student);

    public abstract void deleteById(long id);

    public abstract ArrayList<T> getAll();
}
