package com.ivan.practice.pattern.structuraldesign.facade.email;

public class OrderEmailTemplate extends Template {

    @Override
    public String format(Object obj) {
        return "TEMPLATE";
    }
}
