package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Calculator;

public class ScientificCalculator implements Calculator {

    @Override
    public void add() {
        System.out.println("Running add in ScientificCalculator");
    }

    @Override
    public void multiply() {
        System.out.println("Running multiply in ScientificCalculator");

    }

    @Override
    public void subtract() {
        System.out.println("Running subtract in ScientificCalculator");

    }
}
