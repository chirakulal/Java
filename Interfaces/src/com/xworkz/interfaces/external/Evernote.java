package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.NoteTaking;

public class Evernote implements NoteTaking {

    @Override
    public void writeNote() {
        System.out.println("Running writeNote in Evernote");
    }

    @Override
    public void deleteNote() {
        System.out.println("Running deleteNote in Evernote");
    }

    @Override
    public void highlightText() {
        System.out.println("Running highlightText in Evernote");
    }

    @Override
    public void editNoter() {
        System.out.println("Running editNoter in Evernote");
    }
}
