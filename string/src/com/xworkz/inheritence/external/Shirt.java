package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Cloth;
import com.xworkz.inheritence.internal.Shape;

public class Shirt extends Cloth {

    private String size;
    private String color;
    private boolean isFullSleeve;


    public Shirt(String size, String color, boolean isFullSleeve) {
        this.size = size;
        this.color = color;
        this.isFullSleeve = isFullSleeve;
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
    public void style(){
        System.out.println("RUNning style in Shirt");
    }

    @Override
    public String toString() {
        return
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", isFullSleeve=" + isFullSleeve ;
    }
}
