package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Bird;

public class Parrot extends Bird {
    public Parrot(){
        super();
        System.out.println("no-argu const running in Parrot");
    }
    public void sing(){
        System.out.println("Running sing in Parrot");
    }
    public void eat(){
        System.out.println("running eat in Parrot");
    }
    public void fly(){
        System.out.println("Running fly in Parrot");
    }
    public void searchFood(){
        System.out.println("Running searchfood in Parrot");
    }
    public void sleep(){
        System.out.println("running sleep in Parrot");
    }
    public void layEgg(){
        System.out.println("Running layEgg in Parrot");
    }
}
