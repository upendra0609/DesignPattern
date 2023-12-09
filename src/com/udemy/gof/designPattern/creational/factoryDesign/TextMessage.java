package com.udemy.designPattern.creational.factoryDesign;

public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "Text";
    }
}
