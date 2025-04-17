package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.BlogPlatform;

public class Medium implements BlogPlatform {

    @Override
    public void writePost() {
        System.out.println("Running writePost in Medium");
    }

    @Override
    public void publishPost() {
        System.out.println("Running publishPost in Medium");
    }

    @Override
    public void deletePost() {
        System.out.println("Running deletePost in Medium");
    }
}
