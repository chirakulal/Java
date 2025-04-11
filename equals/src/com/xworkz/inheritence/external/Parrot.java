package com.xworkz.inheritence.external;

public class Parrot {
    private String name;
    private String color;
    private boolean canTalk;

    public Parrot(String name, String color, boolean canTalk) {
        this.name = name;
        this.color = color;
        this.canTalk = canTalk;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", color='" + color + '\'' +
                        ", canTalk=" + canTalk;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 16;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Parrot) {
                Parrot p1 = this;
                Parrot p2 = (Parrot) obj;
                if (p1.name.equals(p2.name) &&
                        p1.color.equals(p2.color) &&
                        p1.canTalk == p2.canTalk) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
