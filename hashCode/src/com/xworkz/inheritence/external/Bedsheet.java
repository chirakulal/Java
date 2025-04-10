package com.xworkz.inheritence.external;


public class Bedsheet  {

    private String material;
    private String size;
    private boolean isPrinted;


    public Bedsheet(String material, String size, boolean isPrinted) {
        this.material = material;
        this.size = size;
        this.isPrinted = isPrinted;
    }


    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", isPrinted=" + isPrinted ;
    }

    @Override
    public int hashCode() {
        return 66;
    }
}
