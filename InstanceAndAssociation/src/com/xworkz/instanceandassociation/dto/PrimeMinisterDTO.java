package com.xworkz.instanceandassociation.dto;


import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PrimeMinisterDTO {

    private String name;
    private int age;
    private String party;
    private int yearInOffice;
    private ConstituencyDTO constituency;

}
