package com.udemy.designPattern.creational.objectPool;

public interface Image extends Poolable {
    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);
}
