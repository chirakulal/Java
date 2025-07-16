package com.xworkz.instanceandassociation.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO {

    private String roleName;
    private String department;
    private String roleLevel;
    private double baseSalary;
    private List<CriteriaDTO> criteriaDTO;

}
