package com;

public class Test extends Demo{
    int a = 20;
    public void print(){
        System.out.println(super.a);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.print();
    }
}
