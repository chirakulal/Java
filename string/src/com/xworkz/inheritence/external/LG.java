package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Television;

public class LG extends Television {
    private String productType;
    private String modelNumber;
    private int warrantyYears;


    public LG(String productType, String modelNumber, int warrantyYears) {
        this.productType = productType;
        this.modelNumber = modelNumber;
        this.warrantyYears = warrantyYears;
    }
    @Override
    public void powerOn() {
        System.out.println("Running powerOn in LG");
    }
    @Override
    public void changeChannel() {
        System.out.println("Running changeChannel in LG");
    }
    @Override
    public void adjustVolume() {
        System.out.println("Running adjustVolume in LG");
    }
    @Override
    public void showGuide() {
        System.out.println("Running showGuide in LG");
    }
    @Override
    public void connectHdmi() {
        System.out.println("Running connectHdmi in LG");
    }

    @Override
    public String toString() {
        return
                "productType='" + productType + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", warrantyYears=" + warrantyYears ;
    }
}
