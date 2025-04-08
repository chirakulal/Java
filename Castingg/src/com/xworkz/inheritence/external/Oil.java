package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Liquid;

public class Oil extends Liquid {
    public Oil() {
        super();
        System.out.println("No-arg constructor is running in Oil");
    }

    @Override
    public void pour() {
        System.out.println("Running pour in Oil");
    }

    @Override
    public void mix() {
        System.out.println("Running mix in Oil");
    }

    @Override
    public void evaporate() {
        System.out.println("Running evaporate in Oil");
    }

    @Override
    public void store() {
        System.out.println("Running store in Oil");
    }

    @Override
    public void lubricate() {
        System.out.println("Running lubricate in Oil");
    }


}
