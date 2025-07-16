package com.xworkz.instanceandassociation.dto;

import lombok.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class AddressDTO {
    private String street;
    private String area;
    private String pinCode;
    private String landmark;
    private CityDTO city;
}
