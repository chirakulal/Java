package com.xworkz.instanceandassociation.dto;

import lombok.*;

import java.util.List;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class CompanyDTO {

    private String companyName;
    private String industryType;
    private int employeeCount;
    private double revenueInCrores;
    private List<OwnerDTO> owner;

}
