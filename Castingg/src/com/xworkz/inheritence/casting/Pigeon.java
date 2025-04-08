package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Parrot;
import com.xworkz.inheritence.internal.Bird;

public class Pigeon {

    public void passMsg(Bird bird){
        bird.eat();
        bird.sing();
        bird.fly();
        bird.searchFood();
        bird.sleep();
        if(bird instanceof Parrot){
            Parrot parrot = new Parrot();
            parrot.layEgg();
        }

    }
}
