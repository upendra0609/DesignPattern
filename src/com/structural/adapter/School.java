package com.structural.adapter;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class School {
    public static void main(String[] args) {
        AdapterPen p = new AdapterPen();
        Assignment assignment = new Assignment();
        assignment.setPen(p);
        assignment.writeAssignment("I have to do this assignment");
    }
}
