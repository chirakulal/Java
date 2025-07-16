package com.xworkz.instanceandassociation.dto;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UniversityDTO {
    private String name;
    private String location;
    private int establishedYear;
    private String accreditation;
    private PresidentDTO presidentDTO;

}
