package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.HardDisk;
import com.xworkz.inheritence.internal.StorageDevice;

public class CD {

    public void read(StorageDevice storageDevice){
        storageDevice.writeData();
        storageDevice.readData();
        storageDevice.format();
        storageDevice.eject();
        storageDevice.checkHealth();
        if(storageDevice instanceof HardDisk){
            HardDisk hardDisk=(HardDisk) storageDevice;
            hardDisk.delete();
        }
    }
}
