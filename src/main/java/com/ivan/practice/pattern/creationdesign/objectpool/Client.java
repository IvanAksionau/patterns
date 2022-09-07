package com.ivan.practice.pattern.creationdesign.objectpool;

import javafx.geometry.Point2D;

/**
 * Pooling objects is beneficial if they involve costly initialization
 * because of initialization of external resources like a connection or thread.
 * java.util.concurrent.ThreadPoolExecutor is example of 'Object Pool' pattern.
 */
public class Client {

    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);

    public static void main(String[] args) {
        Bitmap b1 = bitmapPool.get();
        b1.setLocation(new Point2D(10, 10));
        Bitmap b2 = bitmapPool.get();
        b2.setLocation(new Point2D(-10, 0));

        b1.draw();
        b2.draw();

        bitmapPool.release(b1);
        bitmapPool.release(b2);
    }
}
