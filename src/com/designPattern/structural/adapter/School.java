package com.designPattern.structural.adapter;

public class School {
    public static void main(String[] args) {
        AdapterPen p = new AdapterPen();
        Assignment assignment = new Assignment();
        assignment.setPen(p);
        assignment.writeAssignment("I have to do this assignment");
    }
}
