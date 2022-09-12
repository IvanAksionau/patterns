package com.ivan.practice.pattern.behaviouraldesign.chainofresponsibility;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

    void processLeaveRequest(LeaveApplication application);

    String getApproverRole();
}
