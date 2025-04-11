package com.xworkz.inheritence.external;

public class Shoe {

    private String brand;
    private int size;
    private boolean isSportsType;

    public Shoe(String brand, int size, boolean isSportsType) {
        this.brand = brand;
        this.size = size;
        this.isSportsType = isSportsType;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", size=" + size +
                        ", isSportsType=" + isSportsType;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 58;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Shoe) {
                Shoe shoe = (Shoe) obj;
                if (this.brand.equals(shoe.brand)
                        && this.size == shoe.size) {
                    System.out.println("Both Shoe objects are same based on brand and size");
                    return true;
                }
            }
        }
        return false;
    }
}
