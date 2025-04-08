package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Hammer;
import com.xworkz.inheritence.internal.Tool;

public class Axe {

    public void cut(Tool tool){
        tool.use();
        tool.storeSafely();
        tool.repair();
        tool.maintain();
        tool.use();

        if(tool instanceof Hammer){
            Hammer hammer = (Hammer) tool;
            hammer.bendNail();
        }

    }
}
