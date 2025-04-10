package com.xworkz.inheritence.external;


public class Wizard {

    private String name;         // Wizard's name
    private int mana;            // Magic energy or power level
    private String spellType;

    public Wizard(String name, int mana, String spellType){
        super();
        this.name=name;
        this.mana=mana;
        this.spellType=spellType;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", mana=" + mana +
                ", spellType='" + spellType ;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : "+super.hashCode());
        return 2;
    }
}
