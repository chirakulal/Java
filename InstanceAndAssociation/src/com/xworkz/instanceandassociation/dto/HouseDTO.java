package com.xworkz.instanceandassociation.dto;

import lombok.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class HouseDTO {
    private String houseNumber;
    private int numberOfFloors;
    private boolean isRented;
    private double builtUpArea;
    private DetailsDTO details;
}
