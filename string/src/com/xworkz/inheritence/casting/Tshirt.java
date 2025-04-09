package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Shirt;
import com.xworkz.inheritence.internal.Cloth;

public class Tshirt {

    public void dry(Cloth cloth){
        cloth.wear();
        cloth.tore();
        cloth.stitch();
        cloth.iron();
        cloth.clean();
        if(cloth instanceof Shirt){
            Shirt shirt = (Shirt) cloth;
            shirt.style();
        }

    }
}
