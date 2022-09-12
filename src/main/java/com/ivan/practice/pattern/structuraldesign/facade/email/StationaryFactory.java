package com.ivan.practice.pattern.structuraldesign.facade.email;

public class StationaryFactory {

    public static Stationary createStationary() {
        return new HalloweenStationary();
    }
}
