package org.example.abstractfactory;

public abstract class DaoAbstractFactory {
    public abstract Dao createDao(String type);
}