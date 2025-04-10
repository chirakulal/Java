package com.xworkz.reference;

import java.lang.reflect.Constructor;

public class Lens {

    private String size;
    private String maxZoom;

    public Lens(String size,String maxZoom){
        this.size=size;
        this.maxZoom=maxZoom;
    }

    public void zoom(){
        System.out.println("the size of lens is"+this.size);
        System.out.println("the maximum zoom is "+this.maxZoom);
    }
}

