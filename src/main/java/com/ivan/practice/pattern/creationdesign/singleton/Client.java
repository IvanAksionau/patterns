package com.ivan.practice.pattern.creationdesign.singleton;

/**
 * java.lang.Runtime is exa`mple of Singleton pattern
 */
public class Client {

    public static void main(String[] args) {
        LazyRegistryIODH singleton = LazyRegistryIODH.getInstance();
        LazyRegistryIODH singleton2 = LazyRegistryIODH.getInstance();
        System.out.println(singleton == singleton2);
    }
}
