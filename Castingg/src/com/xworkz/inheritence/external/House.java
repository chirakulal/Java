package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Building;

public class House extends Building {

    public House(){
        super();
        System.out.println("no-argu const is running");
    }
    @Override
    public void rooms(){
        System.out.println("Running roomsin House");
    }
    @Override
    public void floor(){
        System.out.println("running floor in House");
    }
    @Override
    public void blocks(){
        System.out.println("Running blocks in House");
    }
    @Override
    public void bhk(){
        System.out.println("Running bhk in House");
    }
    @Override
    public void security(){
        System.out.println("Running security in House");
    }
    public void sit(){
        System.out.println("Running sit in House");
    }
}
