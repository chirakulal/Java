package com.xworkz.inheritence.external;


public class Democracy {
    private String countryName;
    private int electionYear;
    private boolean hasCivilLiberties;

    public Democracy(String countryName, int electionYear, boolean hasCivilLiberties){
        super();
        this.countryName = countryName;
        this.electionYear = electionYear;
        this.hasCivilLiberties = hasCivilLiberties;
    }

    @Override
    public String toString() {
        return
                "countryName='" + countryName + '\'' +
                ", electionYear=" + electionYear +
                ", hasCivilLiberties=" + hasCivilLiberties ;
    }

    @Override
    public int hashCode() {
        System.out.println("Parents: "+super.hashCode());
        return 1;
    }
}
