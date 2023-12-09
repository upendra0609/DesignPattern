package com.udemy.designPattern.creational.abstractFactory;

//Represent a abstract product
public interface Instance {
    enum Capacity {micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
