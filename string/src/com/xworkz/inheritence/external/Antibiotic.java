package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Medicine;

public class Antibiotic extends Medicine {

    private String name;
    private int dosageMg;
    private boolean isPrescriptionRequired;

    public Antibiotic(String name, int dosageMg, boolean isPrescriptionRequired) {
        this.name = name;
        this.dosageMg = dosageMg;
        this.isPrescriptionRequired = isPrescriptionRequired;
    }

    @Override
    public void checkExpiry(){
        System.out.println("Running method in Antibiotic");
    }

    @Override
    public void storeProperly(){
        System.out.println("Running method in Antibiotic");
    }

    @Override
    public void  measureDosage(){
        System.out.println("Running method in Antibiotic");
    }
    @Override
    public void  prescribe(){
        System.out.println("Running method in Antibiotic");
    }
    @Override
    public void consume(){
        System.out.println("Running method in Antibiotic");
    }
    public void mix(){
        System.out.println("Running method in Antibiotic");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", dosageMg=" + dosageMg +
                ", isPrescriptionRequired=" + isPrescriptionRequired ;
    }
}
