package com.xworkz.maptolist.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ShoeDto {
    private String brand;
    private String type;
    private double price;
    private int size;
    private String material;
    private String color;
    private String originCountry;
    private boolean waterproof;
    private String technology;
    private String storeName;
}
