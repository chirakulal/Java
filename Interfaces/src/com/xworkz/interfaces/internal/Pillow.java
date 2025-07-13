package com.xworkz.interfaces.internal;

public interface Pillow {

    void fluffPillow();
    void coverPillow();
    void washPillow();

    default void HelpsTosleep(){
        System.out.println("Running HelpsTosleep in Pillow");
    }

}
