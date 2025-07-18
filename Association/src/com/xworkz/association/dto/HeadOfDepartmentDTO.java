package com.xworkz.association.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@ToString
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class HeadOfDepartmentDTO {
    private String name;
    private int experienceInYears;
    private String email;
    private String specialization;
    private List<StaffDTO> staffDTOList;

}
