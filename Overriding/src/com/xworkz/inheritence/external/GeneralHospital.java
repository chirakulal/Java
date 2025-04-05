package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Hospital;

public class GeneralHospital extends Hospital {

    public GeneralHospital(){
        System.out.println("no - argu const running");
    }
    public void Emergency(){
        System.out.println("Running emergency in GeneralHospital");
    }

    public void admitPatient()
    {
        System.out.println("Running admitPatient in GeneralHospital");
    }
    public void treat() {
        System.out.println("Running treat in GeneralHospital");
    }
    public void discharge()
    {
        System.out.println("Running discharge in GeneralHospital");
    }
    public void Ambulance()
    {
        System.out.println("Running Ambulance in GeneralHospital");
    }
    public void MedicalCheckup(){
        System.out.println("Running MedicalCheckup in GeneralHospital");
    }

}
