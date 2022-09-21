package com.ivan.practice.pattern.behaviouraldesign.interpreter;

//Abstract expression
public interface PermissionExpression {

    boolean interpret(User user);
}
