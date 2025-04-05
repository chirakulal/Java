package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Curtain;

public class WindowCurtain extends Curtain {
    public WindowCurtain(){
        super();
        System.out.println("No-arg Constructor running in WindowCurtain");
    }
    @Override
    public void drawOpen() {
        System.out.println("Running drawOpen in WindowCurtain");
    }
    @Override
    public void close() {
        System.out.println("Running close in WindowCurtain");
    }
    @Override
    public void wash() {
        System.out.println("Running wash in WindowCurtain");
    }
    @Override
    public void iron() {
        System.out.println("Running iron in WindowCurtain");
    }
    @Override
    public void hang() {
        System.out.println("Running hang in WindowCurtain");
    }
}
