package com.xworkz.mapiterator.runner;

import com.xworkz.mapiterator.dto.TrainDTO;

import java.util.HashMap;
import java.util.Map;

public class TrainRunner {

    public static void main(String[] args) {
        Map<String, TrainDTO> trains = new HashMap<>();
        trains.put("SHATABDI_12010", new TrainDTO("Shatabdi Express", 12010, "Chennai Central", "Bangalore City", 18, 88.5, "Superfast", true, 362.0, "Mon, Wed, Fri"));

        trains.put("RAJDHANI_12951", new TrainDTO("Rajdhani Express", 12951, "Mumbai Central", "New Delhi", 22, 91.3, "Express", true, 1384.0, "Daily"));

        trains.put("DURONTO_12245", new TrainDTO("Duronto Express", 12245, "Howrah", "Yeshwantpur", 20, 85.0, "Express", true, 1956.0, "Tue, Thu, Sat"));

        trains.put("INTERCITY_22625", new TrainDTO("Intercity Express", 22625, "Mangalore", "Bangalore", 16, 60.0, "Passenger", false, 357.0, "Mon to Sat"));

        trains.put("VANDE_BHARAT_22436", new TrainDTO("Vande Bharat", 22436, "Varanasi", "New Delhi", 16, 95.0, "Semi-High Speed", true, 776.0, "Daily"));


        for (Map.Entry<String,TrainDTO> entry:trains.entrySet()){
            System.out.println("Key :"+entry.getKey()+" "+"Values :"+entry.getValue());
        }
    }
}
