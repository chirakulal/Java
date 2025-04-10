package com.xworkz.inheritence.external;

public class Pizza{
    private String size;
    private String topping;
    private boolean isVegetarian;

    public Pizza(String size, String topping, boolean isVegetarian) {
        this.size = size;
        this.topping = topping;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String toString() {
        return
                "size='" + size + '\'' +
                ", topping='" + topping + '\'' +
                ", isVegetarian=" + isVegetarian;
    }

    @Override
    public int hashCode() {
        return 17;
    }
}
