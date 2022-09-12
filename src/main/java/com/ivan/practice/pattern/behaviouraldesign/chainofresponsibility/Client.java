package com.ivan.practice.pattern.behaviouraldesign.chainofresponsibility;

import java.time.LocalDate;

/**
 * We need to avoid coupling the code which sends request to the code which handles that request.
 * Typically, the code which wants some request handled calls the exact method on an exact object to process it,
 * thus the tight coupling. Chain of responsibility solves this problem by giving more than one object,
 * chance to process the request.
 * <p>
 * We create objects which are chained together by one object knowing reference of object which is next in chain.
 * We give request to first object in chain, if it can't handle that it simply passes the request down the chain.
 * <p>
 * The best example of pattern is servlet filters.
 * Each filter get a chance to handle incoming request and pass it down the chain once its work is done.
 */
public class Client {

    public static void main(String[] args) {
        LeaveApplication application = LeaveApplication.getBuilder().withType(LeaveApplication.Type.Sick)
                .from(LocalDate.now()).to(LocalDate.of(2018, 2, 28))
                .build();
        System.out.println(application);
        System.out.println("**************************************************");
        LeaveApprover approver = createChain();
        approver.processLeaveRequest(application);
        System.out.println(application);
    }

    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        return new ProjectLead(manager);
    }
}
