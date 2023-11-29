package com.udemy.designPattern.structural.bridgePattern;

/*
A Concrete implementor.
This implementation is a classic LinkedList using nodes
 */
public class SinglyLinkedList<T> implements LinkedList<T> {
    private int size;
    private Node top;
    private Node last;

    private class Node {
        private Object data;
        private Node next;

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    @Override
    public void addFirst(T element) {
        if (top == null) {
            last = top = new Node(element, null);
        } else {
            top.next = new Node(element, top);
        }
        size++;
    }

    @Override
    public T removeFirst() {
        if (last != null) {
            T t = (T) last.data;
            last = last.next;
            return t;
        }
        return null;
    }

    @Override
    public void addLast(T element) {
        if (last == null) {
            last = top = new Node(element, null);
        } else {
            last = new Node(element, last);
        }
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }
}
