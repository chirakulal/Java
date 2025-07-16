package com.xworkz.instanceandassociation.dto;

import lombok.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class RTODTO {
    private String rtoCode;
    private String zone;
    private String city;
    private boolean centralGovernmentApproved;
    private InspectorDTO inspector;

}
