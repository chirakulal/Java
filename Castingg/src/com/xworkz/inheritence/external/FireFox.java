package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Browser;

public class FireFox extends Browser {
    public FireFox(){
        super();
        System.out.println("No-arg constructor is running in Firefox");

    }
    @Override
    public void open() {
        System.out.println("Running open in FireFox");
    }

    @Override
    public void close() {
        System.out.println("Running close in FireFox");
    }

    @Override
    public void navigate() {
        System.out.println("Running navigate in FireFox");
    }

    @Override
    public void incognitoMode() {
        System.out.println("Running incognitoMode in FireFox");
    }

    @Override
    public void extensions() {
        System.out.println("Running extensions in FireFox");
    }

}
