package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Device;

public class Phone extends Device {

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
    public void message(){
        System.out.println("message is running in Phone ");
    }
    @Override
    public void call(){
        System.out.println("Running call in Phone ");
    }
    @Override
    public void playGames(){
        System.out.println("Running playGames in Phone ");
    }
    @Override
    public void videoCall(){
        System.out.println("Running videoCall in Phone ");
    }
    @Override
    public void track(){
        System.out.println("Running track in Phone ");
    }
    public void chat(){
        System.out.println("Running chat in Phone");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", prize='" + prize + '\'' +
                ", ram=" + ram ;
    }
}
