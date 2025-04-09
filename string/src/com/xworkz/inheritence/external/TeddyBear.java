package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Toy;

public class TeddyBear extends Toy {
    private String name;
    private String color;
    private String size;


    public TeddyBear(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public void squeeze(){
        System.out.println("Running squeeze in TeddyBear");
    }
    @Override
    public void throwToy(){
        System.out.println("Running thorwtoy in TeddyBear");
    }
    @Override
    public void clean(){
        System.out.println("Running clean in TeddyBear");
    }
    @Override
    public void store(){
        System.out.println("Running store in TeddyBear");
    }
    @Override
    public void shake(){
        System.out.println("Running shake in TeddyBear");
    }
    public void order(){
        System.out.println("Running order in teddybear");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size ;
    }
}
