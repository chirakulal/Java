package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Government;

public class Democracy extends Government {

    public Democracy(){
        super();
        System.out.println("no-argu const running in democracy");
    }
    public void holdElection(){
        System.out.println("running holdElection  in democracy ");
    }
}
