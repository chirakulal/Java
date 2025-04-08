package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Clock;

public class DigitalClock extends Clock {

    public DigitalClock() {
        super();
        System.out.println("No-arg constructor is running in DigitalClock");
    }
    @Override
    public void showTime() {
        System.out.println("Running showTime in DigitalClock");
    }

    @Override
    public void setAlarm() {
        System.out.println("Running setAlarm in DigitalClock");
    }

    @Override
    public void tick() {
        System.out.println("Running tick in DigitalClock");
    }

    @Override
    public void stopClock() {
        System.out.println("Running stopClock in DigitalClock");
    }

    @Override
    public void resetClock() {
        System.out.println("Running resetClock in DigitalClock");
    }

}
