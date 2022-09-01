package com.ivan.practice.pattern.creationdesign.abstractfactory.aws;

import com.ivan.practice.pattern.creationdesign.abstractfactory.Instance;
import com.ivan.practice.pattern.creationdesign.abstractfactory.Instance.Capacity;
import com.ivan.practice.pattern.creationdesign.abstractfactory.ResourceFactory;
import com.ivan.practice.pattern.creationdesign.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
