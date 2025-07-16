package com.xworkz.instanceandassociation.dto;

import lombok.*;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceDTO {

    private String companyName;
    private String role;
    private int yearsOfExperience;
    private boolean currentlyWorking;
    private EducationDTO education;
}
