package com.ivan.practice.pattern.creationdesign.factorymethod;


import com.ivan.practice.pattern.creationdesign.factorymethod.message.JSONMessage;
import com.ivan.practice.pattern.creationdesign.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
