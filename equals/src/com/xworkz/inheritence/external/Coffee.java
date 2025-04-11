package com.xworkz.inheritence.external;

public class Coffee {

    private String type;
    private String size;
    private boolean hasSugar;

    public Coffee(String type, String size, boolean hasSugar) {
        this.type = type;
        this.size = size;
        this.hasSugar = hasSugar;
    }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                        ", size='" + size + '\'' +
                        ", hasSugar=" + hasSugar;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 36;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Coffee) {
                Coffee coffee = this;
                Coffee coffee1 = (Coffee) obj;
                if (coffee.type.equals(coffee1.type)
                        && coffee.size.equals(coffee1.size)
                        && coffee.hasSugar == coffee1.hasSugar) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
