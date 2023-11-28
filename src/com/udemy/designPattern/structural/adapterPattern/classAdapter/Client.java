package com.udemy.designPattern.structural.adapterPattern.classAdapter;

public class Client {
    public static void main(String[] args) {
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elite");
        employee.setJobTitle("security engineering");
        employee.setOfficeLocation("pune");
    }
}
