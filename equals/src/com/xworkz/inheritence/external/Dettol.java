package com.xworkz.inheritence.external;

public class Dettol {
    private String type;
    private int volume;
    private boolean isAntibacterial;

    public Dettol(String type, int volume, boolean isAntibacterial) {
        this.type = type;
        this.volume = volume;
        this.isAntibacterial = isAntibacterial;
    }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                        ", volume=" + volume +
                        ", isAntibacterial=" + isAntibacterial;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 79;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Dettol) {
                Dettol other = (Dettol) obj;
                if (this.type.equals(other.type)) {
                    System.out.println("Both Dettol objects are same based on type");
                    return true;
                }
            }
        }
        return false;
    }
}
