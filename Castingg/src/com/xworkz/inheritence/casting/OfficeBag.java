package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.SchoolBag;
import com.xworkz.inheritence.internal.Bag;

public class OfficeBag {

    public void buy(Bag bag){

        bag.closeZip();
        bag.size();
        bag.openZip();
        bag.keepThings();
        bag.toStore();
        if(bag instanceof SchoolBag){
            SchoolBag schoolBag = (SchoolBag) bag;
            schoolBag.order();
        }

    }
}
