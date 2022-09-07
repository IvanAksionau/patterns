package com.ivan.practice.pattern.creationdesign.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ObjectPool<T extends Poolable> {

    private final BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int range) {
        availablePool = new LinkedBlockingQueue<>();
        IntStream.range(0, range).forEach(i -> availablePool.offer(creator.get()));
    }

    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException ex) {
            System.err.println("take() was interrupted");
        }
        // TODO: 9/7/2022 Here we need to decide if we want to wait till the object is free or we create a new one
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.err.println("put() was interrupted");
        }
    }
}
