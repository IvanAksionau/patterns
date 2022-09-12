package com.ivan.practice.pattern.structuraldesign.proxy.dynamic;

import com.ivan.practice.pattern.structuraldesign.proxy.Image;
import javafx.geometry.Point2D;

/**
 * How proxy gets hold of the real object depends on what purpose proxy serves.
 * For creation on demand type of proxies; actual object is created only when proxy can't handle client request.
 * Authentication proxies use pre-built objects, so they are provided with object during construction of proxy.
 * <p>
 * Proxy itself can maintain/cache some state on behalf of real object in creation on demand use cases.
 * <p>
 * Pay attention to performance cost of proxies as well synchronization issues added by proxy itself.
 */
public class Client {

    public static void main(String[] args) {
        Image img = ImageFactory.getImage("A.bmp");
        img.setLocation(new Point2D(-10, 0));
        System.out.println(img.getLocation());
        System.out.println("*****************************");
        img.render();
    }
}
