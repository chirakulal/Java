package com.xworkz.inheritence.external;

public class Antibiotic {

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
                        ", isPrescriptionRequired=" + isPrescriptionRequired;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 24;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Antibiotic) {
                Antibiotic antibiotic = this;
                Antibiotic antibiotic1 = (Antibiotic) obj;
                if (antibiotic.name.equals(antibiotic1.name) &&
                        antibiotic.dosageMg == antibiotic1.dosageMg &&
                        antibiotic.isPrescriptionRequired == antibiotic1.isPrescriptionRequired) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
