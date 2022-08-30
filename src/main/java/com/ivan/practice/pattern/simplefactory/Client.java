package com.ivan.practice.pattern.simplefactory;

/**
 * With simple factory pattern multiple types can be instanced
 * and the choice is based on some simple criteria
 *  NumberFormat.getInstance() uses such pattern
 */
public class Client {

    public static void main(String[] args) {
        Post post = PostFactory.createPost("news");
        System.out.println(post);
    }
}
