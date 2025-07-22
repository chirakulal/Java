package com.xworkz.compare.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {

    private int id;
    private String name;
    private String email;
    private long phone;
    private boolean active;
}
