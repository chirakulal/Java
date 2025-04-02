package com.xworkz.inheritence;

import com.xworkz.inheritence.external.*;
import com.xworkz.inheritence.internal.*;

public class MainRunner {

    public static void main(String[] args) {

        Government government = new Government();
        government.makeLaws();
        government.collectTaxes();
        government.enforceLaws();
        government.conductElections();
        government.provideService();

        Government government1 = new Democracy();
        government1.provideService();
        government1.conductElections();
        government1.enforceLaws();
        government1.collectTaxes();
        government1.makeLaws();

        Democracy democracy = new Democracy();
        democracy.makeLaws();
        democracy.collectTaxes();
        democracy.conductElections();
        democracy.enforceLaws();
        democracy.provideService();
        democracy.holdElection();

        System.out.println("-----------------------------------------------------");


        Government government2 = new Government();
        government2.makeLaws();
        government2.collectTaxes();
        government2.enforceLaws();
        government2.conductElections();
        government2.provideService();

        Government government3 = new MilitaryGov();
        government3.makeLaws();
        government3.collectTaxes();
        government3.enforceLaws();
        government3.provideService();
        government3.conductElections();


        MilitaryGov militaryGov = new MilitaryGov();
        militaryGov.enforceLaws();
        militaryGov.makeLaws();
        militaryGov.collectTaxes();
        militaryGov.provideService();
        militaryGov.conductElections();
        militaryGov.militaryLaw();


        System.out.println("-----------------------------------------------------");

        Species species = new Species();
        species.alive();
        species.attack();
        species.defend();
        species.move();
        species.speak();

        Species species1 = new Wizard();
        species1.speak();
        species1.move();
        species1.defend();
        species1.attack();
        species1.alive();

        Wizard wizard = new Wizard();
        wizard.alive();
        wizard.attack();
        wizard.move();
        wizard.speak();
        wizard.defend();
        wizard.castSpell();

        System.out.println("---------------------------------------------");

        Species species2 = new Species();
        species2.alive();
        species2.attack();
        species2.defend();
        species2.move();
        species2.speak();

        Species species3 = new Elf();
        species3.speak();
        species2.move();
        species2.defend();
        species2.attack();
        species2.alive();

        Elf elf = new Elf();
        elf.fly();
        elf.alive();
        elf.defend();
        elf.speak();
        elf.attack();
        elf.move();

        System.out.println("----------------------------------------");


        Vehicle vehicle = new Vehicle();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.speed();
        vehicle.start();
        vehicle.stop();

        Vehicle vehicle1 = new Truck();
        vehicle1.stop();
        vehicle1.start();
        vehicle1.brake();
        vehicle1.accelerate();
        vehicle1.speed();

        Truck truck = new Truck();
        truck.Wheel();
        truck.brake();
        truck.accelerate();
        truck.speed();
        truck.start();
        truck.stop();

        System.out.println("-----------------------------------------------------------");


        Vehicle vehicle2 = new Vehicle();
        vehicle2.speed();
        vehicle2.accelerate();
        vehicle2.stop();
        vehicle2.start();
        vehicle2.brake();

        Vehicle vehicle3 = new Ship();
        vehicle3.brake();
        vehicle3.stop();
        vehicle3.start();
        vehicle3.speed();
        vehicle3.accelerate();

        Ship ship = new Ship();
        ship.fishing();
        ship.brake();
        ship.accelerate();
        ship.speed();
        ship.stop();
        ship.start();

        System.out.println("-----------------------------------------------------------------");


        Hospital hospital = new Hospital();
        hospital.admitPatient();
        hospital.Ambulance();
        hospital.discharge();
        hospital.treat();
        hospital.MedicalCheckup();

        Hospital hospital1 = new GeneralHospital();
        hospital1.MedicalCheckup();
        hospital1.treat();
        hospital1.discharge();
        hospital1.Ambulance();
        hospital1.admitPatient();

        GeneralHospital generalHospital = new GeneralHospital();
        generalHospital.Emergency();
        generalHospital.admitPatient();
        generalHospital.discharge();
        generalHospital.treat();
        generalHospital.Ambulance();
        generalHospital.MedicalCheckup();


        Hospital hospital2 = new Hospital();
        hospital2.admitPatient();
        hospital2.Ambulance();
        hospital2.discharge();
        hospital2.treat();
        hospital2.MedicalCheckup();

        Hospital hospital3 = new VeterinaryHospital();
        hospital3.MedicalCheckup();
        hospital3.treat();
        hospital3.discharge();
        hospital3.Ambulance();
        hospital3.admitPatient();


        VeterinaryHospital veterinaryHospital = new VeterinaryHospital();
        veterinaryHospital.animalcare();
        veterinaryHospital.admitPatient();
        veterinaryHospital.Ambulance();
        veterinaryHospital.discharge();
        veterinaryHospital.MedicalCheckup();
        veterinaryHospital.treat();

        System.out.println("-------------------------------------------------------------");

        Vegetable vegetable = new Vegetable();
        vegetable.grow();
        vegetable.harvest();
        vegetable.nutrients();
        vegetable.pesticide();
        vegetable.water();

        Vegetable vegetable1 = new LeafVeg();
        vegetable1.grow();
        vegetable1.harvest();
        vegetable1.nutrients();
        vegetable1.pesticide();
        vegetable1.water();


        LeafVeg leafVeg = new LeafVeg();
        leafVeg.growAboveGround();
        leafVeg.harvest();
        leafVeg.nutrients();
        leafVeg.water();
        leafVeg.pesticide();
        leafVeg.grow();

        System.out.println("-------------------------------------------------------------");

        Vegetable vegetable2 = new Vegetable();
        vegetable2.grow();
        vegetable2.harvest();
        vegetable2.nutrients();
        vegetable2.pesticide();
        vegetable2.water();

        Vegetable vegetable3 = new RootVeg();
        vegetable3.grow();
        vegetable3.harvest();
        vegetable3.nutrients();
        vegetable3.pesticide();
        vegetable3.water();

        RootVeg rootVeg = new RootVeg();
        rootVeg.growAboveGround();
        rootVeg.harvest();
        rootVeg.nutrients();
        rootVeg.water();
        rootVeg.pesticide();
        rootVeg.grow();

        System.out.println("-------------------------------------------------------------");

        Education education = new Education();
        education.activity();
        education.certificates();
        education.events();
        education.exams();
        education.teach();

        Education education1 = new School();
        education1.activity();
        education1.certificates();
        education1.events();
        education1.exams();
        education1.teach();

        School school = new School();
        school.activity();
        school.certificates();
        school.events();
        school.exams();
        school.teach();


        Education education2 = new Education();
        education2.activity();
        education2.certificates();
        education2.events();
        education2.exams();
        education2.teach();

        Education education3 = new College();
        education3.activity();
        education3.certificates();
        education3.events();
        education3.exams();
        education3.teach();

        College college = new College();
        college.activity();
        college.certificates();
        college.events();
        college.exams();
        college.teach();

        System.out.println("--------------------------------------------------");

        Animal animal = new Animal();
        animal.eat();
        ;
        animal.breathe();
        animal.makesound();
        animal.sleep();
        animal.walk();

        Animal animal1 = new Lion();
        animal1.eat();
        ;
        animal1.breathe();
        animal1.makesound();
        animal1.sleep();
        animal1.walk();

        Lion lion = new Lion();
        lion.breathe();
        ;
        lion.eat();
        lion.sleep();
        lion.walk();
        lion.makesound();

        System.out.println("-------------------------------------------------------");

        Animal animal2 = new Animal();
        animal2.eat();
        ;
        animal2.breathe();
        animal2.makesound();
        animal2.sleep();
        animal2.walk();


        Animal animal3 = new Tiger();
        animal3.eat();
        ;
        animal3.breathe();
        animal3.makesound();
        animal3.sleep();
        animal3.walk();

        Tiger tiger = new Tiger();
        tiger.breathe();
        ;
        tiger.eat();
        tiger.makesound();
        tiger.sleep();
        tiger.walk();

        System.out.println("-------------------------------------------------------------");


        Shape shape = new Shape();
        shape.color();
        shape.draw();
        shape.move();
        shape.resize();
        shape.rotate();

        Shape shape1 = new Circle();
        shape1.color();
        shape1.draw();
        shape1.move();
        shape1.resize();
        shape1.rotate();

        Circle circle = new Circle();
        circle.color();
        circle.draw();
        circle.move();
        circle.resize();
        circle.rotate();

        Shape shape2 = new Shape();
        shape2.color();
        shape2.draw();
        shape2.move();
        shape2.resize();
        shape2.rotate();

        System.out.println("-----------------------------------------------------------------");

        Shape shape3 = new Square();
        shape3.color();
        shape3.draw();
        shape3.move();
        shape3.resize();
        shape3.rotate();

        Square square =new Square();
        square.color();
        square.draw();
        square.move();
        square.resize();
        square.rotate();

        System.out.println("----------------------------------------------------------------");

    }
}
