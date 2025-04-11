package com.xworkz.inheritence.external;

public class GRB {

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
                        ", originGalaxy='" + originGalaxy + '\'';
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 72;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof GRB) {
                GRB grb = (GRB) obj;
                if (this.originGalaxy.equals(grb.originGalaxy)) {
                    System.out.println("Both GRB objects are same based on originGalaxy");
                    return true;
                }
            }
        }
        return false;
    }
}
