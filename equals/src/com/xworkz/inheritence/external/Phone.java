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
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Phone) {
                Phone phone1 = this;
                Phone phone2 = (Phone) obj;
                if(phone1.brand.equals(phone2.brand) &&
                        phone1.prize.equals(phone2.prize) &&
                        phone1.ram == phone2.ram) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
