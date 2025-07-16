package com.xworkz.instanceandassociation.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class EducationDTO {

    private String degree;
    private String stream;
    private int graduationYear;
    private double percentage;
    private UniversityDTO universityDTO;
}
