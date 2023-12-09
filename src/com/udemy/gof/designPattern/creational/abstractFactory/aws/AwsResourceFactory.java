package com.udemy.designPattern.creational.abstractFactory.aws;

import com.udemy.designPattern.creational.abstractFactory.Instance;
import com.udemy.designPattern.creational.abstractFactory.ResourceFactory;
import com.udemy.designPattern.creational.abstractFactory.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
