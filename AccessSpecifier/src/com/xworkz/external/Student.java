package com.xworkz.external;

import com.xworkz.internal.School;

public class Student {

    School school;

    public Student(School school){
        this.school=school;
    }
    public void educate(){
        System.out.println("Running school in Student");
        this.school.requirement();
        System.out.println(this.school.name);
    }
}
