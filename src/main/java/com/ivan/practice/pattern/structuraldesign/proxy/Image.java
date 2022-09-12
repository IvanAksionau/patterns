package com.ivan.practice.pattern.structuraldesign.proxy;

import javafx.geometry.Point2D;

//Interface implemented by proxy and concrete objects
public interface Image {

    Point2D getLocation();

    void setLocation(Point2D point2d);

    void render();
}
