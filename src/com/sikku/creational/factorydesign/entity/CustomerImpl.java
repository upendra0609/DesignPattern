package com.sikku.creational.factorydesign.entity;

public class CustomerImpl implements IEmployee{
    @Override
    public void print(String name) {
        System.out.println("Good evening "+name);
    }
}
