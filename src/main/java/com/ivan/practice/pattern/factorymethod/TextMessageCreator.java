package com.ivan.practice.pattern.factorymethod;


import com.ivan.practice.pattern.factorymethod.message.Message;
import com.ivan.practice.pattern.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
