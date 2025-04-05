package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Chocolate;

public class DairyMilk extends Chocolate {

    public DairyMilk() {
        super();
        System.out.println("No-arg constructor in DairyMilk");
    }
    @Override
    public void unwrap() {
        System.out.println("Running unwrap in unwrap");
    }
    @Override
    public void bite() {
        System.out.println("Running bite in unwrap");
    }
    @Override
    public void share() {
        System.out.println("Running share in unwrap");
    }
    @Override
    public void melt() {
        System.out.println("Running melt in unwrap");
    }
    @Override
    public void chew() {
        System.out.println("Running chew in unwrap");
    }
}
