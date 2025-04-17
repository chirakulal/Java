package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.ChatApp;

public class Telegram implements ChatApp {

    @Override
    public void startChat() {
        System.out.println("Running startChat in Telegram");
    }

    @Override
    public void blockUser() {
        System.out.println("Running blockUser in Telegram");
    }

    @Override
    public void deleteChat() {
        System.out.println("Running deleteChat in Telegram");
    }

    @Override
    public void sendChat() {
        System.out.println("Running sendChat in Telegram");

    }
}
