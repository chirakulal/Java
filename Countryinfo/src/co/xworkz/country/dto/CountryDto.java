package co.xworkz.country.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CountryDto implements Serializable {

    private String name;
    private long pinCode;
    private double populationInMillions;
    private int noOfStates;
    private double massInSqKms;
    private String primeMinister;
    private String primaryLanguage;
    private String secondaryLanguage;
    private double gdp;


}
