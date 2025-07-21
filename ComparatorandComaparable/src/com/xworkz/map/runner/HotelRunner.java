package com.xworkz.map.runner;

import com.xworkz.map.dto.HotelDTO;

import java.util.ArrayList;
import java.util.List;

public class HotelRunner {

    public static void main(String[] args) {
        List<HotelDTO> hotel = new ArrayList<>();
        hotel.add(new HotelDTO("Taj",1000));
        hotel.add(new HotelDTO("Vishal",2000));
        hotel.add(new HotelDTO("taj",1000));
        hotel.add(new HotelDTO("Taj",1000));
    }
}
