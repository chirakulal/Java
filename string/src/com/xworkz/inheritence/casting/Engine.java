package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Truck;
import com.xworkz.inheritence.internal.Vehicle;

public class Engine {

    public void run(Vehicle vehicle){
        vehicle.accelerate();
        vehicle.speed();
        vehicle.start();
        vehicle.stop();
        vehicle.brake();
        if(vehicle instanceof Truck){
            System.out.println("Truck is vehicle");
            Truck truck=(Truck) vehicle;
            truck.wheel();
        }

    }
}
