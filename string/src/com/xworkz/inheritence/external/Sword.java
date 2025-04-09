package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Weapon;

public class Sword extends Weapon {
    private String material;
    private int length;
    private boolean isSharp;


    public Sword(String material, int length, boolean isSharp) {
        this.material = material;
        this.length = length;
        this.isSharp = isSharp;
    }
    @Override
    public void attack(){
        System.out.println("Running method in Sword");
    }
    @Override
    public void storeSafely(){
        System.out.println("Running method in Sword");
    }
    @Override
    public void sharpen(){
        System.out.println("Running method in Sword");
    }
    @Override
    public void defend(){
        System.out.println("Running method in Sword");
    }
    @Override
    public void equip(){
        System.out.println("Running method in Sword");
    }
    public void sharp(){
        System.out.println("Running method in sword");
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", length=" + length +
                ", isSharp=" + isSharp;
    }
}
