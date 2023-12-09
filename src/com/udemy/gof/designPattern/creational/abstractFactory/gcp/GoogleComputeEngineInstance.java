package com.udemy.designPattern.creational.abstractFactory.gcp;

import com.udemy.designPattern.creational.abstractFactory.Instance;
import com.udemy.designPattern.creational.abstractFactory.Storage;

//Represents a concrete product in a family "Amazon Web services"
public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google compute Engine Instance");
    }

    @Override
    public void start() {
        System.out.println("Google compute Engine Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Google compute Engine Instance");
    }

    @Override
    public void stop() {
        System.out.println("Google compute Engine Instance stopped");
    }

    @Override
    public String toString() {
        return "Google compute Engine Instance";
    }
}
