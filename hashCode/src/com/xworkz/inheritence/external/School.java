package com.xworkz.inheritence.external;



public class School  {

    private String name;
    private String location;
    private int numStudents;


    public School(String name, String location, int numStudents) {
        this.name = name;
        this.location = location;
        this.numStudents = numStudents;
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", numStudents=" + numStudents;
    }

    @Override
    public int hashCode() {
        System.out.println("Parents : "+ super.hashCode());
        return 6;
    }
}
