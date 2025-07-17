package com.xworkz.maptolist.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class BottleDto {
    private String brand;
    private String material;
    private double price;
    private double capacityLitres;
    private boolean insulated;
    private String origin;
    private String color;
    private String usage;
    private String feature;
    private String store;
}
