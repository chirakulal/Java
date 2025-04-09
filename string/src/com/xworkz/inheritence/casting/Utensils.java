package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.CoffeeMug;
import com.xworkz.inheritence.internal.Mug;

public class Utensils {

    public void wash(Mug mug){
        mug.clean();
        mug.sip();
        mug.refill();
        mug.pour();
        mug.heat();
        if(mug instanceof CoffeeMug){
            CoffeeMug coffeeMug = (CoffeeMug) mug;
            coffeeMug.taste();
        }
    }
}
