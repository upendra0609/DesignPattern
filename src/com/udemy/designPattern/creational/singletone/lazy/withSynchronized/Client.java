package com.udemy.designPattern.creational.singletone.lazy.withSynchronized;

public class Client {
    public static void main(String[] args) {
        LazyRegistry lazy1 = LazyRegistry.getInstance();
        LazyRegistry lazy2 = LazyRegistry.getInstance();

        System.out.println(lazy1 == lazy2);   //true
    }
}
