package com.xworkz.inheritence.external;

public class MaheshBus {
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
                        ", seatingCapacity=" + seatingCapacity;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 57;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof MaheshBus) {
                MaheshBus maheshBus = (MaheshBus) obj;
                if (this.busNumber.equals(maheshBus.busNumber)
                        && this.route.equals(maheshBus.route)) {
                    System.out.println("Both MaheshBus objects are same based on busNumber and route");
                    return true;
                }
            }
        }
        return false;
    }
}
