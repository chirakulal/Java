package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Country;
import com.xworkz.inheritence.internal.Insect;

public class India extends Country {
     private String capital;
    private long population;
    private String officialLanguage;


    public India(String capital, long population, String officialLanguage) {
        this.capital = capital;
        this.population = population;
        this.officialLanguage = officialLanguage;
    }

    @Override
    public void continent() {
        System.out.println("Running continent in India");
    }

    @Override
    public void population() {
        System.out.println("Running population in India");
    }

    @Override
    public void government() {
        System.out.println("Running government in India");
    }

    @Override
    public void currency() {
        System.out.println("Running currency in India");
    }

    @Override
    public void language() {
        System.out.println("Running language in India");
    }

    @Override
    public String toString() {
        return
                "capital='" + capital + '\'' +
                ", population=" + population +
                ", officialLanguage='" + officialLanguage ;
    }
}
