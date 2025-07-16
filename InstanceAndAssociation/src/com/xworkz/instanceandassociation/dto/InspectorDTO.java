package com.xworkz.instanceandassociation.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class InspectorDTO {

    private String inspectorId;
    private String department;
    private int age;
    private boolean active;
    private List<ExperienceDTO> experience;
}
