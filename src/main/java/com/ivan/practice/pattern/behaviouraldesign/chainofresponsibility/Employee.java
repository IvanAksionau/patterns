package com.ivan.practice.pattern.behaviouraldesign.chainofresponsibility;

//Abstract handler
public abstract class Employee implements LeaveApprover {

    private final String roleName;

    private final LeaveApprover nextApprover;

    public Employee(String roleName, LeaveApprover nextApprover) {
        this.roleName = roleName;
        this.nextApprover = nextApprover;
    }

    @Override
    public void processLeaveRequest(LeaveApplication application) {
        if (!processRequestType(application) && nextApprover != null) {
            nextApprover.processLeaveRequest(application);
        }
    }

    protected abstract boolean processRequestType(LeaveApplication application);

    @Override
    public String getApproverRole() {
        return roleName;
    }
}
