package com.xworkz.maptolist.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class HeadphoneDto {
    private String brand;
    private String model;
    private double price;
    private String type;
    private String color;
    private boolean wireless;
    private String origin;
    private String style;
    private int batteryLifeHours;
    private String store;
}
