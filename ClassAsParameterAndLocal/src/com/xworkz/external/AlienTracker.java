package com.xworkz.external;

import com.xworkz.internal.Alien;

public class AlienTracker {

    public void addAlien(){
        System.out.println("Running addalien in Alien");
        Alien alien = new Alien();
        alien.setSeen("John");
        alien.setSeendate("25march");
        alien.setDescribe("2 leg");

        System.out.println(alien.getSeen());
        System.out.println(alien.getSeendate());
        System.out.println(alien.getDescribe());
    }

    public  void removeAlen(){
        System.out.println("Running removeAlien in Alien");
        Alien alien1 = new Alien();
        alien1.setSeen("John");
        alien1.setSeendate("25march");
        alien1.setDescribe("2 leg");

        Alien alien2 = new Alien();
        alien2.setSeen("dev");
        alien2.setSeendate("25march");
        alien2.setDescribe("2 leg");

        Alien[] aliens ={alien1,alien2};
        for(Alien ref:aliens) {
            System.out.println(ref.getSeen());
            System.out.println(ref.getSeendate());
            System.out.println(ref.getDescribe());
        }
    }
    public void details(Alien alien){
        System.out.println("Running details in Alien");
        if(alien!=null) {
            System.out.println(alien.getSeen());
            System.out.println(alien.getSeendate());
            System.out.println(alien.getDescribe());
        }
    }

    public void attach(Alien[] aliens){
        System.out.println("Running attach in Alien");
        if(aliens!=null){
            for (Alien alien:aliens){
                System.out.println(alien.getSeen());
                System.out.println(alien.getSeendate());
                System.out.println(alien.getDescribe());
            }
        }
    }
}
