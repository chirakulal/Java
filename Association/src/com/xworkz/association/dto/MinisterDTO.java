package com.xworkz.association.dto;

import lombok.*;

import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class MinisterDTO {
    private String name;
    private String party;
    private int age;
    private String contactNumber;
    private List<PortfolioDTO> portfolioDTOList;

}
