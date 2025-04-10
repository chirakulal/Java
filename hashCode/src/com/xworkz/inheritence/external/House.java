package com.xworkz.inheritence.external;


public class House  {

    private String address;
    private int numRooms;
    private boolean hasGarden;

    public House(String address, int numRooms, boolean hasGarden) {
        this.address = address;
        this.numRooms = numRooms;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return
                "address='" + address + '\'' +
                ", numRooms=" + numRooms +
                ", hasGarden=" + hasGarden ;
    }

    @Override
    public int hashCode() {
        return 14;
    }
}
