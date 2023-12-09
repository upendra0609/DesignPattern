package com.udemy.designPattern.structural.adapterPattern.cobjectAdapter;

import com.udemy.designPattern.structural.adapterPattern.classAdapter.Customer;

public class EmployeeObjectAdapter implements Customer {
    //adaptee
    private Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }
}
