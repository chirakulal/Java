package com.xworkz.compare.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailDTO {

    private int id;
    private String emailAddress;
    private String domain;
    private boolean isVerified;
    private String createdBy;
}
