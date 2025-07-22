package com.xworkz.compare.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {
    private int id;
    private String name;
    private String email;
    private long phone;
    private LocalDate dob;
}
