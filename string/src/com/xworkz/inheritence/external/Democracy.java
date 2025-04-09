package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Government;

public class Democracy extends Government {
    private String countryName;
    private int electionYear;
    private boolean hasCivilLiberties;

    public Democracy(String countryName, int electionYear, boolean hasCivilLiberties){
        super();
        this.countryName = countryName;
        this.electionYear = electionYear;
        this.hasCivilLiberties = hasCivilLiberties;
    }
    public void holdElection(){
        System.out.println("running holdElection  in democracy ");
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

    @Override
    public String toString() {
        return
                "countryName='" + countryName + '\'' +
                ", electionYear=" + electionYear +
                ", hasCivilLiberties=" + hasCivilLiberties ;
    }
}
