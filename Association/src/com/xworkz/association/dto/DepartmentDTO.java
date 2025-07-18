package com.xworkz.association.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class DepartmentDTO {
    private String name;
    private String building;
    private double budget;
    private int noOfStaff;
    private HeadOfDepartmentDTO headOfDepartment;

}
