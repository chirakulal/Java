package co.xworkz.country.dto;

import java.io.Serializable;

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

    public CountryDto() {
    }

    public CountryDto(String name, long pinCode, double populationInMillions, int noOfStates, double massInSqKms, String primeMinister, String primaryLanguage, String secondaryLanguage, double gdp) {
        this.name = name;
        this.pinCode = pinCode;
        this.populationInMillions = populationInMillions;
        this.noOfStates = noOfStates;
        this.massInSqKms = massInSqKms;
        this.primeMinister = primeMinister;
        this.primaryLanguage = primaryLanguage;
        this.secondaryLanguage = secondaryLanguage;
        this.gdp = gdp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public double getPopulationInMillions() {
        return populationInMillions;
    }

    public void setPopulationInMillions(double populationInMillions) {
        this.populationInMillions = populationInMillions;
    }

    public int getNoOfStates() {
        return noOfStates;
    }

    @Override
    public String toString() {
        return "CountryDto{" +
                "name='" + name + '\'' +
                ", pinCode=" + pinCode +
                ", populationInMillions=" + populationInMillions +
                ", noOfStates=" + noOfStates +
                ", massInSqKms=" + massInSqKms +
                ", primeMinister='" + primeMinister + '\'' +
                ", primaryLanguage='" + primaryLanguage + '\'' +
                ", secondaryLanguage='" + secondaryLanguage + '\'' +
                ", gdp=" + gdp +
                '}';
    }

    public void setNoOfStates(int noOfStates) {
        this.noOfStates = noOfStates;
    }

    public double getMassInSqKms() {
        return massInSqKms;
    }

    public void setMassInSqKms(double massInSqKms) {
        this.massInSqKms = massInSqKms;
    }

    public String getPrimeMinister() {
        return primeMinister;
    }

    public void setPrimeMinister(String primeMinister) {
        this.primeMinister = primeMinister;
    }

    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public String getSecondaryLanguage() {
        return secondaryLanguage;
    }

    public void setSecondaryLanguage(String secondaryLanguage) {
        this.secondaryLanguage = secondaryLanguage;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }
}
