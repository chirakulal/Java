package com.xworkz.association.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class CountryDto {
    private String name;
    private String capital;
    private long population;
    private double gdp;
    private List<StateDTO> states;

}
