package com.xworkz.inheritence.external;



public class LeafVeg {

    private String name;
    private String color;
    private boolean isSeasonal;

    // Constructor
    public LeafVeg(String name, String color, boolean isSeasonal) {
        super();
        this.name = name;
        this.color = color;
        this.isSeasonal = isSeasonal;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", isSeasonal=" + isSeasonal;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : "+super.hashCode());
        return 5;
    }
}
