package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Diamond;
import com.xworkz.inheritence.internal.Gemstone;

public class Gold {

    public void purchase(Gemstone gemstone){
        gemstone.shine();
        gemstone.sell();
        gemstone.cut();
        gemstone.polish();
        gemstone.embedInJewelry();
        if(gemstone instanceof Diamond){
            Diamond diamond = (Diamond) gemstone;
            diamond.weigh();
        }
    }
}
