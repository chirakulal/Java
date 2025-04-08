package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Pizza;
import com.xworkz.inheritence.internal.Food;

public class Burger {

    public void fry(Food food) {
        food.addsalt();
        food.empty();
        food.ingredients();
        food.eat();
        food.addSpinach();
        if(food instanceof Pizza){
            Pizza pizza = new Pizza();
            pizza.bake();
        }

    }
}
