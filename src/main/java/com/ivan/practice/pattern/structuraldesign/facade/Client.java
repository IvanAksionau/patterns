package com.ivan.practice.pattern.structuraldesign.facade;

/**
 * Client has to interact with a large number of interfaces and classes in a subsystem to get result.
 * So client gets tightly coupled with those interfaces & classes. Facade solves this problem.
 * <p>
 * Facade provides a simple and unified interface to a subsystem.
 * Client interacts with just the facade now to get same result.
 * <p>
 * Facade should minimize the complexity of subsystem and provide usable interface.
 * java.net.URL is an example of facade pattern
 */

import com.ivan.practice.pattern.structuraldesign.facade.email.EmailFacade;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("101", 99.99);
        EmailFacade facade = new EmailFacade();

        boolean result = facade.sendOrderEmail(order);

        System.out.println("Order Email " + (result ? "sent!" : "NOT sent..."));
    }
}
