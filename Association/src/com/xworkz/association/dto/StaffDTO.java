package com.xworkz.association.dto;

import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Setter
@Getter
@NoArgsConstructor
public class StaffDTO {

    private String name;
    private String role;
    private String shift;
    private double salary;
    private DetailDTO details;

}
