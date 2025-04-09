package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Bird;

public class Parrot extends Bird {
    private String name;
    private String color;
    private boolean canTalk;


    public Parrot(String name, String color, boolean canTalk) {
        this.name = name;
        this.color = color;
        this.canTalk = canTalk;
    }
    public void sing(){
        System.out.println("Running sing in Parrot");
    }
    public void eat(){
        System.out.println("running eat in Parrot");
    }
    public void fly(){
        System.out.println("Running fly in Parrot");
    }
    public void searchFood(){
        System.out.println("Running searchfood in Parrot");
    }
    public void sleep(){
        System.out.println("running sleep in Parrot");
    }
    public void layEgg(){
        System.out.println("Running layEgg in Parrot");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", color='" + color + '\'' +
                        ", canTalk=" + canTalk;
    }
}
