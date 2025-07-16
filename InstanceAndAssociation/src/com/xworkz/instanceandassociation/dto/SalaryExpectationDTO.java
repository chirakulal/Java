package com.xworkz.instanceandassociation.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class SalaryExpectationDTO {

    private String candidateName;
    private double expectedCTC;
    private String preferredLocation;
    private String jobRole;
    private BonusDTO bonus;

}
