package com.ivan.practice.pattern.structuraldesign.decorator;

/**
 * When we want to enhance behaviour of our existing object dynamically
 * as and when required then we can use decorator design pattern.
 * <p>
 * Decorator wraps an object within itself and provides same interface as the wrapped object.
 * So the client of original object doesn't need to change.
 * <p>
 * A decorator provides alternative to subclassing for extending functionality of existing classes.
 * <p>
 * Decorators are more flexible than interface. Inheritance is static by definition
 * but decorators allow you to dynamically compose behaviour using objects at runtime.
 * En example of usage is java.io.BufferedOutputStream class
 */
public class Client {

    public static void main(String[] args) {
        Message m = new TextMessage("The <FORCE> is strong with this one!");
        System.out.println(m.getContent());

        Message decorator = new HtmlEncodedMessage(m);
        System.out.println(decorator.getContent());

        decorator = new Base64EncodedMessage(decorator);
        System.out.println(decorator.getContent());
    }
}
