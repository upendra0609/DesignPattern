package com.creational.factorydesign.factory;

import com.creational.factorydesign.entity.CustomerImpl;
import com.creational.factorydesign.entity.EmployeeImpl;
import com.creational.factorydesign.entity.IEmployee;

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
