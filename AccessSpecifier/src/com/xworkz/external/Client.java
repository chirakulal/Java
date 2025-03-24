package com.xworkz.external;

import com.xworkz.internal.Company;

public class Client {

    Company company;
   public Client(Company company){
        this.company=company;
    }

    public void display(){
        if(this.company!=null){
            System.out.println(this.company.name);
            this.company.hire();
        }

    }
}
