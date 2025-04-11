package com.xworkz.inheritence.external;

public class House {

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
                        ", hasGarden=" + hasGarden;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 14;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof House) {
                House h1 = this;
                House h2 = (House) obj;
                if (h1.address.equals(h2.address) &&
                        h1.numRooms == h2.numRooms &&
                        h1.hasGarden == h2.hasGarden) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
