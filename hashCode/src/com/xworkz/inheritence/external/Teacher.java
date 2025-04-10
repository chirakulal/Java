package com.xworkz.inheritence.external;

public class Teacher  {
    private String name;
    private String subject;
    private int yearsOfExperience;


    public Teacher(String name, String subject, int yearsOfExperience) {
        this.name = name;
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", yearsOfExperience=" + yearsOfExperience;
    }

    @Override
    public int hashCode() {
        return 8;
    }
}
