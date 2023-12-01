package com.udemy.designPattern.structural.decorator;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringEscapeUtils;

import java.util.Base64;

@AllArgsConstructor
public class Base64EncodedMessage implements Message {

    private Message msg;

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
    }
}
