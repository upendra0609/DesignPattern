package com.sikku.structural.adapter;

public class AdapterPen implements Pen{

    PilotPen pp = new PilotPen();
    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
