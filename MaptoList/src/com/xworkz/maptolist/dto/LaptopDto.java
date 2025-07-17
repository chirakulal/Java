package com.xworkz.maptolist.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class LaptopDto {

    private String brand;
    private String model;
    private double price;
    private String processor;
    private int ramGB;
    private int storageGB;
    private double screenSize;
    private String os;
    private String originCountry;
    private boolean touchScreen;
}
