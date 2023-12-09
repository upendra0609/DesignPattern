package com.udemy.designPattern.creational.objectPool;

public class BitMap implements Image {

    private Point2D location;
    private String name;

    public BitMap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name + " @" + location);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    //reset state of the object
    @Override
    public void reset() {
        location = null;
        System.out.println("Bitmap is reset");
    }
}
