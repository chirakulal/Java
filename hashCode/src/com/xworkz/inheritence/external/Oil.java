package com.xworkz.inheritence.external;


public class Oil  {
    private String type;
    private int quantity;
    private boolean isEdible;


    public Oil(String type, int quantity, boolean isEdible) {
        this.type = type;
        this.quantity = quantity;
        this.isEdible = isEdible;
    }


    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                ", quantity=" + quantity +
                ", isEdible=" + isEdible ;
    }

    @Override
    public int hashCode() {
        return 70;
    }
}
