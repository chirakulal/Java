package com.xworkz.instanceandassociation.dto;

import lombok.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class VehicleDTO {

    private String brand;
    private String model;
    private String fuelType;
    private int manufactureYear;
    private RegistrationDTO registration;
}
