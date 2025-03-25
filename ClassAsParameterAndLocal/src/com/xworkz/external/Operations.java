package com.xworkz.external;

import com.xworkz.internal.Satellite;
import com.xworkz.internal.Type;

public class Operations {

    public void schedule(){
        System.out.println("Running schedule in Operation");
        Satellite satellite = new Satellite();
        satellite.setType(Type.COMMUNICATION);
        satellite.setCost("10M");
        satellite.setWeight(1000);
        satellite.setLoadCapacity(500);

        System.out.println(satellite.getType());
        System.out.println(satellite.getCost());
        System.out.println(satellite.getWeight());
        System.out.println(satellite.getLoadCapacity());
    }

    public void test(){
        System.out.println("Running test in Operation");
        Satellite satellite = new Satellite();
        satellite.setType(Type.EARTH_OBSERVATION);
        satellite.setCost("100M");
        satellite.setWeight(10000);
        satellite.setLoadCapacity(5000);

        Satellite satellite1 = new Satellite();
        satellite1.setType(Type.COMMUNICATION);
        satellite1.setCost("10M");
        satellite1.setWeight(1000);
        satellite1.setLoadCapacity(500);

        Satellite[] satellites = {satellite1,satellite};

        for (Satellite ref: satellites) {
            System.out.println(ref.getType());
            System.out.println(ref.getCost());
            System.out.println(ref.getWeight());
            System.out.println(ref.getLoadCapacity());
        }



    }
    public void improvise(Satellite satellite){

        System.out.println("Running improvise in Operation");
          if(satellite!=null){
              System.out.println(satellite.getType());
              System.out.println(satellite.getCost());
              System.out.println(satellite.getWeight());
              System.out.println(satellite.getLoadCapacity());

          }

    }

    public void operate(Satellite[] satellites){
        System.out.println("Running operate in Operation");
        if(satellites!=null) {

            for (Satellite ref: satellites) {
                System.out.println(ref.getType());
                System.out.println(ref.getCost());
                System.out.println(ref.getWeight());
                System.out.println(ref.getLoadCapacity());
            }

        }

        }
    }

