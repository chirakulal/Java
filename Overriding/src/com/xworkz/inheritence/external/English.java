package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Language;

public class English extends Language {
    public English() {
        super();
        System.out.println("No-arg constructor is running in English");
    }
    @Override
    public void speak() {
        System.out.println("Running speak in English");
    }

    @Override
    public void write() {
        System.out.println("Running write in English");
    }

    @Override
    public void read() {
        System.out.println("Running read in English");
    }

    @Override
    public void translate() {
        System.out.println("Running translate in English");
    }

    @Override
    public void learn() {
        System.out.println("Running learn in English");
    }

}
