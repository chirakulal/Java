package com.xworkz.javareferenceandvariable;

public class Company {

    String name;
    String location;
    int employeeCount;
    String industry;

    Company(String name, String location, int employeeCount, String industry) {
        this.name = name;
        this.location = location;
        this.employeeCount = employeeCount;
        this.industry = industry;
        System.out.println(this.name+" "+this.location+" "+this.employeeCount+" "+this.industry);
    }
    void display(){
        System.out.println("Running display in Company");
    }

}
