package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.EBook;

public class Kindle extends EBook {
    public  Kindle(){
        super();
        System.out.println("No-arg constructor is running in Kindle");
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
}
