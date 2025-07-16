package com.xworkz.instanceandassociation.dto;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CityDTO {
    private String name;
    private int populationInLakhs;
    private double areaInSqKm;
    private String state;
    private InformationDTO information;
}
