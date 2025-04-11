package com.xworkz.inheritence.external;

public class Everest  {

    private double height;
    private String country;
    private boolean isClimbed;

    public Everest(double height, String country, boolean isClimbed) {
        this.height = height;
        this.country = country;
        this.isClimbed = isClimbed;
    }

    @Override
    public String toString() {
        return
                "height=" + height +
                        ", country='" + country + '\'' +
                        ", isClimbed=" + isClimbed;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 43;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Everest) {
                Everest e1 = this;
                Everest e2 = (Everest) obj;
                if (e1.height == e2.height && e1.isClimbed == e2.isClimbed) {
                    System.out.println("Both are same based on height and isClimbed");
                    return true;
                }
            }
        }
        return false;
    }
}
