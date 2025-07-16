package com.xworkz.instanceandassociation.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class OwnerDTO {

    private String ownerName;
    private String contactNumber;
    private String email;
    private String idProof;
    private List<HouseDTO> house;
}
