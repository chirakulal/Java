package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Country;
import com.xworkz.inheritence.internal.Insect;

public class India extends Country {
    public India(){
        super();
        System.out.println("NO-argu const is running");
    }

    @Override
    public void continent() {
        System.out.println("This India belongs to a continent");
    }

    public void population() {
        System.out.println("Every India has a population");
    }

    public void government() {
        System.out.println("Each country has a type of government");
    }

    public void currency() {
        System.out.println("Each country has its own currency");
    }

    public void language() {
        System.out.println("Each country has its official languages");
    }

}
