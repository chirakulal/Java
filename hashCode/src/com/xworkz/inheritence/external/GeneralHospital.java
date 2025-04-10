package com.xworkz.inheritence.external;


public class GeneralHospital  {
    private String patentName;
    private String disease;
    private int age;

    public GeneralHospital(String patentName,String disease,int age){
       super();
       this.patentName=patentName;
       this.age=age;
       this.disease=disease;
    }

    @Override
    public String toString() {
        return "patientName :"+patentName + ", Disease : "+disease+ ", Age : "+age;
    }

    @Override
    public int hashCode() {
        System.out.println("Parents : "+super.hashCode());
        return 4;
    }
}
