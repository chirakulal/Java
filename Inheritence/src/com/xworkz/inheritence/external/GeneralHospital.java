package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Hospital;

public class GeneralHospital extends Hospital {

    public GeneralHospital(){
        System.out.println("no - argu const running");
    }
    public void Emergency(){
        System.out.println("Running emergency in GeneralHospital");
    }


}
