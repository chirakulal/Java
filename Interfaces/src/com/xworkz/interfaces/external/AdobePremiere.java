package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.VideoEditing;

public class AdobePremiere implements VideoEditing {

    @Override
    public void cutClip() {
        System.out.println("Running cutClip in AdobePremiere");
    }

    @Override
    public void addTransition() {
        System.out.println("Running addTransition in AdobePremiere");
    }

    @Override
    public void exportVideo() {
        System.out.println("Running exportVideo in AdobePremiere");
    }
}
