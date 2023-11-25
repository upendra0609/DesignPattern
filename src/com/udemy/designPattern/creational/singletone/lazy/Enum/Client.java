package com.udemy.designPattern.creational.singletone.lazy.Enum;

public class Client {
    public static void main(String[] args) {
        Registry e = Registry.INSTANCE;

        e.someMethod();

        System.out.println(e.getClass().getName());
    }
}
