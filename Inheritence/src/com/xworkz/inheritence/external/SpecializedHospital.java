package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Hospital;
import com.xworkz.inheritence.internal.Species;

public class SpecializedHospital extends Hospital {

    public SpecializedHospital(){
        super();
        System.out.println("no-argu const is running in SpecializedHospital");
    }
}
