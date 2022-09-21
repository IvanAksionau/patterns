package com.ivan.practice.pattern.behaviouraldesign.nullobject;

public class NullStorageService extends StorageService {

    @Override
    public void save(Report report) {
        System.out.println("Null object save method. Doing nothing");
    }
}
