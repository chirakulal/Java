package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Coffee;
import com.xworkz.inheritence.internal.Beverage;

public class Tea {

    public void addLeaves(Beverage beverage){
        beverage.prepare();
        beverage.serve();
        beverage.checkTemperature();
        beverage.drink();
        beverage.addSugar();
        if(beverage instanceof Coffee){
            Coffee coffee = (Coffee) beverage;
            coffee.addCoffee();
        }
    }
}
