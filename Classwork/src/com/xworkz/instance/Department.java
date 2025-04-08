package com.xworkz.instance;

import java.sql.SQLOutput;

public class Department {

    Company company = new Company("vm","finance",101);

    void work(){
        System.out.println("Running work in department");

        if(company!=null){
            company.work();
            company.join();
            System.out.println(company.name);
            String department = company.department;


        }
    }

}
