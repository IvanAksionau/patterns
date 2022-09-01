package com.ivan.practice.pattern.creationdesign.prototype;

import javafx.geometry.Point3D;

/**
 * We have a complex object that is costly to create.
 * To create more instances of such class, we use an existing instance as our prototype.
 * Prototype allows us to make copies of existing object and save us from having to create objects from scratch
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10, 0, 0), 20);
        s1.attack();

        System.out.println(s1);
        Swordsman s2 = (Swordsman) s1.clone();
        System.out.println("Cloned swordsman" + s2);
    }
}
