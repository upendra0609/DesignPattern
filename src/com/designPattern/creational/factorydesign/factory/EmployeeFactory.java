package com.designPattern.creational.factorydesign.factory;

import com.designPattern.creational.factorydesign.entity.CustomerImpl;
import com.designPattern.creational.factorydesign.entity.EmployeeImpl;
import com.designPattern.creational.factorydesign.entity.IEmployee;

public class EmployeeFactory {
    private EmployeeImpl employee;

    public IEmployee getInstance(String str){
        if(str.equals("emp")){
            return new EmployeeImpl();
        } else if (str.equals("cust")) {
            return new CustomerImpl();
        }
        return null;
    }
}
