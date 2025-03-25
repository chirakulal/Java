package com.xworkz;

import com.xworkz.external.*;
import com.xworkz.internal.*;

import java.security.AlgorithmConstraints;

public class MainRunner {

    public static void main(String[] args) {
        Jail jail1 = new Jail();
        jail1.setTotalCells(30);
        jail1.setName("Av");
        jail1.setLocation("Mandya");
        jail1.setJailerName("Bhima");

        Jail jail2 = new Jail();
        jail2.setTotalCells(40);
        jail2.setName("Av");
        jail2.setLocation("Kolara");
        jail2.setJailerName("pina");

        Jail[] jails ={jail1,jail2};

        Criminals criminals = new Criminals();
        criminals.Kill(jails);
        criminals.thives(jail1);
        criminals.corruption();
        criminals.murder();


        Satellite satellite1 = new Satellite();
        satellite1.setType(Type.MILITARY);
        satellite1.setCost("30M");
        satellite1.setWeight(5000);
        satellite1.setLoadCapacity(3000);

        Satellite satellite2 = new Satellite();
        satellite2.setType(Type.SCIENTIFIC);
        satellite2.setCost("300M");
        satellite2.setWeight(500000);
        satellite2.setLoadCapacity(300000);

        Satellite[] satellites = {satellite2,satellite1};

        Operations operations = new Operations();
        operations.schedule();
        operations.test();
        operations.operate(satellites);
        operations.improvise(satellite1);


        IdCard idCard = new IdCard();
        idCard.setMaterial("Plastic");
        idCard.setColor(new String[]{"blue","red"});
        idCard.setWeight(3);
        idCard.setDesignedBy("gh");

        IdCard idCard1 = new IdCard();
        idCard1.setMaterial("paper");
        idCard1.setColor(new String[]{"blue","yellow"});
        idCard1.setWeight(5);
        idCard1.setDesignedBy("gh");

        IdCard idCard2 = new IdCard();
        idCard2.setMaterial("Polythin");
        idCard2.setColor(new String[]{"yellow","red"});
        idCard2.setWeight(5);
        idCard2.setDesignedBy("gh");

        IdCard[] idCards ={idCard1,idCard,idCard2};


        Customer customer = new Customer();
        customer.student();
        customer.teacher();
        customer.employee(idCard);
        customer.Lectures(idCards);

        Alien alien = new Alien();
        alien.setDescribe("one hand");
        alien.setSeendate("5march");
        alien.setSeen("Tina");

        Alien alien1 = new Alien();
        alien1.setDescribe("one hand");
        alien1.setSeendate("5march");
        alien1.setSeen("tuna");

        Alien[] aliens ={alien1,alien};
        AlienTracker alienTracker = new AlienTracker();
        alienTracker.addAlien();
        alienTracker.removeAlen();
        alienTracker.attach(aliens);
        alienTracker.details(alien);

        Camera camera = new Camera();
        camera.setBrand("Sony");
        camera.setPrice(459000);
        camera.setType(Type.COMMUNICATION);
        camera.setConnectivity("good");

        Camera camera1 = new Camera();
        camera1.setBrand("Canvac");
        camera1.setPrice(459000);
        camera1.setType(Type.EARTH_OBSERVATION);
        camera1.setConnectivity("good");

        Camera[] cameras = {camera1,camera1};

        Manager manager =new Manager();
        manager.capture();
        manager.delete();
        manager.details(cameras);
        manager.lens(camera);



    }



}
