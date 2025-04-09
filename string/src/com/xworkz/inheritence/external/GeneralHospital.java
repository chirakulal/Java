package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Hospital;

public class GeneralHospital extends Hospital {
    private String patentName;
    private String disease;
    private int age;

    public GeneralHospital(String patentName,String disease,int age){
       super();
       this.patentName=patentName;
       this.age=age;
       this.disease=disease;
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

    @Override
    public String toString() {
        return "patientName :"+patentName + ", Disease : "+disease+ ", Age : "+age;
    }
}
