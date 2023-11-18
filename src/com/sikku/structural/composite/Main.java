package com.sikku.structural.composite;

public class Main {
    public static void main(String[] args) {
        Components mouse = new Leaf(500, "mouse");
        Components keyboard = new Leaf(1500, "keyboard");
        Components ram = new Leaf(3000, "ram");
        Components hd = new Leaf(5000, "hd");

        Composite computer = new Composite("computer");
        Composite mb = new Composite("mother board");

        mb.addComponents(ram);

        computer.addComponents(mouse);
        computer.addComponents(hd);
        computer.addComponents(keyboard);
        computer.addComponents(mb);

//        computer.getPrice();
        mouse.getPrice();
    }
}
