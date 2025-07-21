package com.xworkz.map.runner;

import com.xworkz.map.dto.HotelDTO;
import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HotelRunner {

    public static void main(String[] args) {

        Comparator<HotelDTO> comparator = new Comparator<HotelDTO>() {
            @Override
            public int compare(HotelDTO o1, HotelDTO o2) {
                if(o2.getPricePerNight()>o1.getPricePerNight()){
                    return 1;
                } else if (o2.getPricePerNight()==o1.getPricePerNight()) {
                    return 0;
                }else {
                    return -1;
                }
            }
        };
        List<HotelDTO> hotel = new ArrayList<>();
        hotel.add(new HotelDTO("Taj",1000));
        hotel.add(new HotelDTO("Vishal",2000));
        hotel.add(new HotelDTO("Raj",3000));
        hotel.add(new HotelDTO("Kushi",4000));

        hotel.forEach(e-> System.out.println(e));

        System.out.println("--------------------------------------------------------------");

        Collections.sort(hotel,comparator);

        hotel.forEach(e-> System.out.println(e));
    }
}
