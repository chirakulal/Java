package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.NetworkDevice;

public class Router extends NetworkDevice {

    private String brand;
    private int speedMbps;
    private boolean isDualBand;


    public Router(String brand, int speedMbps, boolean isDualBand) {
        this.brand = brand;
        this.speedMbps = speedMbps;
        this.isDualBand = isDualBand;
    }
    @Override
    public  void connect(){
        System.out.println("Running connect in Router");
    }
    @Override
    public  void disconnect(){
        System.out.println("Running disconnect in Router");
    }
    @Override
    public  void transmitData(){
        System.out.println("Running transmitdata in Router");
    }
    @Override
    public  void receiveData(){
        System.out.println("Running recievedata in Router");
    }
    @Override
    public  void reboot(){
        System.out.println("Running reboot in Router");
    }
    public void traffic(){
        System.out.println("Running traffic in Router");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", speedMbps=" + speedMbps +
                ", isDualBand=" + isDualBand;
    }
}
