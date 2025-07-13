package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.VoiceAssistant;

public class Siri implements VoiceAssistant {

    @Override
    public void listenCommand() {
        System.out.println("Running listenCommand in Siri");
    }

    @Override
    public void executeTask() {
        System.out.println("Running executeTask in Siri");
    }

    @Override
    public void giveResponse() {
        System.out.println("Running giveResponse in Siri");
    }

    @Override
    public void askQuestions() {
        System.out.println("Running ackQuestions in Voiceassistant");

    }
}
