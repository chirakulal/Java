package com.xworkz.windows.creator;

import java.rmi.NotBoundException;

public class Runner {

    public static void main(String[] args) throws NotBoundException {

        EventHandle eventHandle = new EventHandle();
        eventHandle.checkEvent();
        eventHandle.unchecked();
    }
}
