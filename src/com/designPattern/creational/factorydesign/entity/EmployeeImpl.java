package com.designPattern.creational.factorydesign.entity;

public class EmployeeImpl implements IEmployee{
    @Override
    public void print(String name) {
        System.out.println("Good Morning "+name);
    }
}
