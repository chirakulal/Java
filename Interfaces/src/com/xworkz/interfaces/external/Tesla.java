package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.CarControl;

public class Tesla implements CarControl {

    @Override
    public void startEngine() {
        System.out.println("Running startEngine in Tesla");
    }

    @Override
    public void drive() {
        System.out.println("Running drive in Tesla");
    }

    @Override
    public void stopCar() {
        System.out.println("Running stopCar in Tesla");
    }
}
