package com.xworkz.inheritence.external;



public class Diamond {

    private double carat;
    private String colorGrade;
    private boolean isCertified;


    public Diamond(double carat, String colorGrade, boolean isCertified) {
        this.carat = carat;
        this.colorGrade = colorGrade;
        this.isCertified = isCertified;
    }

    @Override
    public String toString() {
        return
                "carat=" + carat +
                ", colorGrade='" + colorGrade + '\'' +
                ", isCertified=" + isCertified ;
    }

    @Override
    public int hashCode() {
        return 46;
    }
}
