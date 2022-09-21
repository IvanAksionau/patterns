package com.ivan.practice.pattern.behaviouraldesign.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
