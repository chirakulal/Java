package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.SmartWatches;

public class AppleWatch implements SmartWatches {

    @Override
    public void showTime() {
        System.out.println("Running showTime in AppleWatch");
    }

    @Override
    public void trackSteps() {
        System.out.println("Running trackSteps in AppleWatch");
    }

    @Override
    public void monitorHeartRate() {
        System.out.println("Running monitorHeartRate in AppleWatch");
    }
}
