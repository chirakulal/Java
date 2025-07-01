package com.xworkz.collection.runner;



import java.util.ArrayList;
import java.util.Collection;

public class Device {


    public static void main(String[] args) {
        Collection<String> device = new ArrayList<>();

        device.add("laptop");
        device.add("mobile");
        device.add("tablet");
        device.add("smartwatch");
        device.add("computer");
        device.add("mouse");
        device.add("router");
        device.add("speaker");
        device.add("camera");
        device.add("earbuds");

        System.out.println("Device=="+device.size());

        device.clear();

        System.out.println("Device==="+device.size());

        device.add("projector");
        device.add("doorbell");
        device.add("headset");
        device.add("printer");
        device.add("power bank");
        device.add("refrigerator");
        device.add("light bulb");
        device.add("thermostat");
        device.add("camera");
        device.add("Tv");

        System.out.println("Device=="+device.size());







    }
}
