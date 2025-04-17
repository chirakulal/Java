package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Messaging;

public class WhatsApp implements Messaging {

    @Override
    public void deleteMessage() {
        System.out.println("Running deleteMessage in WhatsApp");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Running reciveMessage in WhatsApp");
    }

    @Override
    public void sendMessage() {
        System.out.println("Running sendMessage in Whatsapp");
    }
}
