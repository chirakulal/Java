package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Magazine;
import com.xworkz.inheritence.internal.Newspaper;

public class Article {

    public void edit(Newspaper newspaper){
        newspaper.updateDaily();
        newspaper.provideInformation();
        newspaper.printNews();
        newspaper.advertise();
        newspaper.distribute();
        if(newspaper instanceof Magazine){
            Magazine magazine = new Magazine();
            magazine.read();
        }
    }
}
