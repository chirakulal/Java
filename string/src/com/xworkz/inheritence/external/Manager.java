package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Employee;

public class Manager extends Employee {
    private String name;
    private String department;
    private int experienceYears;


    public Manager(String name, String department, int experienceYears) {
        this.name = name;
        this.department = department;
        this.experienceYears = experienceYears;
    }
    @Override
    public void department(){
        System.out.println("Running department in running in Manager");
    }
    @Override
    public  void salary(){
        System.out.println("Running salary in running in Manager");
    }
    @Override
    public  void timepass(){
        System.out.println("Running timepass in Manager");
    }
    @Override
    public void work(){
        System.out.println("running work in Manager");
    }
    @Override
    public void eat(){
        System.out.println("Running eat in Manager");
    }
    public void schedule(){
        System.out.println("RUnning scheule in Manager");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", experienceYears=" + experienceYears;
    }
}
