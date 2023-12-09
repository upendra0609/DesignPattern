package com.udemy.designPattern.creational.factoryDesign;

public class JSONMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
