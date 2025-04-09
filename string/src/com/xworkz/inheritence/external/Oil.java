package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Liquid;

public class Oil extends Liquid {
    private String type;
    private int quantity;
    private boolean isEdible;


    public Oil(String type, int quantity, boolean isEdible) {
        this.type = type;
        this.quantity = quantity;
        this.isEdible = isEdible;
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

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                ", quantity=" + quantity +
                ", isEdible=" + isEdible ;
    }
}
