package com.xworkz.reference;

public class MainRunner {

    public static void main(String[] args) {



        Lens lens = new Lens("30mm","5X");

        Projector projector = new Projector(lens);
        projector.present();
    }
}
