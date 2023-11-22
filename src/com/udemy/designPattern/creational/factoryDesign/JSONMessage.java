package com.udemy.designPattern.creational.factoryDesign;

public class JSONMessage extends Message {
    @Override
    public String getContent() {
        return "{" +
                "\"JSON]\":[]}";
    }
}
