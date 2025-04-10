package com.xworkz.inheritence.external;


public class Parrot{
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
        return 16;
    }
}
