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

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("ref is not null");
            if(obj instanceof LeafVeg){
                LeafVeg leafVeg = this;
                LeafVeg leafVeg1 = (LeafVeg) obj;
                if(leafVeg.name.equals(leafVeg1.name)&&leafVeg.color.equals(leafVeg1.color)&&leafVeg.isSeasonal==leafVeg1.isSeasonal){
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
