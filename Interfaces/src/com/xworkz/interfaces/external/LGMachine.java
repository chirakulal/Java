package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.WashingMachine;

public class LGMachine implements WashingMachine {

    @Override
    public void dry() {
        System.out.println("Running dry in LGMachine");
    }

    @Override
    public void rinse() {
        System.out.println("Running rinse in LGMachine");

    }

    @Override
    public void wash() {
        System.out.println("Running wash in LGMachine");
    }
}
