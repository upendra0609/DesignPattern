package com.udemy.designPattern.creational.objectPool;

public class Point2D {
    private float x, y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}
