package com.xworkz.general.dto;

import java.io.Serializable;

public class JobDTO implements Serializable {

    private String name;
    private String email;
    private String education;
    private String skills;
    private double expectedSalary;
    private int experience;

    public JobDTO(){

    }


    public JobDTO(String email, String name, String education, String skills, int experience, double expectedSalary) {
        this.email = email;
        this.name = name;
        this.education = education;
        this.skills = skills;
        this.experience = experience;
        this.expectedSalary = expectedSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }



    @Override
    public String toString() {
        return "JobDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", skills='" + skills + '\'' +
                ", expectedSalary=" + expectedSalary +
                ", experience=" + experience +
                '}';
    }
}
