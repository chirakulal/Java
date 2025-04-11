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

    @Override
    public boolean equals(Object obj) {
        if(obj !=null){
            System.out.println("ref is not null");
            if(obj instanceof School){
                School school = this;
                School school1 = (School) obj;
                if(school1.name.equals(school.name)&&school1.location.equals(school.name)&&school.numStudents==school1.numStudents){
                    System.out.println("Both are same");
                    return true;
                }

            }
        }
        return false;
    }
}
