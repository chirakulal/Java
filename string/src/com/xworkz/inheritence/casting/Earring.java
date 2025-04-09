package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Necklace;
import com.xworkz.inheritence.internal.Jewel;

public class Earring {

    public void buy(Jewel jewel){
        jewel.store();
        jewel.polish();
        jewel.wear();
        jewel.shine();
        jewel.sell();
        if(jewel instanceof Necklace){
            Necklace necklace = (Necklace) jewel;
            necklace.order();
        }
    }
}
