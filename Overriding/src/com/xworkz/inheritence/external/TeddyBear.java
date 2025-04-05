package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Toy;

public class TeddyBear extends Toy {
    public TeddyBear(){
        super();
        System.out.println("no-argu const is running in TeddyBear");
    }

    @Override
    public void squeeze(){
        System.out.println("Running squeeze in TeddyBear");
    }
    @Override
    public void throwToy(){
        System.out.println("Running thorwtoy in TeddyBear");
    }
    @Override
    public void clean(){
        System.out.println("Running clean in TeddyBear");
    }
    @Override
    public void store(){
        System.out.println("Running store in TeddyBear");
    }
    @Override
    public void shake(){
        System.out.println("Running shake in TeddyBear");
    }
}
