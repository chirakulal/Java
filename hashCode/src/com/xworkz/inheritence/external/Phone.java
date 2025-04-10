package com.xworkz.inheritence.external;


public class Phone{

    private String brand;
    private String prize;
    private int ram;

    public Phone(String brand,String prize,int ram){
        super();
        this.ram=ram;
       this.brand=brand;
       this.prize=prize;
    }


    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", prize='" + prize + '\'' +
                ", ram=" + ram ;
    }
}
