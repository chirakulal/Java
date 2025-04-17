package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Mirror;

public class SaintGobain implements Mirror {


    @Override
    public void lookInto() {
        System.out.println("Running lookInto in SaintGobain");
    }

    @Override
    public void cleanMirror() {
        System.out.println("Running cleanMirror in SaintGobain");
    }

    @Override
    public void adjustAngle() {
        System.out.println("Running adjustAngle in SaintGobain");
    }
}
