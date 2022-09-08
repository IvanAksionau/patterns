package com.ivan.practice.pattern.structuraldesign.adapter;

/**
 * Use if we have an object which provides the functionality that client needs,
 * but the client code can't use this object because it expects an object with different interface.
 * En example of usage is java.io.InputStreamReader
 */
public class Main {

    public static void main(String[] args) {
        /** Using Class/Two-way adapter **/
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);

        System.out.println("************************************************************");
        /** Using Object Adapter **/
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(objectAdapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
    }
}
