package com.xworkz.inheritence.external;


public class Manager  {
    private String name;
    private String department;
    private int experienceYears;


    public Manager(String name, String department, int experienceYears) {
        this.name = name;
        this.department = department;
        this.experienceYears = experienceYears;
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", experienceYears=" + experienceYears;
    }

    @Override
    public int hashCode() {
        return 20;
    }
}
