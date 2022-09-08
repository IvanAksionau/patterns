package com.ivan.practice.pattern.structuraldesign.bridge;

/**
 * Our implementations & abstractions are generally coupled to each other in normal inheritance.
 * Using bridge pattern we can decouple them, so they can both change without affecting each other.
 * <p>
 * We achieve this feat by creating two separate inheritance hierarchies -
 * one for implementation and another for abstraction.
 * En example of usage is
 */
public class Client {

    public static void main(String[] args) {
        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(10);
        collection.offer(40);
        collection.offer(99);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        //
        System.out.println(collection.poll());
    }
}
