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

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("ref is not null");
            if(obj instanceof GeneralHospital){
                GeneralHospital generalHospital = this;
                GeneralHospital generalHospital1 = (GeneralHospital)obj;
                if(generalHospital.patentName.equals(generalHospital1.patentName)&&generalHospital.disease.equals(generalHospital1.disease)&&generalHospital.age==generalHospital1.age){
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
