package com.udemy.SOLID.liskovSubstitutionPrinciple;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setLength(int side) {
        setSide(side);
    }

    @Override
    public void setWidth(int side) {
        setSide(side);
    }

    public void setSide(int side) {
        super.setLength(side);
        super.setWidth(side);
    }
}
