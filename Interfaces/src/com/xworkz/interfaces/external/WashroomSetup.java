package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Mirror;
import com.xworkz.interfaces.internal.Mug;

public class WashroomSetup implements Mirror, Mug {

    @Override
    public void fillMug() {
        System.out.println("Running method in WashroomSetup");
    }

    @Override
    public void emptyMug() {
        System.out.println("Running method in WashroomSetup");

    }

    @Override
    public void cleanMug() {
        System.out.println("Running method in WashroomSetup");

    }

    @Override
    public void lookInto() {
        System.out.println("Running method in WashroomSetup");

    }

    @Override
    public void cleanMirror() {
        System.out.println("Running method in WashroomSetup");

    }

    @Override
    public void adjustAngle() {
        System.out.println("Running method in WashroomSetup");

    }

}
