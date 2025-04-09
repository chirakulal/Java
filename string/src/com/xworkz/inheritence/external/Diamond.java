package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Gemstone;

public class Diamond extends Gemstone {

    private double carat;
    private String colorGrade;
    private boolean isCertified;


    public Diamond(double carat, String colorGrade, boolean isCertified) {
        this.carat = carat;
        this.colorGrade = colorGrade;
        this.isCertified = isCertified;
    }
    @Override
    public void shine() {
        System.out.println("Running shine in Diamond");
    }

    @Override
    public void cut() {
        System.out.println("Running cut in Diamond");
    }

    @
    Override
    public void polish() {
        System.out.println("Running polish in Diamond");
    }

    @Override
    public void sell() {
        System.out.println("Running sell in Diamond");
    }

    @Override
    public void embedInJewelry() {
        System.out.println("Running embedInJewelry in Diamond");
    }

    public void weigh(){
        System.out.println("Running weigh in Daimond");
    }

    @Override
    public String toString() {
        return
                "carat=" + carat +
                ", colorGrade='" + colorGrade + '\'' +
                ", isCertified=" + isCertified ;
    }
}
