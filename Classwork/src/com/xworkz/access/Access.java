package com.xworkz.access;

import com.xworkz.instance.Company;

public class Access {

    Company company = new Company("IBM","IT",200);

    public void display(){
        System.out.println("Running display in Access");
        if(company!=null){
            company.work();
            System.out.println(company.name);
        }
    }
}
