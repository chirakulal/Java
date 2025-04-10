package com.xworkz.inheritence.external;

public class Antibiotic  {

    private String name;
    private int dosageMg;
    private boolean isPrescriptionRequired;

    public Antibiotic(String name, int dosageMg, boolean isPrescriptionRequired) {
        this.name = name;
        this.dosageMg = dosageMg;
        this.isPrescriptionRequired = isPrescriptionRequired;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", dosageMg=" + dosageMg +
                ", isPrescriptionRequired=" + isPrescriptionRequired ;
    }

    @Override
    public int hashCode() {
        return 24;
    }
}
