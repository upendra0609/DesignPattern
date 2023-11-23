package com.udemy.designPattern.creational.prototypeDesign;

public class General extends GameUnit {
    public String state = "idle";

    public void boostMoral() {
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General" +
                "state=" + state + " @ " + getPosition();
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    public void reset() {
         throw new UnsupportedOperationException("Reset not supported");
    }
}
