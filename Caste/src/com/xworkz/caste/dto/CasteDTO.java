package com.xworkz.caste.dto;

import java.io.Serializable;

public class CasteDTO implements Serializable {

    private String fullName;
    private String address;
    private String caste;
    private String gender;
    private String occupation;
    private int age;
    private double income;
    private boolean isBpl;

    public CasteDTO(){

    }

    public CasteDTO(String fullName, String address, String caste, String gender, String occupation, int age, double income, boolean isBpl) {
        this.fullName = fullName;
        this.address = address;
        this.caste = caste;
        this.gender = gender;
        this.occupation = occupation;
        this.age = age;
        this.income = income;
        this.isBpl = isBpl;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public boolean isBpl() {
        return isBpl;
    }

    public void setBpl(boolean bpl) {
        isBpl = bpl;
    }

    @Override
    public String toString() {
        return "CasteDTO{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", caste='" + caste + '\'' +
                ", gender='" + gender + '\'' +
                ", occupation='" + occupation + '\'' +
                ", age=" + age +
                ", income=" + income +
                ", isBpl=" + isBpl +
                '}';
    }
}
