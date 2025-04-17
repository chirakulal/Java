package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.ReminderApp;

public class Todoist implements ReminderApp {

    @Override
    public void setReminder() {
        System.out.println("Running setReminder in Todoist");
    }

    @Override
    public void editReminder() {
        System.out.println("Running editReminder in Todoist");
    }

    @Override
    public void cancelReminder() {
        System.out.println("Running cancelReminder in Todoist");
    }

    @Override
    public void deleteReminder() {
        System.out.println("Running deleteReminder in TOdolist");
    }
}
