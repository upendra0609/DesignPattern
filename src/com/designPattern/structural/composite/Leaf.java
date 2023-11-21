package com.designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

interface Components {
    void getPrice();
}

public class Leaf implements Components {
    private int price;
    private String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void getPrice() {
        System.out.println(name + " : " + price);
    }
}

class Composite implements Components {
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    List<Components> components = new ArrayList<>();

    public void addComponents(Components comp) {
        components.add(comp);
    }

    @Override
    public void getPrice() {
        System.out.println(name);
        components.stream().forEach((i)->{
            i.getPrice();
        });
    }
}
