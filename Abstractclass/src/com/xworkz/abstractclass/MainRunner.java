package com.xworkz.abstractclass;

import com.xworkz.abstractclass.external.*;
import javafx.scene.control.Cell;

public class MainRunner {



    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.run();

        MilkyBar milkyBar = new MilkyBar();
        milkyBar.flavor();

        Lux lux= new Lux();
        lux.fragrance();
        lux.ingredients();

        Cello cello = new Cello("steel",500,"grey");
        cello.fill();

        CoconutOil coconutOil = new CoconutOil("Coconut", 500, "Parachute", 150.0);
        coconutOil.displayDetails();




    }
}
