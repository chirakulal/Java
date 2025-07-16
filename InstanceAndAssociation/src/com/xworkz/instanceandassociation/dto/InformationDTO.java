package com.xworkz.instanceandassociation.dto;

import lombok.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class InformationDTO {
    private String headline;
    private String content;
    private String source;
    private String date;
    private MayorDTO mayor;
}
