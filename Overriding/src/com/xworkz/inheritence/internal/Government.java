package com.xworkz.inheritence.internal;

public class Government {

    public Government(){
        System.out.println("no-argument constructor in Government");
    }

    public void makeLaws(){
        System.out.println("Running makeLaws in Government");
    }
    public void enforceLaws(){
        System.out.println("Running enforeceLaws in Government");
    }

   public void collectTaxes(){
        System.out.println("Running collectTaxes in Government");
    }

   public void provideService(){
        System.out.println("Running provideService in Government");
    }
   public void conductElections(){
        System.out.println("Running conductElection in Government");
    }
}
