package com.xworkz.general.dto;




import java.io.Serializable;

public class PassportDTO implements Serializable {
    private String name;
    private long adharNo;
    private String address;
    private long panNo;
    private String country;
    private String state;
    private String city;
    private long pinCode;
    private String passportType;
    private long refNo;

    public PassportDTO(){

    }

    @Override
    public String toString() {
        return "PassportDTO{" +
                "name='" + name + '\'' +
                ", adharNo=" + adharNo +
                ", address='" + address + '\'' +
                ", panNo=" + panNo +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                ", passportType='" + passportType + '\'' +
                ", refNo=" + refNo +
                '}';
    }

    public PassportDTO(String name, long adharNo, String address, long panNo, String country, String state, String city, long pinCode, String passportType, long refNo) {
        this.name = name;
        this.adharNo = adharNo;
        this.address = address;
        this.panNo = panNo;
        this.country = country;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.passportType = passportType;
        this.refNo = refNo;
        System.out.println(this.name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(long adharNo) {
        this.adharNo = adharNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPanNo() {
        return panNo;
    }

    public void setPanNo(long panNo) {
        this.panNo = panNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public String getPassportType() {
        return passportType;
    }

    public void setPassportType(String passportType) {
        this.passportType = passportType;
    }

    public long getRefNo() {
        return refNo;
    }

    public void setRefNo(long refNo) {
        this.refNo = refNo;
    }
}

