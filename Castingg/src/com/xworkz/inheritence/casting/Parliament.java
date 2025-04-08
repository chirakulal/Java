package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Democracy;
import com.xworkz.inheritence.internal.Government;

public class Parliament {

    public void election(Government government){
        government.conductElections();
        government.provideService();
        government.enforceLaws();
        government.collectTaxes();
        government.makeLaws();
        if(government instanceof Democracy){
            Democracy democracy = (Democracy) government;
            democracy.holdElection();
        }

    }
}
