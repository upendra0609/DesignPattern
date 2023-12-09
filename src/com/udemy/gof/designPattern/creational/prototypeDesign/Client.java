package com.udemy.designPattern.creational.prototypeDesign;

import javafx.geometry.Point3D;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s = new Swordsman();
        s.move(new Point3D(-10, 0, 0), 20);
        s.attack();
        System.out.println(s);

        Swordsman s1 = (Swordsman) s.clone();
        System.out.println(s1);
    }
}
