package com.udemy.designPattern.creational.abstractFactory.gcp;

import com.udemy.designPattern.creational.abstractFactory.Instance;
import com.udemy.designPattern.creational.abstractFactory.ResourceFactory;
import com.udemy.designPattern.creational.abstractFactory.Storage;

public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
