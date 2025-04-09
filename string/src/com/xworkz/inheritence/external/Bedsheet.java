package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Fabric;

public class Bedsheet extends Fabric {

    private String material;
    private String size;
    private boolean isPrinted;


    public Bedsheet(String material, String size, boolean isPrinted) {
        this.material = material;
        this.size = size;
        this.isPrinted = isPrinted;
    }
    @Override
    public void weave() {
        System.out.println("Running weave in Bedsheet");
    }

    @Override
    public void dye() {
        System.out.println("Running dye in Bedsheet");
    }

    @Override
    public void fold() {
        System.out.println("Running fold in Bedsheet");
    }

    @Override
    public void wash() {
        System.out.println("Running wash in Bedsheet");
    }

    @Override
    public void dry() {
        System.out.println("Running dry in Bedsheet");
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", isPrinted=" + isPrinted ;
    }
}
