package com.udemy.designPattern.structural.bridgePattern;

public class Client {
    public static void main(String[] args) {
        FIFOCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(12);
        collection.offer(11);
        System.out.println(collection.poll());
        System.out.println(collection.poll());
    }
}
