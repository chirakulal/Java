package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.TeddyBear;
import com.xworkz.inheritence.internal.Toy;

public class Doll {

    public void purchase(Toy toy){
        toy.store();
        toy.throwToy();
        toy.squeeze();
        toy.shake();
        toy.clean();
        if(toy instanceof TeddyBear){
            TeddyBear teddyBear = (TeddyBear) toy;
            teddyBear.order();
        }

    }
}
