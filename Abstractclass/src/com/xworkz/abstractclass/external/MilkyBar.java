package com.xworkz.abstractclass.external;

import com.xworkz.abstractclass.internal.Chocolate;

public class MilkyBar extends Chocolate {

    @Override
    public void flavor(){
        System.out.println("Running flavour in MilkyBar");
    }
}
