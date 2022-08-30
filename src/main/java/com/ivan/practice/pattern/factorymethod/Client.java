package com.ivan.practice.pattern.factorymethod;


import com.ivan.practice.pattern.factorymethod.message.Message;

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
