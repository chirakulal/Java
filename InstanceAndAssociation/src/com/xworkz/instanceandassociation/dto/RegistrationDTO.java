package com.xworkz.instanceandassociation.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class RegistrationDTO {

    private String registrationNumber;
    private String vehicleType;
    private String registrationDate;
    private boolean isActive;
    private RTODTO rto;
}
