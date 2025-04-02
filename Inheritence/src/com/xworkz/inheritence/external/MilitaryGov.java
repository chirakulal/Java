package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Government;

public class MilitaryGov extends Government {

    public MilitaryGov(){
        super();
        System.out.println("no -arg const running in MilitaryGov");
    }
    public void militaryLaw(){
        System.out.println("Running militaryLaw in MilitaryGov");
    }

}
