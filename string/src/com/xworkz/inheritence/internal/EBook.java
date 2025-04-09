package com.xworkz.inheritence.internal;

public class EBook {

    public EBook() {
        System.out.println("No-arg constructor in EBookReader");
    }

    public void openBook() {
        System.out.println("Running openBook in EBook");
    }
    public void turnPage() {
        System.out.println("Running turnPage in EBook");
    }
    public void adjustBrightness() {
        System.out.println("Running adjustBrightness in EBook");
    }
    public void searchText() {
        System.out.println("Running searchText in EBook"); }
    public void bookmarkPage() {
        System.out.println("Running bookmarkPage in EBook"); }
}
