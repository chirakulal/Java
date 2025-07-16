package com.xworkz.instanceandassociation.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@EqualsAndHashCode
public class ConstituencyDTO {

    private String name;
    private String mlaNAme;
    private int constituencyNumber;
    private String district;
    private WardDTO ward;


}
