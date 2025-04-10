package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Government;

public class Democracy extends Government {

    public Democracy(){
        super();
        System.out.println("no-argu const running in democracy");
    }
    public void holdElection(){
        System.out.println("running holdElection  in democracy ");
    }
    public Government(){
        System.out.println("no-argument constructor in Government");
    }

    public void makeLaws(){
        System.out.println("Running makeLaws in Democracy");
    }
    public void enforceLaws(){
        System.out.println("Running enforeceLaws in Democracy");
    }

    public void collectTaxes(){
        System.out.println("Running collectTaxes in Democracy");
    }

    public void provideService(){
        System.out.println("Running provideService in Democracy");
    }
    public void conductElections(){
        System.out.println("Running conductElection in Democracy");
    }
}
