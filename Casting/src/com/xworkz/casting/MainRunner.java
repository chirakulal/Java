package com.xworkz.casting;

import com.xworkz.casting.internal.ArmyVehicle;
import com.xworkz.casting.internal.MRFTyre;
import com.xworkz.casting.internal.Rubber;
import com.xworkz.casting.internal.Tyre;

public class MainRunner {

    public static void main(String[] args) {

        Rubber rubber1 = new Rubber();
        rubber1.expand();
        Rubber rubber = new Tyre();
        rubber.expand();
        rubber.compress;//datatype is rubber - error
        Tyre tyre = new Tyre();
        tyre.expand();
        tyre.compress();
        tyre.expand();




        MRFTyre mrfTyre = new MRFTyre();

        ArmyVehicle armyVehicle = new ArmyVehicle();
        armyVehicle.wheel(rubber);
        armyVehicle.wheel(tyre);
        armyVehicle.wheel(rubber1);
        armyVehicle.wheel(mrfTyre);


    }
}
