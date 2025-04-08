package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Medicine;

public class Antibiotic extends Medicine {

    public Antibiotic(){
        super();
        System.out.println("no-argu const is running in antibiotic");
    }
    @Override
    public void checkExpiry(){
        System.out.println("Running method in Antibiotic");
    }

    @Override
    public void storeProperly(){
        System.out.println("Running method in Antibiotic");
    }

    @Override
    public void  measureDosage(){
        System.out.println("Running method in Antibiotic");
    }
    @Override
    public void  prescribe(){
        System.out.println("Running method in Antibiotic");
    }
    @Override
    public void consume(){
        System.out.println("Running method in Antibiotic");
    }
    public void mix(){
        System.out.println("Running method in Antibiotic");
    }
}
