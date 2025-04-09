package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Lion;
import com.xworkz.inheritence.internal.Animal;
import com.xworkz.inheritence.internal.Liquid;

public class Carnivores {
    public void attack(Animal animal){
        animal.walk();
        animal.sleep();
        animal.breathe();
        animal.eat();
        animal.makesound();
        if(animal instanceof Lion){
            Lion lion = (Lion) animal;
            lion.roar();
        }
    }
}
