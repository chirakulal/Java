package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Laptop;
import com.xworkz.inheritence.internal.Computer;

public class Desktop {
    public void stand(Computer computer){
        computer.updateSoftware();
        computer.shutDown();
        computer.processTask();
        computer.connectToInternet();
        computer.bootUp();
        if(computer instanceof Laptop){
            Laptop laptop = (Laptop) computer;
            laptop.charge();
        }
    }
}
