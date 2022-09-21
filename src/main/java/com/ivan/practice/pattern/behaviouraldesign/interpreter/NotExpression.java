package com.ivan.practice.pattern.behaviouraldesign.interpreter;

public class NotExpression implements PermissionExpression {

    private final PermissionExpression expression;

    public NotExpression(PermissionExpression expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpret(User user) {
        return !expression.interpret(user);
    }

    @Override
    public String toString() {
        return " NOT " + expression;
    }
}
