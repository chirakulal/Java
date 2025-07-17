package com.xworkz.maptolist.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ChairDto {
    private String brand;
    private String type;
    private double price;
    private String color;
    private String material;
    private boolean adjustable;
    private String origin;
    private String mechanism;
    private String feature;
    private String store;
}
