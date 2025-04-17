package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Alarm;

public class DigitalAlarm implements Alarm {

    @Override
    public void setAlarm() {
        System.out.println("Running setAlarm in DigitalAlarm");
    }

    @Override
    public void snooze() {
        System.out.println("Running snooze in DigitalAlarm");
    }

    @Override
    public void stopAlarm() {
        System.out.println("Running topAlarm in DigitalAlarm");
    }

    @Override
    public void timer() {
        System.out.println("Running timer in Alarm");

    }
}
