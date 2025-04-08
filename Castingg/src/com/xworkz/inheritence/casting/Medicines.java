package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.GeneralHospital;
import com.xworkz.inheritence.internal.Hospital;

public class Medicines {

    public void buy(Hospital hospital){
        hospital.admitPatient();
        hospital.Ambulance();
        hospital.discharge();
        hospital.treat();
        hospital.MedicalCheckup();
        if(hospital instanceof GeneralHospital){
            System.out.println("hospital is reference of GeneralHospital");
            GeneralHospital generalHospital = (GeneralHospital) hospital;
            generalHospital.Emergency();
        }
    }
}
