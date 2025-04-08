package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Food;

public class Pizza extends Food {
    public Pizza(){
        super();
        System.out.println("no-argu const in Pizza");
    }
    @Override
    public void ingredients(){
        System.out.println("Running ingredients in  Pizza");
    }
    @Override
    public void eat(){
        System.out.println("Running eat in  Pizza");
    }
    @Override
    public void addsalt(){
        System.out.println("Running addsalt in  Pizza");
    }
    @Override
    public void addSpinach(){
        System.out.println("Running addspinach in  Pizza");
    }
    @Override
    public void  empty(){
        System.out.println("Running empty in  Pizza");
    }
    public void bake(){
        System.out.println("Running bake in Pizza");
    }
}
