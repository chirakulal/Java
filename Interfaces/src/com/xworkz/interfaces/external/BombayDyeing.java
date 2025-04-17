package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Bedsheet;

public class BombayDyeing implements Bedsheet {


    @Override
    public void spreadSheet() {
        System.out.println("Running spreadSheet in BombayDyeing");
    }

    @Override
    public void foldSheet() {
        System.out.println("Running foldSheet in BombayDyeing");
    }

    @Override
    public void washSheet() {
        System.out.println("Running washSheet in BombayDyeing");
    }
}
