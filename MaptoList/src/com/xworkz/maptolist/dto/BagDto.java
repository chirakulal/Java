package com.xworkz.maptolist.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class BagDto {
    private String brand;
    private String color;
    private double price;
    private int capacity;
    private String material;
    private boolean waterproof;
    private String madeIn;
    private double weight;
    private String zipType;
    private String storeName;
}
