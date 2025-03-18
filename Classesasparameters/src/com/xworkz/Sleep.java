package com.xworkz;

public class Sleep {

    public  void relax(Pillow pillow){
        System.out.println("Sleep is running");
        if(pillow!=null){
            pillow.support();
        }
        else {
            System.out.println("Reference is pointing to null");
        }
    }
}
