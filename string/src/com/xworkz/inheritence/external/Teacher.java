package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Person;

public class Teacher extends Person {
    private String name;
    private String subject;
    private int yearsOfExperience;


    public Teacher(String name, String subject, int yearsOfExperience) {
        this.name = name;
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }
    @Override
    public void learn(){
        System.out.println("Running learn in Teacher");
    }
    @Override
    public void doJob(){
        System.out.println("Running doJob in Teacher");
    }
    @Override
    public void eat(){
        System.out.println("running eat in Teacher");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep in Teacher");
    }
    @Override
    public void earnMoney(){
        System.out.println("Running earnMoney in Teacher");
    }
    public void teach(){
        System.out.println("Running teach in Teacher");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", yearsOfExperience=" + yearsOfExperience;
    }
}
