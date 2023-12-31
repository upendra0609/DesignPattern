package com.designPattern.creational.factorydesign;


import com.designPattern.creational.factorydesign.entity.IEmployee;
import com.designPattern.creational.factorydesign.factory.EmployeeFactory;

public class FactoryDesign {
    public static void main(String[] args) {
        EmployeeFactory e = new EmployeeFactory();
        IEmployee e1 = e.getInstance("emp");
        IEmployee e2 = e.getInstance("cust");
        IEmployee e3 = e.getInstance("");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}


