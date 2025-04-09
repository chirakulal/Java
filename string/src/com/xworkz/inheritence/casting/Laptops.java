package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Phone;
import com.xworkz.inheritence.internal.Device;

public class Laptops {

    public void use(Device device){
        device.playGames();
        device.call();
        device.message();
        device.videoCall();
        device.track();
        if(device instanceof Phone){
            Phone phone = (Phone) device;
            phone.chat();
        }
    }
}
