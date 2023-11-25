package com.udemy.designPattern.creational.singletone.eager;

public class Client {
    public static void main(String[] args) {
        EagerRegistry instance1 = EagerRegistry.getInstance();
        EagerRegistry instance2 = EagerRegistry.getInstance();

        System.out.println(instance1 == instance2); //true
    }
}
