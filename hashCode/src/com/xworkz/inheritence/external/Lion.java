package com.xworkz.inheritence.external;


public class Lion {
    private String name;
    private int age;
    private boolean isWild;


    public Lion(String name, int age, boolean isWild) {
        this.name = name;
        this.age = age;
        this.isWild = isWild;
    }


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", isWild=" + isWild ;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : "+ super.hashCode());
        return 6;
    }
}
