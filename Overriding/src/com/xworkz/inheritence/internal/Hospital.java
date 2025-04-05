package com.xworkz.inheritence.internal;

public class Hospital {

    public Hospital() {
        System.out.println("no-arg const is running");
    }

   public void admitPatient()
    {
        System.out.println("Running admitPatient in Hospital");
    }
    public void treat() {
        System.out.println("Running treat in Hospital");
    }
    public void discharge()
    {
        System.out.println("Running discharge in Hospital");
    }
   public void Ambulance()
   {
        System.out.println("Running Ambulance in Hospital");
    }
    public void MedicalCheckup(){
        System.out.println("Running MedicalCheckup in Hospital");
    }

}

