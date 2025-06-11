package com.xworkz.general.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageCertificateDTO implements Serializable {

    private String groomName;
    private String brideNAme;
    private String location;
    private String address;
    private String Religion;
    private LocalDate date;
    private String witness1;
    private String witness2;
    private String officer;

    public MarriageCertificateDTO(){

    }

    public MarriageCertificateDTO(String groomName, String brideNAme, String location, String address, String religion, LocalDate date, String witness1, String witness2, String officer) {
        this.groomName = groomName;
        this.brideNAme = brideNAme;
        this.location = location;
        this.address = address;
        Religion = religion;
        this.date = date;
        this.witness1 = witness1;
        this.witness2 = witness2;
        this.officer = officer;
    }

    @Override
    public String toString() {
        return "MarriageCertificateDTO{" +
                "groomName='" + groomName + '\'' +
                ", brideNAme='" + brideNAme + '\'' +
                ", location='" + location + '\'' +
                ", address='" + address + '\'' +
                ", Religion='" + Religion + '\'' +
                ", date=" + date +
                ", witness1='" + witness1 + '\'' +
                ", witness2='" + witness2 + '\'' +
                ", officer='" + officer + '\'' +
                '}';
    }

    public String getGroomName() {
        return groomName;
    }

    public void setGroomName(String groomName) {
        this.groomName = groomName;
    }

    public String getBrideNAme() {
        return brideNAme;
    }

    public void setBrideNAme(String brideNAme) {
        this.brideNAme = brideNAme;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String religion) {
        Religion = religion;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getWitness1() {
        return witness1;
    }

    public void setWitness1(String witness1) {
        this.witness1 = witness1;
    }

    public String getWitness2() {
        return witness2;
    }

    public void setWitness2(String witness2) {
        this.witness2 = witness2;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }
}
