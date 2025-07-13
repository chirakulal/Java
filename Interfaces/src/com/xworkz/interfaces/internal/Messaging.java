package com.xworkz.interfaces.internal;

public interface Messaging {

    void sendMessage();
    void receiveMessage();
    void deleteMessage();

    default  void draft(){
        System.out.println("Running draft in Messaging");
    }

}
