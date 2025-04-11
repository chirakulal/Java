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
                        ", officialLanguage='" + officialLanguage + '\'';
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 62;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof India) {
                India india = (India) obj;
                if (this.capital.equals(india.capital)
                        && this.population == india.population) {
                    System.out.println("Both India objects are same based on capital and population");
                    return true;
                }
            }
        }
        return false;
    }
}
