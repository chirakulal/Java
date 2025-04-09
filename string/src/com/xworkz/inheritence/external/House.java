package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Building;

public class House extends Building {

    private String address;
    private int numRooms;
    private boolean hasGarden;

    public House(String address, int numRooms, boolean hasGarden) {
        this.address = address;
        this.numRooms = numRooms;
        this.hasGarden = hasGarden;
    }
    @Override
    public void rooms(){
        System.out.println("Running roomsin House");
    }
    @Override
    public void floor(){
        System.out.println("running floor in House");
    }
    @Override
    public void blocks(){
        System.out.println("Running blocks in House");
    }
    @Override
    public void bhk(){
        System.out.println("Running bhk in House");
    }
    @Override
    public void security(){
        System.out.println("Running security in House");
    }
    public void sit(){
        System.out.println("Running sit in House");
    }

    @Override
    public String toString() {
        return
                "address='" + address + '\'' +
                ", numRooms=" + numRooms +
                ", hasGarden=" + hasGarden ;
    }
}
