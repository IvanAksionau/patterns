package com.ivan.practice.pattern.creationdesign.abstractfactory;

//Represents an abstract product
public interface Instance {
    void start();

    void attachStorage(Storage storage);

    void stop();

    enum Capacity {micro, small, large}
}
