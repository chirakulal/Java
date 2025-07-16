package com.xworkz.instanceandassociation.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class PresidentDTO {

    private String name;
    private int age;
    private String country;
    private int yearsInOffice;
    private DesignationDTO designation;

}
