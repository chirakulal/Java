package com.xworkz.instanceandassociation.dto;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class MayorDTO {
    private String name;
    private int age;
    private String city;
    private String party;
    private VehicleDTO vehicle;


}
