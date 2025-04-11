package com.xworkz.inheritence.external;


public class Truck {

    private String name;
    private int wheel;
    private int speedLimit;

    public Truck(String name,int wheel,int speedLimit){
        super();;
        this.speedLimit=speedLimit;
        this.name=name;
        this.wheel =wheel;
    }


    @Override
    public String toString() {
        return
                "name='" + name +
                ", wheel=" + wheel +
                ", speedLimit=" + speedLimit;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : "+super.hashCode());
        return 3;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("ref is not null");
            if(obj instanceof Truck){
                Truck truck =this;
                Truck truck1 =(Truck) obj;
                if(truck1.name.equals(truck.name)&&truck1.wheel==truck.wheel&&truck1.speedLimit==truck.speedLimit){
                    System.out.println("Both are same ");
                    return true;
                }
            }
        }
        return false;
    }
}
