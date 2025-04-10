package com.xworkz.inheritence.external;


public class Chef {

    private String name;
    private String specialty;
    private int experienceYears;


    public Chef(String name, String specialty, int experienceYears) {
        this.name = name;
        this.specialty = specialty;
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", experienceYears=" + experienceYears ;
    }

    @Override
    public int hashCode() {
        return 53;
    }
}
