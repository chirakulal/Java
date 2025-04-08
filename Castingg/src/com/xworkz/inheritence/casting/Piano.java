package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Guiter;
import com.xworkz.inheritence.internal.Instrument;

public class Piano {

    public void music(Instrument instrument){
        instrument.strings();
        instrument.play();
        instrument.keys();
        instrument.cords();
        if(instrument instanceof Guiter){
            Guiter guiter = (Guiter) instrument;
            guiter.sound();

        }

    }
}
