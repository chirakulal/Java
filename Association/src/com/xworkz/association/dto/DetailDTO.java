package com.xworkz.association.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class DetailDTO {

    private String gender;
    private String dob;
    private String address;
    private String nationality;
    private EducationDTO educationDTO;

}
