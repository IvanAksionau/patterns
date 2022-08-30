package com.ivan.practice.solidprinciple.depinv;

public interface Formatter {

    String format(Message message) throws FormatException;
}
