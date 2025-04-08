package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Education;

public class School extends Education {

    public School(){
        System.out.println("no-argu const is running");
    }
    @Override
    public void teach(){
        System.out.println("Running teach im School");
    }
    @Override
    public void exams(){
        System.out.println("Running exams in School");
    }
    @Override
    public void activity(){
        System.out.println("Running activity in School");
    }
    @Override
    public void certificates(){
        System.out.println("Running certificates in School");
    }
    @Override
    public void events(){
        System.out.println("Running events in School");
    }

    public void play(){
        System.out.println("Running play in School");
    }
}
