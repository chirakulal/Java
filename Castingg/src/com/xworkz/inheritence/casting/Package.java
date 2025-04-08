package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Router;
import com.xworkz.inheritence.internal.NetworkDevice;

public class Package {

    public void data(NetworkDevice networkDevice){
        networkDevice.reboot();
        networkDevice.transmitData();
        networkDevice.receiveData();
        networkDevice.disconnect();
        networkDevice.connect();
        if(networkDevice instanceof Router){
            Router router= (Router) networkDevice;
            router.traffic();
        }

    }
}
