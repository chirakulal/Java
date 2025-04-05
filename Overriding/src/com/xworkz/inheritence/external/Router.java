package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.NetworkDevice;

public class Router extends NetworkDevice {

    public Router(){
        super();
        System.out.println("no-argu const is running in Router");
    }
    @Override
    public  void connect(){
        System.out.println("Running connect in Router");
    }
    @Override
    public  void disconnect(){
        System.out.println("Running disconnect in Router");
    }
    @Override
    public  void transmitData(){
        System.out.println("Running transmitdata in Router");
    }
    @Override
    public  void receiveData(){
        System.out.println("Running recievedata in Router");
    }
    @Override
    public  void reboot(){
        System.out.println("Running reboot in Router");
    }
}
