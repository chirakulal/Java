package com.xworkz.inheritence.external;



public class Shirt {

    private String size;
    private String color;
    private boolean isFullSleeve;


    public Shirt(String size, String color, boolean isFullSleeve) {
        this.size = size;
        this.color = color;
        this.isFullSleeve = isFullSleeve;
    }
    @Override
    public String toString() {
        return
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", isFullSleeve=" + isFullSleeve ;
    }

    @Override
    public int hashCode() {
        return 18;
    }
}
