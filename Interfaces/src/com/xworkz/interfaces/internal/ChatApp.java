package com.xworkz.interfaces.internal;

public interface ChatApp {

    void startChat();
    void blockUser();
    void deleteChat();

    default void sendChat(){
        System.out.println("Running sendChat in ChatApp");
    }
}
