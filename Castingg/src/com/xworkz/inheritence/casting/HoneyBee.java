package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Butterfly;
import com.xworkz.inheritence.internal.Insect;

public class HoneyBee {

    public void formBee(Insect insect){
        insect.undergoMetamorphosis();
        insect.fly();
        insect.feed();
        insect.crawl();
        insect.reproduce();
        if(insect instanceof Butterfly){
            Butterfly butterfly = (Butterfly) insect;
            butterfly.suckNectar();
        }

    }
}
