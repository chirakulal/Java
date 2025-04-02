package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Hospital;

public class VeterinaryHospital extends Hospital {

    public VeterinaryHospital(){
        System.out.println("no-argu const is running");
    }

    public void animalcare(){
        System.out.println("running animalCare is running");
    }
}
