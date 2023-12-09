package com.udemy.designPattern.creational.abstractFactory.gcp;

import com.udemy.designPattern.creational.abstractFactory.Storage;

public class GoogleCloudStorage implements Storage {
    public GoogleCloudStorage(int capacityInMb) {
        System.out.println("Allocated " + capacityInMb + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google Cluod Storage";
    }
}
