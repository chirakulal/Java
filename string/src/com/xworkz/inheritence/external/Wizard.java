package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Species;

public class Wizard extends Species {

    private String name;         // Wizard's name
    private int mana;            // Magic energy or power level
    private String spellType;

    public Wizard(String name, int mana, String spellType){
        super();
        this.name=name;
        this.mana=mana;
        this.spellType=spellType;
    }

    public void castSpell(){
        System.out.println("Running castSpell in Wizard");
    }

    public void alive(){

        System.out.println("Running alive in Wizard");
    }
    public void move()
    {
        System.out.println("Running move in Wizard");
    }
    public void attack(){

        System.out.println("Running attack in Wizard");
    }
    public void defend()
    {
        System.out.println("Running attack in Wizard");
    }
    public void speak()
    {
        System.out.println("Running speak in Wizard");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", mana=" + mana +
                ", spellType='" + spellType ;
    }
}
