package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Mirror;
import com.xworkz.interfaces.internal.Toothbrush;

public class MorningRoutine implements Toothbrush, Mirror {

    @Override
    public void adjustAngle() {
        System.out.println("Running method in MOrningRoutine");
    }

    @Override
    public void applyToothpaste() {
        System.out.println("Running method in applyToothpaste");
    }

    @Override
    public void brushTeeth() {
        System.out.println("Running method in brushTeeth");
    }

    @Override
    public void cleanMirror() {
        System.out.println("Running method in brushTeeth");
    }

    @Override
    public void rinseMouth() {
        System.out.println("Running method in brushTeeth");
    }

    @Override
    public void lookInto() {
        System.out.println("Running method in lookInto");
    }
}
