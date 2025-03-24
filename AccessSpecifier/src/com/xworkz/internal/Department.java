package com.xworkz.internal;

public class Department {

    Company company;

    public Department(Company company){
        this.company=company;
    }
    public void display(){
        System.out.println("Running display in Department");
        if(this.company!=null){
            this.company.work();
            this.company.hire();
            System.out.println(this.company.name);
            System.out.println(this.company.salary);
        }
    }
}
