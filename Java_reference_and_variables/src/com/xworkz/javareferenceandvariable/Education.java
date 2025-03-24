package com.xworkz.javareferenceandvariable;

public class Education {

    String degree;
    String institutionName;
    int yearOfPassing;
    double grade;

    Education(String degree, String institutionName, int yearOfPassing, double grade) {
        this.degree = degree;
        this.institutionName = institutionName;
        this.yearOfPassing = yearOfPassing;
        this.grade = grade;
        System.out.println(this.degree+" "+this.institutionName+" "+this.yearOfPassing+" "+this.grade);
    }
    void display(){
        System.out.println("Running display in education");
    }

}
