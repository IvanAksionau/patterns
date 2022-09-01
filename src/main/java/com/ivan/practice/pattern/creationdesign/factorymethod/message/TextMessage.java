package com.ivan.practice.pattern.creationdesign.factorymethod.message;

public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "Text";
    }
}
