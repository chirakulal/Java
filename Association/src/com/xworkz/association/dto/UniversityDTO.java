package com.xworkz.association.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@EqualsAndHashCode
public class UniversityDTO {
    private String name;
    private String location;
    private int ranking;
    private int establishedYear;
    private ChancellorDTO chancellor;


}
