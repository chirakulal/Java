package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.EBook;

public class Kindle extends EBook {
    private String model;
    private int storageCapacity;
    private boolean isBacklit;


    public Kindle(String model, int storageCapacity, boolean isBacklit) {
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.isBacklit = isBacklit;
    }
    @Override
    public void openBook() {
        System.out.println("Running openBook in Kindle");
    }
    @Override
    public void turnPage() {
        System.out.println("Running turnPage in Kindle");
    }
    @Override
    public void adjustBrightness() {
        System.out.println("Running adjustBrightness in Kindle");
    }
    @Override
    public void searchText() {
        System.out.println("Running searchText in Kindle"); }
    @Override
    public void bookmarkPage() {
        System.out.println("Running bookmarkPage in Kindle"); }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", isBacklit=" + isBacklit ;
    }
}
