package com.xworkz.inheritence.external;


public class India {
     private String capital;
    private long population;
    private String officialLanguage;


    public India(String capital, long population, String officialLanguage) {
        this.capital = capital;
        this.population = population;
        this.officialLanguage = officialLanguage;
    }


    @Override
    public String toString() {
        return
                "capital='" + capital + '\'' +
                ", population=" + population +
                ", officialLanguage='" + officialLanguage ;
    }

    @Override
    public int hashCode() {
        return 62;
    }
}
