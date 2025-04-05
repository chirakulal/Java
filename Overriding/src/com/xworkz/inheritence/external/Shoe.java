package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Footwear;

public class Shoe extends Footwear {

    public Shoe(){
        super();
        System.out.println("no-argu constructor running in Shoe");
    }
    @Override
    public void wear() {
        System.out.println("Running wear in Shoe");
    }

    @Override
    public void run() {
        System.out.println("Running run in Shoe");
    }

    @Override
    public void walk() {
        System.out.println("Running walk in Shoe");
    }

    @Override
    public void tie() {
        System.out.println("Running tie in Shoe");
    }

    @Override
    public void remove() {
        System.out.println("Running remove in Shoe");
    }

}
