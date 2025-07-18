package com.xworkz.association.dto;

import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@NoArgsConstructor
@ToString
public class PortfolioDTO {
    private String portfolioName;
    private String term;
    private String responsibility;
    private String location;
    private DepartmentDTO departmentDTO;

}
