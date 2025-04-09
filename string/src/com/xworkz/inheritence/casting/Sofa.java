package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Chair;
import com.xworkz.inheritence.internal.Furniture;

public class Sofa {

    public void order(Furniture furniture){
        furniture.showcase();
        furniture.design();
        furniture.tostore();
        furniture.sit();
        furniture.sleep();
        if(furniture instanceof Chair){
            Chair chair = (Chair) furniture;
            chair.buy();
        }
    }
}
