package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Fabric;

public class Bedsheet extends Fabric {

    public Bedsheet(){
        super();
        System.out.println("No-arg Constructor is running in BedSheet");
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

}
