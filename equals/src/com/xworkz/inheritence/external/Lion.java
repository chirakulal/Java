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

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("ref is not null");
            if(obj instanceof Lion){
                Lion lion = this;
                Lion lion1 = (Lion) obj;
                if(lion1.name.equals(lion.name)&&lion.age==lion1.age&&lion.isWild==lion1.isWild){
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
