package com.xworkz.inheritence.external;

public class Rose extends Flower{
    private String color;
    private int petalCount;
    private boolean hasFragrance;


    public Rose(String color, int petalCount, boolean hasFragrance) {
        this.color = color;
        this.petalCount = petalCount;
        this.hasFragrance = hasFragrance;
    }

    @Override
    public void bloom() {
        System.out.println("Running bloom in Rose");
    }

    @Override
    public void releaseFragrance() {
        System.out.println("Running releaseFragrance in Rose");
    }

    @Override
    public void absorbSunlight() {
        System.out.println("Running absorbSunlight in Rose");
    }

    @Override
    public void attractBees() {
        System.out.println("Running attractBees in Rose");
    }

    @Override
    public void provideNectar() {
        System.out.println("Running provideNectar in Rose");
    }
    public  void  buy(){
        System.out.println("Running buy in Rose");
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", petalCount=" + petalCount +
                ", hasFragrance=" + hasFragrance;
    }
}
