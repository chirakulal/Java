package com.xworkz.inheritence.external;


public class MaheshBus{
    private String busNumber;
    private String route;
    private int seatingCapacity;


    public MaheshBus(String busNumber, String route, int seatingCapacity) {
        this.busNumber = busNumber;
        this.route = route;
        this.seatingCapacity = seatingCapacity;
    }


    @Override
    public String toString() {
        return
                "busNumber='" + busNumber + '\'' +
                ", route='" + route + '\'' +
                ", seatingCapacity=" + seatingCapacity ;
    }

    @Override
    public int hashCode() {
        return 57;
    }
}
