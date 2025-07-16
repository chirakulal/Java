package com.xworkz.instanceandassociation.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class VariablePayDTO {

    private String employeeName;
    private double baseSalary;
    private double bonusSalary;
    private String department;
    private TaxDTO tax;

}
