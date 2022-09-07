package com.ivan.practice.pattern.creationdesign.objectpool;

import javafx.geometry.Point2D;

//concrete reusable
public class Bitmap implements Image {

    private final String name;
    private Point2D location;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name + " @ " + location);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Bitmap is reset");
    }
}
