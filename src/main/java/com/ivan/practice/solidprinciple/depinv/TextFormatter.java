package com.ivan.practice.solidprinciple.depinv;

public class TextFormatter implements Formatter {

    public String format(Message message) {
        return message.getTimestamp() + ":" + message.getMsg();
    }
}
