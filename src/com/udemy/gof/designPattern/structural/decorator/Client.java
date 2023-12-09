package com.udemy.designPattern.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Message msg = new TextMessage("The <FORCE> is strong with this one");
        System.out.println(msg.getContent());

        Message decorator = new HTMLEncodedMessage(msg);
        System.out.println(decorator.getContent());

        decorator = new Base64EncodedMessage(msg);
        System.out.println(decorator.getContent());
    }
}
