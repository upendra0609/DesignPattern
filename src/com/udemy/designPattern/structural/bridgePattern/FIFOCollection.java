package com.udemy.designPattern.structural.bridgePattern;

//This is abstraction
//It represents a first in first out collection
public interface FIFOCollection<T> {
    //add element to collection
    void offer(T element);

    //    Remove and return first element of the collection
    T poll();
}
