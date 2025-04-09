package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Bus;

public class MaheshBus extends Bus {
    private String busNumber;
    private String route;
    private int seatingCapacity;


    public MaheshBus(String busNumber, String route, int seatingCapacity) {
        this.busNumber = busNumber;
        this.route = route;
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void ticket() {
        System.out.println("Running ticket in MaheshBus");
    }

    @Override
    public void pass() {
        System.out.println("Running pass in MaheshBus");
    }

    @Override
    public void seat() {
        System.out.println("Running seat in MaheshBus");
    }


    @Override
    public void stand() {
        System.out.println("Running stand in MaheshBus");
    }

    @Override
    public void reserved() {
        System.out.println("Running reserved in MaheshBus");
    }

    @Override
    public String toString() {
        return
                "busNumber='" + busNumber + '\'' +
                ", route='" + route + '\'' +
                ", seatingCapacity=" + seatingCapacity ;
    }
}
