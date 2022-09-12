package com.ivan.practice.pattern.structuraldesign.flyweight;

//Interface implemented by Flyweights
public interface ErrorMessage {
    //Get error message
    String getText(String code);
}
