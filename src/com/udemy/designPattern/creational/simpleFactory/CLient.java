package com.udemy.designPattern.creational.simpleFactory;

public class CLient {
    public static void main(String[] args) {
        Post post = PostFactory.createPost("news");
        System.out.println(post);
    }
}
