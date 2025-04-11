package com.xworkz.inheritence.external;

public class Oil {
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
                        ", isEdible=" + isEdible;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 70;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Oil) {
                Oil oil = (Oil) obj;
                if (this.type.equals(oil.type) &&
                        this.quantity == oil.quantity) {
                    System.out.println("Both Oil objects are same based on type and quantity");
                    return true;
                }
            }
        }
        return false;
    }
}
