package com.xworkz.inheritence.external;

public class Pizza {
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
        System.out.println("Parent :" + super.hashCode());
        return 17;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Pizza) {
                Pizza pizza = this;
                Pizza pizza1 = (Pizza) obj;
                if (pizza.size.equals(pizza1.size) &&
                        pizza.topping.equals(pizza1.topping) &&
                        pizza.isVegetarian == pizza1.isVegetarian) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
