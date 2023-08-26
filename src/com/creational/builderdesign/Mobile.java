package com.creational.builderdesign;

public class Mobile {
    private String os;
    private int battery;
    private int ram;
    private int camera;

    public Mobile(String os, int battery, int ram, int camera) {
        this.os = os;
        this.battery = battery;
        this.ram = ram;
        this.camera = camera;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "os='" + os + '\'' +
                ", battery=" + battery +
                ", ram=" + ram +
                ", camera=" + camera +
                '}';
    }
}
