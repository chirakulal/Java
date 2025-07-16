package com.xworkz.instanceandassociation.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class DesignationDTO {

    private String title;
    private String code;
    private String band;
    private double gradePay;
    private RoleDTO role;


}
