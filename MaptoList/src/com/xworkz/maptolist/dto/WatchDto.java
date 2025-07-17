package com.xworkz.maptolist.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class WatchDto {
    private String brand;
    private String type;
    private double price;
    private String strapMaterial;
    private String color;
    private boolean smart;
    private String movement;
    private String country;
    private String shape;
    private String store;
}
