package com.xworkz.maptolist.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PenDto {
    private String brand;
    private String type;
    private double price;
    private String color;
    private String inkType;
    private boolean refillable;
    private String bodyMaterial;
    private String origin;
    private String nibSize;
    private String store;

}
