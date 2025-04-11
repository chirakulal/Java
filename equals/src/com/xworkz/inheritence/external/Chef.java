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
                        ", experienceYears=" + experienceYears;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 53;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Chef) {
                Chef chef = (Chef) obj;
                if (this.name.equals(chef.name) &&
                        this.specialty.equals(chef.specialty)) {
                    System.out.println("Both Chef objects are same based on name and specialty");
                    return true;
                }
            }
        }
        return false;
    }
}
