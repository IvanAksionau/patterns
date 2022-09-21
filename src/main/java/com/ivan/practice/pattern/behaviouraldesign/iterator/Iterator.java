package com.ivan.practice.pattern.behaviouraldesign.iterator;

//Iterator interface allowing to iterate over 
//values of an aggregate
public interface Iterator<T> {
    String name = "";

    boolean hasNext();

    T next();
}
