package com.xworkz.instanceandassociation.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class TaxDTO {

    private String taxType;
    private double taxRate;
    private String applicableTo;
    private String department;
    private GovernmentDTO governmentDTO;

}
