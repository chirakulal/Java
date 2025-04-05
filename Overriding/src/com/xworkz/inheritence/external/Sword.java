package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Weapon;

public class Sword extends Weapon {
    public Sword(){
        super();
        System.out.println("no-argu const is running in Sword");
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
}
