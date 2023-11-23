package com.udemy.designPattern.creational.prototypeDesign;

public class Swordsman extends GameUnit {
    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman" +
                "state='" + state + " @ " + getPosition();
    }

    @Override
    public void reset() {
        this.state = "idle";
    }
}
