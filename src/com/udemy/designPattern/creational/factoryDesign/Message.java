package com.udemy.designPattern.creational.factoryDesign;

public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeader(){
        //add some default header
    }

    public void encrypt(){
        //# Has some code to encrypt the content
    }
}
