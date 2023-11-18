package com.sikku.creational.factorydesign.factory;

import com.sikku.creational.factorydesign.entity.CustomerImpl;
import com.sikku.creational.factorydesign.entity.EmployeeImpl;
import com.sikku.creational.factorydesign.entity.IEmployee;

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
