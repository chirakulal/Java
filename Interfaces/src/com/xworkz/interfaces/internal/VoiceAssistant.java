package com.xworkz.interfaces.internal;

public interface VoiceAssistant {

    void listenCommand();
    void executeTask();
    void giveResponse();
    default void askQuestions(){
        System.out.println("Running ackQuestions in Voiceassistant");
    }
}
