package com.ivan.practice.pattern.creationdesign.singleton;

/**
 * This class uses eager initialization of singleton instance.
 * Recommended to use
 */
public class EagerRegistry {

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    private EagerRegistry() {

    }

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}