package com.xworkz.interfaces.internal;

public interface Alarm {

    void setAlarm();
    void stopAlarm();
    void snooze();

    default void timer(){
        System.out.println("Running timer in Alarm");
    }

}
