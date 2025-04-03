package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Government;

public class LocalGovernment extends Government {

    public LocalGovernment(){
        super();
        System.out.println("no-argu const is running in LocalGovernment");
    }
}
