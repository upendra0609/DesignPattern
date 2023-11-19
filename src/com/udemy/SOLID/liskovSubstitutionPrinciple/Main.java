package com.udemy.SOLID.liskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.computeArea());

        Rectangle rectangle1 = new Square(10);
        System.out.println(rectangle1.computeArea());

//        Square square = new Square(10);
//        System.out.println(square.computeArea());

        userRectangle(rectangle);
        userRectangle(rectangle1);

    }

    public static void userRectangle(Rectangle rectangle) {
        rectangle.setLength(20);
        rectangle.setWidth(30);
        if (rectangle.getLength() == 20) {
            System.out.println("Length not equal to 20");
        }
        if (rectangle.getWidth() == 30) {
            System.out.println("Width not equal to 30");
        }
    }
}
