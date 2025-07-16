package com.xworkz.instanceandassociation.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CriteriaDTO {
    private String degree;
    private double experienceInYears;
    private String noticePeriod;
    private boolean willingToRelocate;
    private SalaryExpectationDTO salaryExpectationDTO;
}
