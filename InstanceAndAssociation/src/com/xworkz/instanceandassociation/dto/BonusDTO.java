package com.xworkz.instanceandassociation.dto;


import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class BonusDTO {

    private String bonusType;
    private double amount;
    private String issuedBy;
    private String reason;
    private VariablePayDTO variablePayDTO;
}
