package com.creational.builderdesign;

public class MobileBuilder {
    private String os;
    private int battery;
    private int ram;
    private int camera;

    public MobileBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public MobileBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public MobileBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public MobileBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public Mobile getMobile(){
        return new Mobile(os,battery,ram,camera);
    }
}
