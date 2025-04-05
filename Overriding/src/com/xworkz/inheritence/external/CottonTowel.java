package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Towel;

public class CottonTowel extends Towel {
    public CottonTowel(){
        super();
        System.out.println("No-arg Constructor running in Towel");
    }
    @Override
    public void absorb() {
        System.out.println("Running absorb in CottonTowel");
    }
    @Override
    public void dry() {
        System.out.println("Running dry in CottonTowel");
    }
    @Override
    public void wash() {
        System.out.println("Running wash in CottonTowel");
    }
    @Override
    public void fold() {
        System.out.println("Running fold in CottonTowel");
    }
    @Override
    public void hang() {
        System.out.println("Running hang in CottonTowel");
    }
}
