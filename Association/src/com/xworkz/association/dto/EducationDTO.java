package com.xworkz.association.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EducationDTO {

    private String degree;
    private int yearOfPassing;
    private double percentage;
    private String specialization;
    private UniversityDTO universityDTO;


}
