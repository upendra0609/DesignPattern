package com.udemy.designPattern.structural.decorator;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringEscapeUtils;

@AllArgsConstructor
public class HTMLEncodedMessage implements Message {

    private Message msg;

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(msg.getContent());
    }
}
