package com.ivan.practice.pattern.factorymethod;

import com.ivan.practice.pattern.factorymethod.message.Message;

/**
 * Use factory method pattern when you want to delegate object instantiation to subclasses
 * Implementations will be specific to content type.
 */
public class Client {

    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());

        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
}
