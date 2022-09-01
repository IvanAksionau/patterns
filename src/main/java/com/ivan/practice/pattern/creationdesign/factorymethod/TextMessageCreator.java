package com.ivan.practice.pattern.creationdesign.factorymethod;


import com.ivan.practice.pattern.creationdesign.factorymethod.message.Message;
import com.ivan.practice.pattern.creationdesign.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
