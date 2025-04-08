package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Bottel;
import com.xworkz.inheritence.internal.Container;

public class Box {

    public void open(Container container){
        container.size();
        container.fill();
        container.color();
        container.empty();
        container.capacity();
        if(container instanceof Bottel){
            Bottel bottel = (Bottel) container;
            bottel.buy();

        }

    }
}
