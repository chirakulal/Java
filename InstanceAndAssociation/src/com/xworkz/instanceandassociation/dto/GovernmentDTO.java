package com.xworkz.instanceandassociation.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GovernmentDTO
{
    private String departmentName;
    private String country;
    private String ministerInCharge;
    private double budgetInCrores;
    private  PrimeMinisterDTO primeMiniste;
}
