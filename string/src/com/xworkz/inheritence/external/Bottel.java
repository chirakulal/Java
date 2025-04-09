package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Container;

public class Bottel extends Container {

    private String material;
    private int capacity;
    private boolean isInsulated;


    public Bottel(String material, int capacity, boolean isInsulated) {
        this.material = material;
        this.capacity = capacity;
        this.isInsulated = isInsulated;
    }
    @Override
    public void fill(){
        System.out.println("Running fill in Bottel");
    }
    @Override
    public void empty(){
        System.out.println("Running empty in Bottel");
    }
    @Override
    public void color(){
        System.out.println("Running co;or in Bottel");
    }
    @Override
    public void size(){
        System.out.println("Running size in Bottel");
    }
    @Override
    public void capacity(){
        System.out.println("Running capacity in Bottel");
    }
    public void buy(){
        System.out.println("Running buy in Bottel");
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", capacity=" + capacity +
                ", isInsulated=" + isInsulated;
    }
}
