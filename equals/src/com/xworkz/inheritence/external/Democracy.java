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

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("ref is not pointing to null");

            if(obj instanceof Democracy){
                Democracy democracy1 = this;
                Democracy democracy2 = (Democracy) obj;
                if(democracy1.countryName.equals(democracy2.countryName)&& democracy1.electionYear==democracy2.electionYear&&democracy1.hasCivilLiberties==democracy2.hasCivilLiberties){
                    System.out.println("Both democracy is same");
                    return true;
                }
            }
        }
        return false;
    }
}
