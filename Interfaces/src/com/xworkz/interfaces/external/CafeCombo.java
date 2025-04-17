package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Coffee;
import com.xworkz.interfaces.internal.Mug;

public class CafeCombo implements Mug, Coffee {

    @Override
    public void addSugar() {
        System.out.println("Running addSugar in CafeCombo");
    }

    @Override
    public void brewCoffee() {
        System.out.println("Running method in CafeCombo");
    }

    @Override
    public void cleanMug() {
        System.out.println("Running method in CafeCombo");

    }

    @Override
    public void emptyMug() {
        System.out.println("Running method in CafeCombo");

    }

    @Override
    public void fillMug() {
        System.out.println("Running method in CafeCombo");

    }

    @Override
    public void serveCoffee() {
        System.out.println("Running method in CafeCombo");

    }
}
