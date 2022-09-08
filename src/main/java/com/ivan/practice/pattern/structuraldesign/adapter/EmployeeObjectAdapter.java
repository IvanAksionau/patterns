package com.ivan.practice.pattern.structuraldesign.adapter;

/**
 * An object adapter. Using composition to translate interface
 * This can be used in case if 'Customer' is presented as class rather then interface.
 */
public class EmployeeObjectAdapter implements Customer {

    private final Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getName() {
        return adaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeLocation();
    }
}
