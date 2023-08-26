package com.creational.builderdesign;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new MobileBuilder().setOs("ios").setBattery(5000).getMobile();
        System.out.println(mobile);
    }
}
