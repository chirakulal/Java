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

        System.out.println("--------------------------------------------------------------------------------------");

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

        System.out.println("--------------------------------------------------------------------------");

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
        animal.breathe();
        animal.makesound();
        animal.sleep();
        animal.walk();

        Animal animal1 = new Lion();
        animal1.eat();
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
        animal2.breathe();
        animal2.makesound();
        animal2.sleep();
        animal2.walk();


        Animal animal3 = new Tiger();
        animal3.eat();
        animal3.breathe();
        animal3.makesound();
        animal3.sleep();
        animal3.walk();

        Tiger tiger = new Tiger();
        tiger.breathe();
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


        System.out.println("-----------------------------------------------------------------");


        Shape shape2 = new Shape();
        shape2.color();
        shape2.draw();
        shape2.move();
        shape2.resize();
        shape2.rotate();

        Shape shape3 = new Square();
        shape3.color();
        shape3.draw();
        shape3.move();
        shape3.resize();
        shape3.rotate();

        Square square = new Square();
        square.color();
        square.draw();
        square.move();
        square.resize();
        square.rotate();

        System.out.println("----------------------------------------------------------------");


        Animal animal4 = new Animal();
        animal4.walk();
        animal4.breathe();
        animal4.walk();
        animal4.sleep();
        animal4.eat();
        animal4.makesound();

        Animal animal5 = new Cat();
        animal5.makesound();
        animal5.eat();
        animal5.breathe();
        animal5.sleep();
        animal5.walk();

        Cat cat = new Cat();
        cat.breathe();
        cat.eat();
        cat.walk();
        cat.sleep();
        cat.makesound();

        System.out.println("-----------------------------------------------------------------------");

        Shape shape4 = new Shape();
        shape4.color();
        shape4.draw();
        shape4.move();
        shape4.resize();
        shape4.rotate();

        Shape shape5 = new Rectangle();
        shape5.color();
        shape5.draw();
        shape5.move();
        shape5.resize();
        shape5.rotate();

        Rectangle rectangle = new Rectangle();
        rectangle.color();
        rectangle.move();
        rectangle.draw();
        rectangle.resize();
        rectangle.rotate();


        System.out.println("--------------------------------------------------------------------");

        Hospital hospital4 = new Hospital();
        hospital4.admitPatient();
        hospital4.Ambulance();
        hospital4.discharge();
        hospital4.treat();
        hospital4.MedicalCheckup();

        Hospital hospital5 = new MentalHospital();
        hospital5.MedicalCheckup();
        hospital5.treat();
        hospital5.discharge();
        hospital5.Ambulance();
        hospital5.admitPatient();

        MentalHospital mentalHospital = new MentalHospital();
        mentalHospital.admitPatient();
        mentalHospital.MedicalCheckup();
        mentalHospital.Ambulance();
        mentalHospital.treat();
        mentalHospital.discharge();

        System.out.println("----------------------------------------------------------");

        Vehicle vehicle4 = new Vehicle();
        vehicle4.speed();
        vehicle4.accelerate();
        vehicle4.stop();
        vehicle4.start();
        vehicle4.brake();

        Vehicle vehicle5 = new Jeep();
        vehicle5.brake();
        vehicle5.stop();
        vehicle5.start();
        vehicle5.speed();
        vehicle5.accelerate();

        Jeep jeep = new Jeep();
        jeep.accelerate();
        jeep.speed();
        jeep.brake();
        jeep.start();
        jeep.stop();

        System.out.println("-----------------------------------------------------------------");

        Vehicle vehicle6 = new Vehicle();
        vehicle6.speed();
        vehicle6.accelerate();
        vehicle6.stop();
        vehicle6.start();
        vehicle6.brake();

        Vehicle vehicle7 = new Train();
        vehicle7.brake();
        vehicle7.stop();
        vehicle7.start();
        vehicle7.speed();
        vehicle7.accelerate();

        Train train = new Train();
        train.accelerate();
        train.speed();
        train.start();
        train.stop();
        train.brake();

        System.out.println("---------------------------------------------------------------------");


        Animal animal6 = new Animal();
        animal6.walk();
        animal6.breathe();
        animal6.walk();
        animal6.sleep();
        animal6.eat();
        animal6.makesound();

        Animal animal7 = new Sheep();
        animal7.makesound();
        animal7.eat();
        animal7.breathe();
        animal7.sleep();
        animal7.walk();

        Sheep sheep = new Sheep();
        sheep.breathe();
        sheep.eat();
        sheep.walk();
        sheep.sleep();
        sheep.makesound();

        System.out.println("----------------------------------------------------------------------");


        Education education4 = new Education();
        education4.teach();
        education4.exams();
        education4.events();
        education4.activity();
        education4.certificates();

        Education education5 = new University();
        education5.teach();
        education5.exams();
        education5.events();
        education5.activity();
        education5.certificates();

        University university = new University();
        university.events();
        university.certificates();
        university.activity();
        university.exams();
        university.teach();

        System.out.println("--------------------------------------------------------------------");

        Hospital hospital6 = new Hospital();
        hospital6.admitPatient();
        hospital6.Ambulance();
        hospital6.discharge();
        hospital6.treat();
        hospital6.MedicalCheckup();

        Hospital hospital7 = new ChildernHospital();
        hospital7.MedicalCheckup();
        hospital7.treat();
        hospital7.discharge();
        hospital7.Ambulance();
        hospital7.admitPatient();

        ChildernHospital childernHospital = new ChildernHospital();
        childernHospital.admitPatient();
        childernHospital.Ambulance();
        childernHospital.discharge();
        childernHospital.MedicalCheckup();
        childernHospital.treat();

        System.out.println("--------------------------------------------------------------------");

        Hospital hospital8 = new Hospital();
        hospital8.admitPatient();
        hospital8.Ambulance();
        hospital8.discharge();
        hospital8.treat();
        hospital8.MedicalCheckup();

        Hospital hospital9 = new SpecializedHospital();
        hospital9.MedicalCheckup();
        hospital9.treat();
        hospital9.discharge();
        hospital9.Ambulance();
        hospital9.admitPatient();

        System.out.println("------------------------------------------------------------------");


        SpecializedHospital specializedHospital = new SpecializedHospital();
        specializedHospital.admitPatient();
        specializedHospital.MedicalCheckup();
        specializedHospital.discharge();
        specializedHospital.treat();
        specializedHospital.Ambulance();

        System.out.println("--------------------------------------------------------------------");
        Animal animal8 = new Animal();
        animal8.walk();
        animal8.breathe();
        animal8.walk();
        animal8.sleep();
        animal8.eat();
        animal8.makesound();

        Animal animal9 = new Goat();
        animal9.makesound();
        animal9.eat();
        animal9.breathe();
        animal9.sleep();
        animal9.walk();

        Goat goat = new Goat();
        goat.eat();
        goat.breathe();
        goat.makesound();
        goat.walk();
        goat.sleep();

        System.out.println("------------------------------------------------------------------------------");

        Shape shape6 = new Shape();
        shape6.color();
        shape6.draw();
        shape6.move();
        shape6.resize();
        shape6.rotate();

        Shape shape7 = new Triangle();
        shape7.color();
        shape7.draw();
        shape7.move();
        shape7.resize();
        shape7.rotate();


        Triangle triangle = new Triangle();
        triangle.color();
        triangle.move();
        triangle.draw();
        triangle.resize();
        triangle.rotate();

        System.out.println("---------------------------------------------------------------------------");


        Shape shape8 = new Shape();
        shape8.color();
        shape8.draw();
        shape8.move();
        shape8.resize();
        shape8.rotate();

        Shape shape9 = new Pentagon();
        shape9.color();
        shape9.draw();
        shape9.move();
        shape9.resize();
        shape9.rotate();


        Pentagon pentagon = new Pentagon();
        pentagon.color();
        pentagon.move();
        pentagon.draw();
        pentagon.resize();
        pentagon.rotate();

        System.out.println("---------------------------------------------------------------------------");

        Government government4 = new Government();
        government4.makeLaws();
        government4.collectTaxes();
        government4.enforceLaws();
        government4.conductElections();
        government4.provideService();

        Government government5 = new LocalGovernment();
        government5.makeLaws();
        government5.collectTaxes();
        government5.enforceLaws();
        government5.provideService();
        government5.conductElections();


        LocalGovernment localGovernment = new LocalGovernment();
        localGovernment.collectTaxes();
        localGovernment.conductElections();
        localGovernment.enforceLaws();
        localGovernment.provideService();
        localGovernment.makeLaws();

        System.out.println("------------------------------------------------------------------");


        Species species4 = new Species();
        species4.alive();
        species4.attack();
        species4.defend();
        species4.move();
        species4.speak();

        Species species5 = new Dragon();
        species5.speak();
        species5.move();
        species5.defend();
        species5.attack();
        species5.alive();

        Dragon dragon = new Dragon();
        dragon.alive();
        dragon.move();
        dragon.attack();
        dragon.defend();
        dragon.speak();

        System.out.println("--------------------------------------------------------------------------");


        Species species6 = new Species();
        species6.alive();
        species6.attack();
        species6.defend();
        species6.move();
        species6.speak();

        Species species7 = new Gaint();
        species7.speak();
        species7.move();
        species7.defend();
        species7.attack();
        species7.alive();

        Gaint gaint = new Gaint();
        gaint.alive();
        gaint.move();
        gaint.attack();
        gaint.speak();
        gaint.defend();

        System.out.println("------------------------------------------------------------------------");


        Species species8 = new Species();
        species8.alive();
        species8.attack();
        species8.defend();
        species8.move();
        species8.speak();

        Species species9 = new Werewolf();
        species9.speak();
        species9.move();
        species9.defend();
        species9.attack();
        species9.alive();

        Werewolf werewolf = new Werewolf();
        werewolf.alive();
        werewolf.attack();
        werewolf.defend();
        werewolf.move();
        werewolf.speak();

        System.out.println("---------------------------------------------------------------------------");
        Species species10 = new Species();
        species10.alive();
        species10.attack();
        species10.defend();
        species10.move();
        species10.speak();

        Species species11 = new Goblin();
        species11.speak();
        species11.move();
        species11.defend();
        species11.attack();
        species11.alive();

        Goblin goblin = new Goblin();
        goblin.alive();
        goblin.attack();
        goblin.defend();
        goblin.attack();
        goblin.speak();
        goblin.move();

        System.out.println("---------------------------------------------------------------------------");

        Vehicle vehicle8 = new Vehicle();
        vehicle8.speed();
        vehicle8.accelerate();
        vehicle8.stop();
        vehicle8.start();
        vehicle8.brake();

        Vehicle vehicle9 = new Cycle();
        vehicle9.brake();
        vehicle9.stop();
        vehicle9.start();
        vehicle9.speed();
        vehicle9.accelerate();

        Cycle cycle = new Cycle();
        cycle.accelerate();
        cycle.speed();
        cycle.brake();
        cycle.start();
        cycle.stop();

        System.out.println("--------------------------------------------------------------------------");


        Vegetable vegetable4 = new Vegetable();
        vegetable4.grow();
        vegetable4.harvest();
        vegetable4.nutrients();
        vegetable4.pesticide();
        vegetable4.water();

        Vegetable vegetable5 = new FruitVegetable();
        vegetable5.grow();
        vegetable5.harvest();
        vegetable5.nutrients();
        vegetable5.pesticide();
        vegetable5.water();

        FruitVegetable fruitVegetable = new FruitVegetable();
        fruitVegetable.grow();
        fruitVegetable.harvest();
        fruitVegetable.nutrients();
        fruitVegetable.pesticide();
        fruitVegetable.water();

        System.out.println("----------------------------------------------------------------------");

        Vegetable vegetable6 = new Vegetable();
        vegetable6.grow();
        vegetable6.harvest();
        vegetable6.nutrients();
        vegetable6.pesticide();
        vegetable6.water();

        Vegetable vegetable7 = new Raddish();
        vegetable7.grow();
        vegetable7.harvest();
        vegetable7.nutrients();
        vegetable7.pesticide();
        vegetable7.water();

        Raddish raddish= new Raddish();
        raddish.grow();
        raddish.harvest();
        raddish.nutrients();
        raddish.water();
        raddish.pesticide();

        System.out.println("-------------------------------------------------------------------------");

        RootVeg rootVeg1 = new RootVeg();
        rootVeg1.grow();
        rootVeg1.water();
        rootVeg1.pesticide();
        rootVeg1.nutrients();
        rootVeg1.pesticide();

        RootVeg rootVeg2 = new Carrot();
        rootVeg2.grow();
        rootVeg2.water();
        rootVeg2.pesticide();
        rootVeg2.nutrients();
        rootVeg2.pesticide();

        Carrot carrot = new Carrot();
        carrot.grow();
        carrot.nutrients();
        carrot.water();
        carrot.pesticide();
        carrot.harvest();

        System.out.println("--------------------------------------------------------------------------");


        Vehicle vehicle10 = new Vehicle();
        vehicle10.speed();
        vehicle10.accelerate();
        vehicle10.stop();
        vehicle10.start();
        vehicle10.brake();

        Vehicle vehicle11 = new Airplane();
        vehicle11.brake();
        vehicle11.stop();
        vehicle11.start();
        vehicle11.speed();
        vehicle11.accelerate();

        Airplane airplane = new Airplane();
        airplane.accelerate();
        airplane.brake();
        airplane.speed();
        airplane.start();
        airplane.stop();

        System.out.println("----------------------------------------------------------------------------");

        Vehicle vehicle12 = new Vehicle();
        vehicle12.speed();
        vehicle12.accelerate();
        vehicle12.stop();
        vehicle12.start();
        vehicle12.brake();

        Vehicle vehicle13 = new Bulldozer();
        vehicle13.brake();
        vehicle13.stop();
        vehicle13.start();
        vehicle13.speed();
        vehicle13.accelerate();

        Bulldozer bulldozer= new Bulldozer();
       bulldozer.accelerate();
       bulldozer.brake();
       bulldozer.speed();
       bulldozer.start();
       bulldozer.stop();

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("------------------------------------------------------------------------");

        Device device = new Device();
        device.call();
        device.message();
        device.playGames();
        device.track();
        device.videoCall();

        Device device1 = new Phone();
        device1.videoCall();
        device1.track();
        device1.call();
        device1.message();
        device1.playGames();

        Phone phone = new Phone();
        phone.call();
        phone.message();
        phone.playGames();
        phone.track();
        phone.videoCall();

        System.out.println("---------------------------------------------------------------------------");

        Person person = new Person();
        person.earnMoney();
        person.doJob();
        person.eat();
        person.learn();
        person.sleep();

        Person person1 = new Teacher();
        person1.sleep();
        person1.earnMoney();
        person1.eat();
        person1.learn();
        person1.doJob();

        Teacher teacher = new Teacher();
        teacher.doJob();
        teacher.earnMoney();
        teacher.eat();
        teacher.learn();
        teacher.sleep();

        System.out.println("-------------------------------------------------------------------------");


        Instrument instrument = new Instrument();
        instrument.cords();
        instrument.keys();
        instrument.play();
        instrument.strings();

        Instrument instrument1 = new Guiter();
        instrument1.cords();
        instrument1.play();
        instrument1.keys();
        instrument1.strings();

        Guiter guiter = new Guiter();
        guiter.cords();
        guiter.play();
        guiter.strings();
        guiter.keys();

        System.out.println("-------------------------------------------------------------------");

        Bag bag = new Bag();
        bag.closeZip();
        bag.keepThings();
        bag.openZip();
        bag.size();
        bag.toStore();

        Bag bag1 = new SchoolBag();
        bag1.toStore();
        bag1.size();
        bag1.keepThings();
        bag1.closeZip();
        bag1.openZip();

        SchoolBag schoolBag = new SchoolBag();
        schoolBag.closeZip();
        schoolBag.keepThings();
        schoolBag.size();
        schoolBag.openZip();
        schoolBag.toStore();

        System.out.println("------------------------------------------------------------------------");


        Book book = new Book();
        book.edit();
        book.publish();
        book.read();
        book.rewrite();
        book.write();

        Book book1 = new Novel();
        book1.write();
        book1.read();
        book1.publish();
        book1.edit();
        book1.rewrite();

        Novel novel = new Novel();
        novel.edit();
        novel.publish();
        novel.rewrite();
        novel.write();
        novel.read();

        System.out.println("----------------------------------------------------------------------");

        Bank bank = new Bank();
        bank.balance();
        bank.deposit();
        bank.sendmsg();
        bank.save();
        bank.withdraw();

        Bank bank1 = new Account();
        bank1.withdraw();
        bank1.save();
        bank1.sendmsg();
        bank1.deposit();
        bank1.balance();

        Account account = new Account();
        account.balance();
        account.save();
        account.deposit();
        account.withdraw();
        account.sendmsg();

        System.out.println("------------------------------------------------------------------------");


        Appliance appliance = new Appliance();
        appliance.condenser();
        appliance.cool();
        appliance.heat();
        appliance.runThroughElectric();
        appliance.storethings();

        Appliance appliance1 = new Refrigerator();
        appliance1.storethings();
        appliance1.heat();
        appliance1.runThroughElectric();
        appliance1.condenser();
        appliance1.cool();

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.condenser();
        refrigerator.cool();
        refrigerator.heat();
        refrigerator.runThroughElectric();
        refrigerator.storethings();

        System.out.println("-------------------------------------------------------------");

        Building building = new Building();
        building.bhk();
        building.blocks();
        building.floor();
        building.rooms();
        building.security();

        Building building1 = new House();
        building1.bhk();
        building1.blocks();
        building1.floor();
        building1.rooms();
        building1.security();


        House house = new House();
        house.bhk();
        house.blocks();
        house.rooms();
        house.security();
        house.floor();

        System.out.println("-------------------------------------------------------------------");

        Furniture furniture = new Furniture();
        furniture.sit();
        furniture.design();
        furniture.showcase();
        furniture.tostore();
        furniture.sleep();

        Furniture furniture1 = new Chair();
        furniture1.sleep();
        furniture1.sit();
        furniture1.tostore();
        furniture.design();
        furniture1.showcase();

        Chair chair = new Chair();
        chair.sit();
        chair.design();
        chair.showcase();
        chair.sleep();
        chair.tostore();

        System.out.println("-----------------------------------------------------------------");

        Bird bird = new Bird();
        bird.eat();
        bird.fly();
        bird.searchFood();
        bird.sing();
        bird.eat();

        Bird bird1 = new Parrot();
        bird1.eat();
        bird1.fly();
        bird1.searchFood();
        bird1.sing();
        bird1.eat();

        Parrot parrot = new Parrot();
        parrot.eat();
        parrot.fly();
        parrot.searchFood();
        parrot.sleep();
        parrot.sing();

        System.out.println("-------------------------------------------------------------------");

        Food food = new Food();
        food.addsalt();
        food.eat();
        food.addSpinach();
        food.empty();
        food.ingredients();

        Food food1= new Pizza();
        food1.eat();
        food1.addSpinach();
        food1.empty();
        food1.ingredients();
        food1.addsalt();

        Pizza pizza = new Pizza();
        pizza.addsalt();
        pizza.addSpinach();
        pizza.empty();
        pizza.eat();
        pizza.ingredients();

        System.out.println("--------------------------------------------------------------------");


        Cloth cloth = new Cloth();
        cloth.clean();
        cloth.iron();
        cloth.stitch();
        cloth.tore();
        cloth.wear();

        Cloth cloth1 = new Shirt();
        cloth1.clean();
        cloth1.iron();
        cloth1.stitch();
        cloth1.tore();
        cloth1.wear();

        Shirt shirt = new Shirt();
        shirt.clean();
        shirt.iron();
        shirt.stitch();
        shirt.wear();
        shirt.tore();

        System.out.println("---------------------------------------------------------------------");


        Container container = new Container();
        container.capacity();
        container.color();
        container.empty();
        container.fill();
        container.size();

        Container container1 = new Bottel();
        container1.capacity();
        container1.color();
        container1.empty();
        container1.fill();
        container1.size();

        Bottel bottel = new Bottel();
        bottel.capacity();
        bottel.empty();
        bottel.fill();
        bottel.color();
        bottel.size();

        System.out.println("---------------------------------------------------------------------");

        Employee employee = new Employee();
        employee.department();
        employee.eat();
        employee.salary();
        employee.work();
        employee.timepass();

        Employee employee1 = new Manager();
        employee1.department();
        employee1.eat();
        employee1.salary();
        employee1.work();
        employee1.timepass();

        Manager manager = new Manager();
        manager.department();
        manager.salary();
        manager.work();
        manager.timepass();
        manager.eat();

        System.out.println("----------------------------------------------------------------------------");




    }
}
