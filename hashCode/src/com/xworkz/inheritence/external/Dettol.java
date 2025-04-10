package com.xworkz.inheritence.external;



public class Dettol  {
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
                ", isAntibacterial=" + isAntibacterial ;
    }

    @Override
    public int hashCode() {
        return 79;
    }
}
