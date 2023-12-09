package com.udemy.designPattern.creational.abstractFactory;

//Abstract factory with method defined for each type
public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMib);
}
