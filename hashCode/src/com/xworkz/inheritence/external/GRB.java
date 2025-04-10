package com.xworkz.inheritence.external;


public class GRB  {
    private double duration;
    private double intensity;
    private String originGalaxy;


    public GRB(double duration, double intensity, String originGalaxy) {
        this.duration = duration;
        this.intensity = intensity;
        this.originGalaxy = originGalaxy;
    }


    @Override
    public String toString() {
        return
                "duration=" + duration +
                ", intensity=" + intensity +
                ", originGalaxy='" + originGalaxy ;
    }

    @Override
    public int hashCode() {
        return 72;
    }
}
