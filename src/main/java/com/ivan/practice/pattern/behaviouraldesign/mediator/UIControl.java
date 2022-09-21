package com.ivan.practice.pattern.behaviouraldesign.mediator;

//Abstract colleague
public interface UIControl {

    void controlChanged(UIControl control);

    String getControlValue();

    String getControlName();
}
