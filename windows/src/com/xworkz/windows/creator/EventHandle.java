package com.xworkz.windows.creator;

import java.rmi.NotBoundException;

public class EventHandle {

    public void checkEvent() throws NotBoundException
    {
        if(true){
            System.out.println("Running the event");
            throw new NotBoundException("Stopping the execution");
        }
        System.out.println("Runnnnn");
    }

    public void unchecked(){
        throw new RuntimeException();
    }
}
