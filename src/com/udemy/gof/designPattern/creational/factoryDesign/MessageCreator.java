package com.udemy.designPattern.creational.factoryDesign;

public abstract class MessageCreator {
    public Message getMessage() {
        Message msg = createMessage();

        msg.addDefaultHeader();
        msg.encrypt();
        return msg;
    }

    //Factory method
    public abstract Message createMessage();

}
