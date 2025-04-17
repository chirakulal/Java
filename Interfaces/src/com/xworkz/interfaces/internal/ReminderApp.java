package com.xworkz.interfaces.internal;

public interface ReminderApp {

    void setReminder();
    void editReminder();
    void cancelReminder();

    default void deleteReminder(){
        System.out.println("running deleteReminder in ReminderApp");
    }
}
