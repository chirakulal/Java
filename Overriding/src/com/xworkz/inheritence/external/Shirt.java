package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Cloth;
import com.xworkz.inheritence.internal.Shape;

public class Shirt extends Cloth {

    public Shirt(){
        super();
        System.out.println("no-argu const running in Shirt");
    }

    @Override
    public void wear(){
        System.out.println("Running wear in Shirt");
    }
    @Override
    public void tore(){
        System.out.println("Running tore in Shirt");
    }
    @Override
    public void iron(){
        System.out.println("Running iron in Shirt");
    }
    @Override
    public void clean(){
        System.out.println("Running clean in Shirt");
    }
    @Override
    public void stitch(){
        System.out.println("Running stitch in Shirt");
    }
}
