package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Curtain;

public class HomeCenterCurtain implements Curtain {

    @Override
    public void openCurtain() {
        System.out.println("Running openCurtain in HomeCenterCurtain");
    }

    @Override
    public void closeCurtain() {
        System.out.println("Running closeCurtain in HomeCenterCurtain");
    }

    @Override
    public void cleanCurtain() {
        System.out.println("Running cleanCurtain in HomeCenterCurtain");
    }
}
