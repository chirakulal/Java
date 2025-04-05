package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Soap;

public class Rin extends Soap {
    public Rin(){
        super();
        System.out.println("No-arg Constructor running in Soap");
    }
    @Override
    public void foam() {
        System.out.println("Running foam in Rin");
    }
    @Override
    public void washClothes() {
        System.out.println("Running washClothes in Rin");
    }
    @Override
    public void smellFresh() {
        System.out.println("Running smellFresh in Rin");
    }
    @Override
    public void removeStains() {
        System.out.println("Running removeStains in Rin");
    }
    @Override
    public void rinse() {
        System.out.println("Running rinse in Rin");
    }
}
