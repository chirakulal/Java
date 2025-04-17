package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Bottle;
import com.xworkz.interfaces.internal.NoteTaking;

public class CollegeBag implements NoteTaking, Bottle {

    @Override
    public void washBottle() {
        System.out.println("Running method in CollegeBag");
    }


    @Override
    public void fillWater() {
        System.out.println("Running fillWater in Collegebag");
    }

    @Override
    public void drinkWater() {
        System.out.println("Running drinkWater in CollegeBag");
    }

    @Override
    public void deleteNote() {
        System.out.println("Running deleteNote in CollegeBag");
    }

    @Override
    public void highlightText() {
        System.out.println("Running highlightText in CollegeBag");
    }

    @Override
    public void writeNote() {
        System.out.println("Runninh writeNote in CollegeBag");
    }

}
