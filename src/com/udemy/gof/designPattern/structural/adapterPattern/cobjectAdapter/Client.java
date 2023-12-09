package com.udemy.designPattern.structural.adapterPattern.cobjectAdapter;



public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter adapter = new EmployeeObjectAdapter(employee);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elite");
        employee.setJobTitle("Developer");
        employee.setOfficeLocation("mumbai");
    }
}
