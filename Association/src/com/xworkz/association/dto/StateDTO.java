package com.xworkz.association.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Setter
@Getter
public class StateDTO {
    private String name;
    private String cmName;
    private int noOfDistricts;
    private double areaInSqKm;
    private List<MinisterDTO> ministerDTOS;
}
