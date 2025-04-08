package com.xworkz.inheritence.internal;

public class NetworkDevice {

    public NetworkDevice(){
        System.out.println("no-argu const is running in NetworkDevice");
    }
    public  void connect(){
        System.out.println("Running connect in NetworkDevice");
    }
    public  void disconnect(){
        System.out.println("Running disconnect in NetworkDevice");
    }
    public  void transmitData(){
        System.out.println("Running transmitdata in NetworkDevice");
    }public  void receiveData(){
        System.out.println("Running recievedata in NetworkDevice");
    }
    public  void reboot(){
        System.out.println("Running reboot in NetworkDevice");
    }

}
