package com.xworkz.casting.internal;

public class ArmyVehicle {

    //rubber,tyre,mrfTyre: check the type of ref
    public void wheel(Rubber rubber)
    {
        rubber.expand();//rubber or tyre or mrfTyre
//ref instanceof DataType
        if(rubber instanceof Tyre)//false
        {
            System.out.println("rubber is Tyre");
//casting : Converting parent data type--> to sub class datatye
            Tyre tyre =(Tyre)rubber;
            tyre.compress();

        }
        if(rubber instanceof MRFTyre)
        {
            System.out.println("rubber is MRFTyre");

            MRFTyre mrfTyre=(MRFTyre)rubber;
            mrfTyre.compress();
            mrfTyre.radial();
        }
    }

}
