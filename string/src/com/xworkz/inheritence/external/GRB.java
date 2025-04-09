package com.xworkz.inheritence.external;


import com.xworkz.inheritence.internal.DairyProduct;

public class GRB extends DairyProduct {
    private double duration;
    private double intensity;
    private String originGalaxy;


    public GRB(double duration, double intensity, String originGalaxy) {
        this.duration = duration;
        this.intensity = intensity;
        this.originGalaxy = originGalaxy;
    }
        @Override
    public void storeCold() {
        System.out.println("Running storeCold in GRB");
    }

    @Override
    public void consume() {
        System.out.println("Running consume in GRB");
    }

    @Override
    public void mixWithFood() {
        System.out.println("Running mixWithFood in GRB");
    }

    @Override
    public void provideNutrients() {
        System.out.println("Running provideNutrients in GRB");
    }

    @Override
    public void expireQuickly() {
        System.out.println("Running expireQuickly in GRB");
    }

    @Override
    public String toString() {
        return
                "duration=" + duration +
                ", intensity=" + intensity +
                ", originGalaxy='" + originGalaxy ;
    }
}
