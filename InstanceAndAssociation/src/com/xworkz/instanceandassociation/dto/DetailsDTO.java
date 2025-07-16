package com.xworkz.instanceandassociation.dto;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class DetailsDTO {
    private String type;
    private String ownerName;
    private String status;
    private String registrationDate;
    private AddressDTO address;
}
