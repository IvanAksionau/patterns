package com.ivan.practice.pattern.creationdesign.factorymethod.message;

public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }
}
