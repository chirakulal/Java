package com.xworkz.map.dto;

public class HotelDTO {
    private String name;
    private double pricePerNight;

    public HotelDTO(String name, double pricePerNight) {
        this.name = name;
        this.pricePerNight = pricePerNight;
    }

    public String toString() {
        return "Hotel{name='" + name + "', pricePerNight=" + pricePerNight + "}";
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
}

