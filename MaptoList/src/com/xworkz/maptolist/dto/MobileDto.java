package com.xworkz.maptolist.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class MobileDto {
    private String brand;
    private String model;
    private double price;
    private String os;
    private int storageGB;
    private double screenSize;
    private String processor;
    private String originCountry;
    private boolean has5G;
    private String displayType;
}
