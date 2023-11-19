package com.udemy.SOLID.liskovSubstitutionPrinciple;

public class BestLiskov {

    public static void main(String[] args) {
        Rectangle1 rectangle1 = new Rectangle1(10, 20);
        System.out.println(rectangle1.computeArea());

        Square1 square1 = new Square1(10);
        System.out.println(square1.computeArea());

        userRectangle(rectangle1);
    }

    public static void userRectangle(Rectangle1 rectangle) {
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

interface Shape {
    int computeArea();
}

class Rectangle1 implements Shape {
    private int length;
    private int width;

    public Rectangle1(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int computeArea() {
        return length * width;
    }
}

class Square1 implements Shape {
    private int size;

    public Square1(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int computeArea() {
        return size * size;
    }
}
