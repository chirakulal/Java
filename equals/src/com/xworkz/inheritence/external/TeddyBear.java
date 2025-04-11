package com.xworkz.inheritence.external;

public class TeddyBear {
    private String name;
    private String color;
    private String size;

    public TeddyBear(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", color='" + color + '\'' +
                        ", size='" + size + '\'';
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 21;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof TeddyBear) {
                TeddyBear teddybear = this;
                TeddyBear teddybear1 = (TeddyBear) obj;
                if (teddybear.name.equals(teddybear1.name) &&
                        teddybear.color.equals(teddybear1.color) &&
                        teddybear.size.equals(teddybear1.size)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
