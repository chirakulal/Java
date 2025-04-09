package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.House;
import com.xworkz.inheritence.internal.Building;

public class Rent {

    public void sell(Building building){
        building.security();
        building.rooms();
        building.bhk();
        building.floor();
        building.security();
        if(building instanceof House){
            House house = (House) building;
            house.sit();
        }

    }
}
