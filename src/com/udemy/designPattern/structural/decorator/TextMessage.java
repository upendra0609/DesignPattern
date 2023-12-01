package com.udemy.designPattern.structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextMessage implements Message {
    private String msg;

    @Override
    public String getContent() {
        return msg;
    }
}
