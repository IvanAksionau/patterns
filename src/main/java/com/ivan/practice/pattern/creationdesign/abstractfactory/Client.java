package com.ivan.practice.pattern.creationdesign.abstractfactory;

import com.ivan.practice.pattern.creationdesign.abstractfactory.Instance.Capacity;
import com.ivan.practice.pattern.creationdesign.abstractfactory.aws.AwsResourceFactory;
import com.ivan.practice.pattern.creationdesign.abstractfactory.gcp.GoogleResourceFactory;

/**
 * Abstract factory is used when we have two or more objects which work together forming a
 * set and there can be multiple sets that can be created by client code.
 * So we separate client code from concrete objects forming such a set and from the code which creates these sets.
 */
public class Client {

    private final ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) {
        Client awsClient = new Client(new AwsResourceFactory());
        Instance instance = awsClient.createInstance(Capacity.micro, 20480);
        instance.start();
        instance.stop();

        Client gcpClient = new Client(new GoogleResourceFactory());
        instance = gcpClient.createInstance(Capacity.micro, 20480);
        instance.start();
        instance.stop();
    }

    public Instance createInstance(Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }
}
