package com.xworkz.inheritence;

import com.xworkz.inheritence.casting.Kitchen;
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
        lion.eat();
        lion.sleep();
        lion.walk();
        lion.makesound();

        System.out.println("-------------------------------------------------------");


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

        Food food1 = new Pizza();
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


        Toy toy = new Toy();
        toy.clean();
        toy.throwToy();
        toy.shake();
        toy.squeeze();
        toy.store();

        Toy toy1 = new TeddyBear();
        toy1.clean();
        toy1.throwToy();
        toy1.shake();
        toy1.squeeze();
        toy1.store();

        TeddyBear teddyBear = new TeddyBear();
        teddyBear.clean();
        teddyBear.squeeze();
        teddyBear.shake();
        teddyBear.store();
        teddyBear.throwToy();

        System.out.println("------------------------------------------------------------------------");


        NetworkDevice networkDevice = new NetworkDevice();
        networkDevice.connect();
        networkDevice.disconnect();
        networkDevice.receiveData();
        networkDevice.transmitData();
        networkDevice.reboot();

        NetworkDevice networkDevice1 = new Router();
        networkDevice1.connect();
        networkDevice1.disconnect();
        networkDevice1.receiveData();
        networkDevice1.transmitData();
        networkDevice1.reboot();

        Router router = new Router();
        router.connect();
        router.reboot();
        router.disconnect();
        router.transmitData();
        router.receiveData();

        System.out.println("------------------------------------------------------------------------");

        Drawing drawing = new Drawing();
        drawing.clean();
        drawing.colourFull();
        drawing.dry();
        drawing.use();
        drawing.dipInPaint();

        Drawing drawing1 = new PaintBrush();
        drawing1.clean();
        drawing1.colourFull();
        drawing1.dry();
        drawing1.use();
        drawing1.dipInPaint();

        PaintBrush paintBrush = new PaintBrush();
        paintBrush.dipInPaint();
        paintBrush.dry();
        paintBrush.use();
        paintBrush.colourFull();
        paintBrush.clean();

        System.out.println("--------------------------------------------------------------------");

        Medicine medicine = new Medicine();
        medicine.checkExpiry();
        medicine.consume();
        medicine.measureDosage();
        medicine.prescribe();
        medicine.storeProperly();

        Medicine medicine1 = new Antibiotic();
        medicine1.checkExpiry();
        medicine1.consume();
        medicine1.measureDosage();
        medicine1.prescribe();
        medicine1.storeProperly();


        Antibiotic antibiotic = new Antibiotic();
        antibiotic.checkExpiry();
        antibiotic.measureDosage();
        antibiotic.consume();
        antibiotic.storeProperly();
        antibiotic.prescribe();


        System.out.println("---------------------------------------------------------------------");

        Game game = new Game();
        game.end();
        game.pause();
        game.reset();
        game.saveProgress();
        game.start();


        Game game1 = new Chess();
        game1.end();
        game1.pause();
        game1.reset();
        game1.saveProgress();
        game1.start();


        Chess chess = new Chess();
        chess.end();
        chess.reset();
        chess.pause();
        chess.saveProgress();
        chess.start();

        System.out.println("-----------------------------------------------------------------------");

        Weapon weapon = new Weapon();
        weapon.sharpen();
        weapon.attack();
        weapon.defend();
        weapon.equip();
        weapon.storeSafely();

        Weapon weapon1 = new Sword();
        weapon1.sharpen();
        weapon1.attack();
        weapon1.defend();
        weapon1.equip();
        weapon1.storeSafely();

        Sword sword = new Sword();
        sword.attack();
        sword.equip();
        sword.defend();
        sword.sharpen();
        sword.storeSafely();

        System.out.println("------------------------------------------------------------------------");

        StorageDevice storageDevice = new StorageDevice();
        storageDevice.checkHealth();
        storageDevice.eject();
        storageDevice.format();
        storageDevice.readData();
        storageDevice.writeData();

        StorageDevice storageDevice1 = new HardDisk();
        storageDevice1.checkHealth();
        storageDevice1.eject();
        storageDevice1.format();
        storageDevice1.readData();
        storageDevice1.writeData();

        HardDisk hardDisk = new HardDisk();
        hardDisk.checkHealth();
        hardDisk.format();
        hardDisk.eject();
        hardDisk.readData();
        hardDisk.writeData();

        System.out.println("------------------------------------------------------------------------");

        Timepiece timepiece = new Timepiece();
        timepiece.adjustTime();
        timepiece.checkBattery();
        timepiece.displayTime();
        timepiece.setAlarm();
        timepiece.startTimer();

        Timepiece timepiece1 = new Watch();
        timepiece1.adjustTime();
        timepiece1.checkBattery();
        timepiece1.displayTime();
        timepiece1.setAlarm();
        timepiece1.startTimer();

        Watch watch = new Watch();
        watch.adjustTime();
        watch.checkBattery();
        watch.displayTime();
        watch.setAlarm();
        watch.startTimer();

        System.out.println("------------------------------------------------------------------------");


        Tree tree = new Tree();
        tree.bearFruit();
        tree.grow();
        tree.photosynthesize();
        tree.provideOxygen();
        tree.shedLeaves();

        Tree tree1 = new OakTree();
        tree1.bearFruit();
        tree1.grow();
        tree1.photosynthesize();
        tree1.provideOxygen();
        tree1.shedLeaves();


        OakTree oakTree = new OakTree();
        oakTree.bearFruit();
        oakTree.photosynthesize();
        oakTree.grow();
        oakTree.provideOxygen();
        oakTree.shedLeaves();

        System.out.println("-----------------------------------------------------------------------");

        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.makePayment();
        paymentMethod.validatePayment();
        paymentMethod.addFunds();
        paymentMethod.checkBalance();
        paymentMethod.viewTransactions();

        PaymentMethod paymentMethod1 = new CreditCard();
        paymentMethod1.makePayment();
        paymentMethod1.validatePayment();
        paymentMethod1.addFunds();
        paymentMethod1.checkBalance();
        paymentMethod1.viewTransactions();


        CreditCard creditCard = new CreditCard();
        creditCard.addFunds();
        creditCard.checkBalance();
        creditCard.makePayment();
        creditCard.validatePayment();
        creditCard.viewTransactions();

        System.out.println("-----------------------------------------------------------------------");


        Computer computer = new Computer();
        computer.bootUp();
        computer.connectToInternet();
        computer.processTask();
        computer.shutDown();
        computer.updateSoftware();

        Computer computer1 = new Laptop();
        computer1.bootUp();
        computer1.connectToInternet();
        computer1.processTask();
        computer1.shutDown();
        computer1.updateSoftware();

        Laptop laptop = new Laptop();
        laptop.bootUp();
        laptop.processTask();
        laptop.connectToInternet();
        laptop.updateSoftware();
        laptop.shutDown();

        System.out.println("-------------------------------------------------------------------------");


        Camera camera = new Camera();
        camera.adjustFocus();
        camera.capturePhoto();
        camera.changeLens();
        camera.viewGallery();
        camera.recordVideo();

        Camera camera1 = new DSLR();
        camera1.adjustFocus();
        camera1.capturePhoto();
        camera1.changeLens();
        camera1.viewGallery();
        camera1.recordVideo();

        DSLR dslr = new DSLR();
        dslr.adjustFocus();
        dslr.capturePhoto();
        dslr.recordVideo();
        dslr.changeLens();
        dslr.viewGallery();

        System.out.println("-------------------------------------------------------------------------");


        Tool tool = new Tool();
        tool.checkDurability();
        tool.maintain();
        tool.repair();
        tool.use();
        tool.storeSafely();

        Tool tool1 = new Hammer();
        tool1.checkDurability();
        tool1.maintain();
        tool1.repair();
        tool1.use();
        tool1.storeSafely();

        Hammer hammer = new Hammer();
        hammer.checkDurability();
        hammer.repair();
        hammer.maintain();
        hammer.storeSafely();
        hammer.use();

        System.out.println("------------------------------------------------------------------------");

        Clock clock = new Clock();
        clock.resetClock();
        clock.stopClock();
        clock.setAlarm();
        clock.tick();
        clock.showTime();


        Clock clock1 = new DigitalClock();
        clock1.resetClock();
        clock1.stopClock();
        clock1.setAlarm();
        clock1.tick();
        clock1.showTime();

        DigitalClock digitalClock = new DigitalClock();
        digitalClock.resetClock();
        digitalClock.showTime();
        digitalClock.stopClock();
        digitalClock.tick();
        digitalClock.setAlarm();

        System.out.println("----------------------------------------------------------------------");

        Sport sport = new Sport();
        sport.followRules();
        sport.lose();
        sport.play();
        sport.win();
        sport.practice();

        Sport sport1 = new FootBall();
        sport1.followRules();
        sport1.lose();
        sport1.play();
        sport1.win();
        sport1.practice();

        FootBall footBall = new FootBall();
        footBall.followRules();
        footBall.lose();
        footBall.win();
        footBall.play();
        footBall.practice();

        System.out.println("-----------------------------------------------------------------------");


        Beverage beverage = new Beverage();
        beverage.addSugar();
        beverage.drink();
        beverage.checkTemperature();
        beverage.serve();
        beverage.prepare();

        Beverage beverage1 = new Coffee();
        beverage1.addSugar();
        beverage1.drink();
        beverage1.checkTemperature();
        beverage1.serve();
        beverage1.prepare();

        Coffee coffee = new Coffee();
        coffee.addSugar();
        coffee.checkTemperature();
        coffee.drink();
        coffee.prepare();
        coffee.serve();

        System.out.println("----------------------------------------------------------------------");

        Planet planet = new Planet();
        planet.experienceSeasons();
        planet.revolve();
        planet.maintainGravity();
        planet.rotate();
        planet.supportLife();

        Planet planet1 = new Earth();
        planet1.experienceSeasons();
        planet1.revolve();
        planet1.maintainGravity();
        planet1.rotate();
        planet1.supportLife();

        Earth earth = new Earth();
        earth.experienceSeasons();
        earth.maintainGravity();
        earth.revolve();
        earth.rotate();
        earth.supportLife();

        System.out.println("-------------------------------------------------------------------------");


        Gadget gadget = new Gadget();
        gadget.charge();
        gadget.connectToWiFi();
        gadget.turnOff();
        gadget.turnOn();
        gadget.updateSoftware();

        Gadget gadget1 = new Smartphone();
        gadget1.charge();
        gadget1.connectToWiFi();
        gadget1.turnOff();
        gadget1.turnOn();
        gadget1.updateSoftware();


        Smartphone smartphone = new Smartphone();
        smartphone.charge();
        smartphone.connectToWiFi();
        smartphone.turnOff();
        smartphone.turnOn();
        smartphone.updateSoftware();

        System.out.println("------------------------------------------------------------------------");

        Currency currency = new Currency();
        currency.calculateValue();
        currency.exchange();
        currency.storeValue();
        currency.transfer();
        currency.useForTransactions();

        Currency currency1 = new DigitalCurrency();
        currency1.calculateValue();
        currency1.exchange();
        currency1.storeValue();
        currency1.transfer();
        currency1.useForTransactions();

        DigitalCurrency digitalCurrency = new DigitalCurrency();
        digitalCurrency.calculateValue();
        digitalCurrency.storeValue();
        digitalCurrency.transfer();
        digitalCurrency.exchange();
        digitalCurrency.useForTransactions();

        System.out.println("------------------------------------------------------------------------");


        Light light = new Light();
        light.emitLight();
        light.adjustBrightness();
        light.saveEnergy();
        light.turnOff();
        light.turnOn();


        Light light1 = new LEDBulb();
        light1.emitLight();
        light1.adjustBrightness();
        light1.saveEnergy();
        light1.turnOff();
        light1.turnOn();

        LEDBulb ledBulb = new LEDBulb();
        ledBulb.adjustBrightness();
        ledBulb.saveEnergy();
        ledBulb.emitLight();
        ledBulb.turnOff();
        ledBulb.turnOn();

        System.out.println("------------------------------------------------------------------------");


        Flower flower = new Flower();
        flower.absorbSunlight();
        flower.bloom();
        flower.attractBees();
        flower.releaseFragrance();
        flower.provideNectar();

        Flower flower1 = new Rose();
        flower1.absorbSunlight();
        flower1.bloom();
        flower1.attractBees();
        flower1.releaseFragrance();
        flower1.provideNectar();

        Rose rose = new Rose();
        rose.absorbSunlight();
        rose.attractBees();
        rose.provideNectar();
        rose.releaseFragrance();
        rose.bloom();

        System.out.println("------------------------------------------------------------------------");


        Fish fish = new Fish();
        fish.breatheUnderwater();
        fish.camouflage();
        fish.eatPlankton();
        fish.layEggs();
        fish.swim();

        Fish fish1= new Shark();
        fish1.breatheUnderwater();
        fish1.camouflage();
        fish1.eatPlankton();
        fish1.layEggs();
        fish1.swim();


        Shark shark = new Shark();
        shark.breatheUnderwater();
        shark.eatPlankton();
        shark.camouflage();
        shark.layEggs();
        shark.swim();

        System.out.println("-----------------------------------------------------------------------");


        Mountain mountain = new Mountain();
        mountain.attractTourists();
        mountain.provideResources();
        mountain.standTall();
        mountain.experienceWeatherChanges();
        mountain.supportEcosystem();

        Mountain mountain1 = new Everest();
        mountain1.attractTourists();
        mountain1.provideResources();
        mountain1.standTall();
        mountain1.experienceWeatherChanges();
        mountain1.supportEcosystem();

        Everest everest = new Everest();
        everest.attractTourists();
        everest.provideResources();
        everest.supportEcosystem();
        everest.experienceWeatherChanges();
        everest.standTall();

        System.out.println("---------------------------------------------------------------------------");

        Reptile reptile = new Reptile();
        reptile.camouflage();
        reptile.crawl();
        reptile.hibernate();
        reptile.hunt();
        reptile.shedSkin();

        Reptile reptile1 = new Snake();
        reptile1.camouflage();
        reptile1.crawl();
        reptile1.hibernate();
        reptile1.hunt();
        reptile1.shedSkin();

        Snake snake = new Snake();
        snake.camouflage();
        snake.crawl();
        snake.hibernate();
        snake.hunt();
        snake.shedSkin();

        System.out.println("---------------------------------------------------------------------------");

        Newspaper newspaper = new Newspaper();
        newspaper.advertise();
        newspaper.distribute();
        newspaper.printNews();
        newspaper.provideInformation();
        newspaper.updateDaily();

        Newspaper newspaper1 = new Magazine();
        newspaper1.advertise();
        newspaper1.distribute();
        newspaper1.printNews();
        newspaper1.provideInformation();
        newspaper1.updateDaily();

        Magazine magazine = new Magazine();
        magazine.advertise();
        magazine.distribute();
        magazine.printNews();
        magazine.provideInformation();
        magazine.updateDaily();

        System.out.println("---------------------------------------------------------------------------");

        Gemstone gemstone = new Gemstone();
        gemstone.cut();
        gemstone.embedInJewelry();
        gemstone.polish();
        gemstone.sell();
        gemstone.shine();

        Gemstone gemstone1 = new Diamond();
        gemstone1.cut();
        gemstone1.embedInJewelry();
        gemstone1.polish();
        gemstone1.sell();
        gemstone1.shine();

        Diamond diamond = new Diamond();
        diamond.cut();
        diamond.embedInJewelry();
        diamond.polish();
        diamond.sell();
        diamond.shine();

        System.out.println("------------------------------------------------------------------------------");

        Document document = new Document();
        document.open();
        document.print();
        document.read();
        document.save();
        document.write();

        Document document1 = new Books();
        document1.open();
        document1.print();
        document1.read();
        document1.save();
        document1.write();

        Books books = new Books();
        books.open();
        books.print();
        books.read();
        books.save();
        books.write();

        System.out.println("------------------------------------------------------------------------");


        Insect insect = new Insect();
        insect.crawl();
        insect.feed();
        insect.fly();
        insect.reproduce();
        insect.undergoMetamorphosis();

        Insect insect1 = new Butterfly();
        insect1.crawl();
        insect1.feed();
        insect1.fly();
        insect1.reproduce();
        insect1.undergoMetamorphosis();

        Butterfly butterfly = new Butterfly();
        butterfly.crawl();
        butterfly.feed();
        butterfly.reproduce();
        butterfly.undergoMetamorphosis();
        butterfly.fly();

        System.out.println("--------------------------------------------------------------------------");

        Jewel jewel = new Jewel();
        jewel.polish();
        jewel.sell();
        jewel.shine();
        jewel.store();
        jewel.wear();

        Jewel jewel1 = new Necklace();
        jewel1.polish();
        jewel1.sell();
        jewel1.shine();
        jewel1.store();
        jewel1.wear();

        Necklace necklace = new Necklace();
        necklace.polish();
        necklace.sell();
        necklace.shine();
        necklace.store();
        necklace.wear();

        System.out.println("------------------------------------------------------------------------");

        Language language = new Language();
        language.learn();
        language.read();
        language.speak();
        language.translate();
        language.write();

        Language language1 = new English();
        language1.learn();
        language1.read();
        language1.speak();
        language1.translate();
        language1.write();

        English english = new English();
        english.learn();
        english.read();
        english.translate();
        english.write();
        english.speak();

        System.out.println("---------------------------------------------------------------------");


        Software software = new Software();
        software.configure();
        software.run();
        software.install();
        software.uninstall();
        software.update();

        Software software1 = new OperatingSystem();
        software1.configure();
        software1.run();
        software1.install();
        software1.uninstall();
        software1.update();

        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.configure();
        operatingSystem.run();
        operatingSystem.uninstall();
        operatingSystem.install();
        operatingSystem.update();

        System.out.println("-------------------------------------------------------------------------");


        Browser browser = new Browser();
        browser.close();
        browser.extensions();
        browser.open();
        browser.incognitoMode();
        browser.navigate();

        Browser browser1 = new FireFox();
        browser1.close();
        browser1.extensions();
        browser1.open();
        browser1.incognitoMode();
        browser1.navigate();


        FireFox fireFox = new FireFox();
        fireFox.close();
        fireFox.extensions();
        fireFox.incognitoMode();
        fireFox.open();
        fireFox.navigate();

        System.out.println("----------------------------------------------------------------------");

        Restaurant restaurant = new Restaurant();
        restaurant.addIngredients();
        restaurant.addsalt();
        restaurant.clean();
        restaurant.cook();
        restaurant.taste();

        Restaurant restaurant1 = new Chef();
        restaurant1.addIngredients();
        restaurant1.addsalt();
        restaurant1.clean();
        restaurant1.cook();
        restaurant1.taste();

        Chef  chef = new Chef();
        chef.addIngredients();
        chef.cook();
        chef.taste();
        chef.addsalt();
        chef.clean();

        System.out.println("----------------------------------------------------------------------");


        Festival festival = new Festival();
        festival.celebrate();
        festival.decorate();
        festival.enjoyMusic();
        festival.feast();
        festival.gatherPeople();

        Festival festival1 = new Deepavali();
        festival1.celebrate();
        festival1.decorate();
        festival1.enjoyMusic();
        festival1.feast();
        festival1.gatherPeople();

        Deepavali deepavali = new Deepavali();
        deepavali.celebrate();
        deepavali.enjoyMusic();
        deepavali.decorate();
        deepavali.feast();
        deepavali.gatherPeople();

        System.out.println("-------------------------------------------------------------------------");

        Shampoo shampoo = new Shampoo();
        shampoo.apply();
        shampoo.rub();
        shampoo.clean();
        shampoo.rinse();
        shampoo.wash();

        Shampoo shampoo1 = new CleanicPlus();
        shampoo1.apply();
        shampoo1.rub();
        shampoo1.clean();
        shampoo1.rinse();
        shampoo1.wash();

        CleanicPlus cleanicPlus = new CleanicPlus();
        cleanicPlus.apply();
        cleanicPlus.rub();
        cleanicPlus.rinse();
        cleanicPlus.wash();
        cleanicPlus.clean();

        System.out.println("-----------------------------------------------------------------------");


        AudioDevice audioDevice = new AudioDevice();
        audioDevice.beats();
        audioDevice.call();
        audioDevice.listen();
        audioDevice.music();
        audioDevice.play();

        AudioDevice audioDevice1 = new Earphone();
        audioDevice1.beats();
        audioDevice1.call();
        audioDevice1.listen();
        audioDevice1.music();
        audioDevice1.play();

        Earphone earphone = new Earphone();
        earphone.beats();
        earphone.listen();
        earphone.call();
        earphone.music();
        earphone.play();

        System.out.println("-----------------------------------------------------------------------");

        Bus bus = new Bus();
        bus.pass();
        bus.seat();
        bus.reserved();
        bus.stand();
        bus.ticket();

        Bus bus1 = new MaheshBus();
        bus1.pass();
        bus1.seat();
        bus1.reserved();
        bus1.stand();
        bus1.ticket();

        MaheshBus maheshBus = new MaheshBus();
        maheshBus.pass();
        maheshBus.seat();
        maheshBus.reserved();
        maheshBus.ticket();
        maheshBus.stand();

        System.out.println("-------------------------------------------------------------------------");

        Footwear footwear = new Footwear();
        footwear.remove();
        footwear.run();
        footwear.tie();
        footwear.walk();
        footwear.wear();

        Footwear footwear1 = new Shoe();
        footwear1.remove();
        footwear1.run();
        footwear1.tie();
        footwear1.walk();
        footwear1.wear();

        Shoe shoe = new Shoe();
        shoe.remove();
        shoe.tie();
        shoe.run();
        shoe.walk();
        shoe.wear();

        System.out.println("------------------------------------------------------------------------");

        Tournament tournament = new Tournament();
        tournament.declareWinner();
        tournament.entertainFans();
        tournament.organize();
        tournament.scheduleMatches();
        tournament.teamsParticipate();

        Tournament tournament1 = new IPL();
        tournament1.declareWinner();
        tournament1.entertainFans();
        tournament1.organize();
        tournament1.scheduleMatches();
        tournament1.teamsParticipate();

        IPL ipl = new IPL();
        ipl.declareWinner();
        ipl.organize();
        ipl.entertainFans();
        ipl.scheduleMatches();
        ipl.teamsParticipate();

        System.out.println("--------------------------------------------------------------------------");



        Fruit fruit = new Fruit();
        fruit.eat();
        fruit.grow();
        fruit.provideNutrition();
        fruit.harvest();
        fruit.ripen();

        Fruit fruit1 = new Mango();
        fruit1.eat();
        fruit1.grow();
        fruit1.provideNutrition();
        fruit1.harvest();
        fruit1.ripen();

        Mango mango = new Mango();
        mango.eat();
        mango.provideNutrition();
        mango.grow();
        mango.ripen();
        mango.harvest();

        System.out.println("------------------------------------------------------------------------");



        Door door = new Door();
        door.close();
        door.lock();
        door.material();
        door.open();
        door.unlock();

        Door door1 = new WoodenDoor();
        door1.close();
        door1.lock();
        door1.material();
        door1.open();
        door1.unlock();

        WoodenDoor woodenDoor = new WoodenDoor();
        woodenDoor.close();
        woodenDoor.lock();
        woodenDoor.material();
        woodenDoor.unlock();
        woodenDoor.open();

        System.out.println("---------------------------------------------------------------------");



        Country country = new Country();
        country.continent();
        country.currency();
        country.government();
        country.language();
        country.population();

        Country country1 = new India();
        country1.continent();
        country1.currency();
        country1.government();
        country1.language();
        country1.population();

        India india = new India();
        india.continent();
        india.population();
        india.currency();
        india.language();
        india.continent();
        System.out.println("----------------------------------------------------------------------------");

        EnergySource energySource = new EnergySource();
        energySource.distributeEnergy();
        energySource.generatePower();
        energySource.storeEnergy();
        energySource.maintain();
        energySource.reduceCarbonFootprint();

        EnergySource energySource1 = new SolarPanel();
        energySource1.distributeEnergy();
        energySource1.generatePower();
        energySource1.storeEnergy();
        energySource1.maintain();
        energySource1.reduceCarbonFootprint();

        SolarPanel solarPanel = new SolarPanel();
        solarPanel.distributeEnergy();
        solarPanel.generatePower();
        solarPanel.storeEnergy();
        solarPanel.reduceCarbonFootprint();
        solarPanel.maintain();

        System.out.println("--------------------------------------------------------------------------");

        Ships ships = new Ships();
        ships.anchor();
        ships.carryCargo();
        ships.navigate();
        ships.sail();
        ships.signal();

        Ships ships1 = new CruiseShip();
        ships1.anchor();
        ships1.carryCargo();
        ships1.navigate();
        ships1.sail();
        ships1.signal();

        CruiseShip cruiseShip = new CruiseShip();
        cruiseShip.carryCargo();
        cruiseShip.sail();
        cruiseShip.signal();
        cruiseShip.anchor();
        cruiseShip.navigate();

        System.out.println("-------------------------------------------------------------------------");


        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.compile();
        programmingLanguage.debug();
        programmingLanguage.execute();
        programmingLanguage.maintain();
        programmingLanguage.optimize();

        ProgrammingLanguage programmingLanguage1 = new Java();
        programmingLanguage1.compile();
        programmingLanguage1.debug();
        programmingLanguage1.execute();
        programmingLanguage1.maintain();
        programmingLanguage1.optimize();

        Java java = new Java();
        java.compile();
        java.execute();
        java.debug();
        java.optimize();
        java.maintain();

        System.out.println("--------------------------------------------------------------------------");


        Fabric fabric = new Fabric();
        fabric.dry();
        fabric.dye();
        fabric.fold();
        fabric.wash();
        fabric.weave();

        Fabric fabric1 = new Bedsheet();
        fabric1.dry();
        fabric1.dye();
        fabric1.fold();
        fabric1.wash();
        fabric1.weave();

        Bedsheet bedsheet = new Bedsheet();
        bedsheet.dye();
        bedsheet.fold();
        bedsheet.weave();
        bedsheet.dry();
        bedsheet.wash();

        System.out.println("--------------------------------------------------------------------------");


        GlassObject glassObject = new GlassObject();
        glassObject.breakGlass();
        glassObject.frame();
        glassObject.mount();
        glassObject.reflect();
        glassObject.clean();

        GlassObject glassObject1 = new Mirror();
        glassObject1.breakGlass();
        glassObject1.frame();
        glassObject1.mount();
        glassObject1.reflect();
        glassObject1.clean();

        Mirror mirror = new Mirror();
        mirror.breakGlass();
        mirror.frame();
        mirror.reflect();
        mirror.mount();
        mirror.clean();

        System.out.println("------------------------------------------------------------------------");

        ShowerGel showerGel = new ShowerGel();
        showerGel.cleanse();
        showerGel.foam();
        showerGel.fragrance();
        showerGel.moisturize();
        showerGel.rinseOff();

        ShowerGel showerGel1 = new Pears();
        showerGel1.cleanse();
        showerGel1.foam();
        showerGel1.fragrance();
        showerGel1.moisturize();
        showerGel1.rinseOff();


        Pears pears = new Pears();
        pears.cleanse();
        pears.fragrance();
        pears.foam();
        pears.moisturize();
        pears.rinseOff();

        System.out.println("------------------------------------------------------------------------");

        Dishware dishware = new Dishware();
        dishware.breakIfDropped();
        dishware.serveFood();
        dishware.stack();
        dishware.store();
        dishware.clean();


        Dishware dishware1 = new Plate();
        dishware1.breakIfDropped();
        dishware1.serveFood();
        dishware1.stack();
        dishware1.store();
        dishware1.clean();


        Plate plate = new Plate();
        plate.breakIfDropped();
        plate.serveFood();
        plate.clean();
        plate.store();
        plate.stack();

        System.out.println("------------------------------------------------------------------------");

        Liquid liquid = new Liquid();
        liquid.evaporate();
        liquid.mix();
        liquid.lubricate();
        liquid.pour();
        liquid.store();

        Liquid liquid1 = new Oil();
        liquid1.evaporate();
        liquid1.mix();
        liquid1.lubricate();
        liquid1.pour();
        liquid1.store();

        Oil oil = new Oil();
        oil.mix();
        oil.lubricate();
        oil.evaporate();
        oil.store();
        oil.pour();

        System.out.println("-----------------------------------------------------------------------");


        Sunscreen sunscreen = new Sunscreen();
        sunscreen.absorb();
        sunscreen.hydrate();
        sunscreen.preventBurns();
        sunscreen.protectFromUV();
        sunscreen.provideSPF();

        Sunscreen sunscreen1 = new Deconstruct();
        sunscreen1.absorb();
        sunscreen1.hydrate();
        sunscreen1.preventBurns();
        sunscreen1.protectFromUV();
        sunscreen1.provideSPF();

        Deconstruct deconstruct = new Deconstruct();
        deconstruct.absorb();
        deconstruct.preventBurns();
        deconstruct.hydrate();
        deconstruct.protectFromUV();
        deconstruct.provideSPF();

        System.out.println("----------------------------------------------------------------------");

        DairyProduct dairyProduct = new DairyProduct();
        dairyProduct.consume();
        dairyProduct.expireQuickly();
        dairyProduct.mixWithFood();
        dairyProduct.provideNutrients();
        dairyProduct.storeCold();

        DairyProduct dairyProduct1 = new GRB();
        dairyProduct1.consume();
        dairyProduct1.expireQuickly();
        dairyProduct1.mixWithFood();
        dairyProduct1.provideNutrients();
        dairyProduct1.storeCold();

        GRB grb = new GRB();
        grb.mixWithFood();
        grb.expireQuickly();
        grb.provideNutrients();
        grb.storeCold();
        grb.consume();

        System.out.println("---------------------------------------------------------------------");


        FabricSoftener fabricSoftener=new FabricSoftener();
        fabricSoftener.addFragrance();
        fabricSoftener.softenClothes();
        fabricSoftener.enhanceFreshness();
        fabricSoftener.preventStatic();
        fabricSoftener.reduceWrinkles();

        FabricSoftener fabricSoftener1=new Comfort();
        fabricSoftener1.addFragrance();
        fabricSoftener1.softenClothes();
        fabricSoftener1.enhanceFreshness();
        fabricSoftener1.preventStatic();
        fabricSoftener1.reduceWrinkles();

        Comfort comfort = new Comfort();
        comfort.addFragrance();
        comfort.preventStatic();
        comfort.reduceWrinkles();
        comfort.enhanceFreshness();
        comfort.softenClothes();

        System.out.println("-------------------------------------------------------------------------");

        SkincareProduct skincareProduct = new SkincareProduct();
        skincareProduct.absorb();
        skincareProduct.apply();
        skincareProduct.moisturize();
        skincareProduct.protect();
        skincareProduct.soothe();

        SkincareProduct skincareProduct1 = new AloeVeraGel();
        skincareProduct1.absorb();
        skincareProduct1.apply();
        skincareProduct1.moisturize();
        skincareProduct1.protect();
        skincareProduct1.soothe();

        AloeVeraGel aloeVeraGel = new AloeVeraGel();
        aloeVeraGel.absorb();
        aloeVeraGel.moisturize();
        aloeVeraGel.protect();
        aloeVeraGel.soothe();
        aloeVeraGel.apply();

        System.out.println("-------------------------------------------------------------------------");

        InstantFood instantFood = new InstantFood();
        instantFood.addWater();
        instantFood.boil();
        instantFood.openPack();
        instantFood.serve();
        instantFood.stir();

        InstantFood instantFood1 = new Maggi();
        instantFood1.addWater();
        instantFood1.boil();
        instantFood1.openPack();
        instantFood1.serve();
        instantFood1.stir();

        Maggi maggi = new Maggi();
        maggi.addWater();
        maggi.openPack();
        maggi.boil();
        maggi.stir();
        maggi.serve();

        System.out.println("---------------------------------------------------------------------------");

        Toothpaste toothpaste = new Toothpaste();
        toothpaste.cleanTeeth();
        toothpaste.freshenBreath();
        toothpaste.protectGums();
        toothpaste.removePlaque();
        toothpaste.whitenTeeth();

        Toothpaste toothpaste1 = new Colgate();
        toothpaste1.cleanTeeth();
        toothpaste1.freshenBreath();
        toothpaste1.protectGums();
        toothpaste1.removePlaque();
        toothpaste1.whitenTeeth();


        Colgate colgate = new Colgate();
        colgate.cleanTeeth();
        colgate.protectGums();
        colgate.freshenBreath();
        colgate.whitenTeeth();
        colgate.removePlaque();

        System.out.println("------------------------------------------------------------------------");

        Detergent detergent = new Detergent();
        detergent.cleanClothes();
        detergent.dissolve();
        detergent.foamUp();
        detergent.removeStains();
        detergent.smellGood();

        Detergent detergent1 = new SurfExcel();
        detergent1.cleanClothes();
        detergent1.dissolve();
        detergent1.foamUp();
        detergent1.removeStains();
        detergent1.smellGood();

        SurfExcel surfExcel = new SurfExcel();
        surfExcel.cleanClothes();
        surfExcel.foamUp();
        surfExcel.dissolve();
        surfExcel.removeStains();
        surfExcel.smellGood();

        System.out.println("------------------------------------------------------------------------");

        EBook eBook = new EBook();
        eBook.openBook();
        eBook.adjustBrightness();
        eBook.bookmarkPage();
        eBook.searchText();
        eBook.turnPage();

        EBook eBook1 = new Kindle();
        eBook1.openBook();
        eBook1.adjustBrightness();
        eBook1.bookmarkPage();
        eBook1.searchText();
        eBook1.turnPage();

        Kindle kindle = new Kindle();
        kindle.bookmarkPage();
        kindle.openBook();
        kindle.searchText();
        kindle.adjustBrightness();
        kindle.turnPage();

        System.out.println("------------------------------------------------------------------------");

        Antiseptic antiseptic = new Antiseptic();
        antiseptic.coolBurn();
        antiseptic.disinfect();
        antiseptic.healFaster();
        antiseptic.reduceInfection();
        antiseptic.killGerms();

        Antiseptic antiseptic1 = new Dettol();
        antiseptic1.coolBurn();
        antiseptic1.disinfect();
        antiseptic1.healFaster();
        antiseptic1.reduceInfection();
        antiseptic1.killGerms();

        Dettol dettol = new Dettol();
        dettol.coolBurn();
        dettol.healFaster();
        dettol.disinfect();
        dettol.reduceInfection();
        dettol.killGerms();

        System.out.println("--------------------------------------------------------------------------");

        Soap soap = new Soap();
        soap.foam();
        soap.removeStains();
        soap.rinse();
        soap.smellFresh();
        soap.washClothes();

        Soap soap1 = new Rin();
        soap1.foam();
        soap1.removeStains();
        soap1.rinse();
        soap1.smellFresh();
        soap1.washClothes();

        Rin rin = new Rin();
        rin.foam();
        rin.removeStains();
        rin.smellFresh();
        rin.washClothes();
        rin.rinse();

        System.out.println("-------------------------------------------------------------------");

        Speaker speaker = new Speaker();
        speaker.adjustVolume();
        speaker.charge();
        speaker.connectBluetooth();
        speaker.playSound();
        speaker.turnOff();

        Speaker speaker1 = new JBL();
        speaker1.adjustVolume();
        speaker1.charge();
        speaker1.connectBluetooth();
        speaker1.playSound();
        speaker1.turnOff();

        JBL jbl = new JBL();
        jbl.adjustVolume();
        jbl.connectBluetooth();
        jbl.playSound();
        jbl.charge();
        jbl.turnOff();


        System.out.println("-------------------------------------------------------------------------");

        Watches watches = new Watches();
        watches.changeStrap();
        watches.checkBattery();
        watches.setAlarm();
        watches.showDate();
        watches.showDate();

        Watches watches1 = new Titan();
        watches1.changeStrap();
        watches1.checkBattery();
        watches1.setAlarm();
        watches1.showDate();
        watches1.showDate();

        Titan titan = new Titan();
        titan.changeStrap();
        titan.showDate();
        titan.checkBattery();
        titan.setAlarm();
        titan.showTime();

        System.out.println("-------------------------------------------------------------------------");

        Headphones headphones = new Headphones();
        headphones.charge();
        headphones.decreaseVolume();
        headphones.increaseVolume();
        headphones.pauseMusic();
        headphones.playMusic();

        Headphones headphones1 = new Boat();
        headphones1.charge();
        headphones1.decreaseVolume();
        headphones1.increaseVolume();
        headphones1.pauseMusic();
        headphones1.playMusic();

        Boat boat = new Boat();
        boat.increaseVolume();
        boat.decreaseVolume();
        boat.pauseMusic();
        boat.playMusic();
        boat.charge();

        System.out.println("---------------------------------------------------------------------------");

        Juice juice = new Juice();
        juice.drink();
        juice.openCap();
        juice.pour();
        juice.refrigerate();
        juice.shakeWell();

        Juice juice1 = new Real();
        juice1.drink();
        juice1.openCap();
        juice1.pour();
        juice1.refrigerate();
        juice1.shakeWell();

        Real real = new Real();
        real.pour();
        real.openCap();
        real.refrigerate();
        real.shakeWell();
        real.drink();

        System.out.println("--------------------------------------------------------------------------");

        Pen pen = new Pen();
        pen.cap();
        pen.inkFlow();
        pen.refill();
        pen.uncap();
        pen.write();

        Pen pen1 = new Reynolds();
        pen1.cap();
        pen1.inkFlow();
        pen1.refill();
        pen1.uncap();
        pen1.write();

        Reynolds reynolds =new Reynolds();
        reynolds.cap();
        reynolds.refill();
        reynolds.inkFlow();
        reynolds.uncap();
        reynolds.write();

        System.out.println("-----------------------------------------------------------------------");

        Towel towel = new Towel();
        towel.absorb();
        towel.fold();
        towel.hang();
        towel.dry();
        towel.wash();

        Towel towel1 = new CottonTowel();
        towel1.absorb();
        towel1.fold();
        towel1.hang();
        towel1.dry();
        towel1.wash();


        CottonTowel cottonTowel = new CottonTowel();
        cottonTowel.dry();
        cottonTowel.fold();
        cottonTowel.absorb();
        cottonTowel.hang();
        cottonTowel.wash();

        System.out.println("-------------------------------------------------------------------------");

        Television television = new Television();
        television.adjustVolume();
        television.changeChannel();
        television.connectHdmi();
        television.powerOn();
        television.showGuide();

        Television television1 = new LG();
        television1.adjustVolume();
        television1.changeChannel();
        television1.connectHdmi();
        television1.powerOn();
        television1.showGuide();

        LG lg = new LG();
        lg.adjustVolume();
        lg.connectHdmi();
        lg.adjustVolume();
        lg.powerOn();
        lg.showGuide();

        System.out.println("------------------------------------------------------------------------");


        WaterPurifier waterPurifier = new WaterPurifier();
        waterPurifier.filterWater();
        waterPurifier.storeWater();
        waterPurifier.autoShutdown();
        waterPurifier.indicateLevel();
        waterPurifier.removeGerms();

        WaterPurifier waterPurifier1 = new Kent();
        waterPurifier1.filterWater();
        waterPurifier1.storeWater();
        waterPurifier1.autoShutdown();
        waterPurifier1.indicateLevel();
        waterPurifier1.removeGerms();

        Kent kent =new Kent();
        kent.autoShutdown();
        kent.indicateLevel();
        kent.filterWater();
        kent.storeWater();
        kent.removeGerms();

        System.out.println("---------------------------------------------------------------------------");

        Notebook notebook = new Notebook();
        notebook.decorate();
        notebook.label();
        notebook.staplePages();
        notebook.tearPage();
        notebook.writeNotes();

        Notebook notebook1 = new Classmate();
        notebook1.decorate();
        notebook1.label();
        notebook1.staplePages();
        notebook1.tearPage();
        notebook1.writeNotes();

        Classmate classmate = new Classmate();
        classmate.staplePages();
        classmate.label();
        classmate.tearPage();
        classmate.writeNotes();
        classmate.decorate();

        System.out.println("-----------------------------------------------------------------------");

        Fan fan = new Fan();
        fan.changeSpeed();
        fan.cleanBlades();
        fan.rotate();
        fan.swing();
        fan.stop();

        Fan fan1 = new Crompton();
        fan1.changeSpeed();
        fan1.cleanBlades();
        fan1.rotate();
        fan1.swing();
        fan1.stop();

        Crompton crompton = new Crompton();
        crompton.changeSpeed();
        crompton.cleanBlades();
        crompton.swing();
        crompton.stop();
        crompton.rotate();

        System.out.println("------------------------------------------------------------------------");

        Chocolate chocolate = new Chocolate();
        chocolate.bite();
        chocolate.chew();
        chocolate.melt();
        chocolate.share();
        chocolate.unwrap();


        Chocolate chocolate1 = new DairyMilk();
        chocolate1.bite();
        chocolate1.chew();
        chocolate1.melt();
        chocolate1.share();
        chocolate1.unwrap();

        DairyMilk dairyMilk = new DairyMilk();
        dairyMilk.bite();
        dairyMilk.melt();
        dairyMilk.chew();
        dairyMilk.share();
        dairyMilk.unwrap();

        System.out.println("------------------------------------------------------------------------");


        Mouse mouse = new Mouse();
        mouse.click();
        mouse.drag();
        mouse.move();
        mouse.doubleClick();
        mouse.scroll();

        Mouse mouse1 = new WirelessMouse();
        mouse1.click();
        mouse1.drag();
        mouse1.move();
        mouse1.doubleClick();
        mouse1.scroll();

        WirelessMouse wirelessMouse = new WirelessMouse();
        wirelessMouse.click();
        wirelessMouse.drag();
        wirelessMouse.doubleClick();
        wirelessMouse.move();
        wirelessMouse.scroll();

        System.out.println("-------------------------------------------------------------------------");

        Bucket bucket = new Bucket();
        bucket.carry();
        bucket.empty();
        bucket.clean();
        bucket.fillWater();
        bucket.store();

        Bucket bucket1 = new PlasticBucket();
        bucket1.carry();
        bucket1.empty();
        bucket1.clean();
        bucket1.fillWater();
        bucket1.store();

        PlasticBucket plasticBucket = new PlasticBucket();
        plasticBucket.carry();
        plasticBucket.fillWater();
        plasticBucket.empty();
        plasticBucket.store();
        plasticBucket.clean();

        System.out.println("-----------------------------------------------------------------------");

        Pillow pillow = new Pillow();
        pillow.adjust();
        pillow.cover();
        pillow.fluff();
        pillow.restOn();
        pillow.restOn();

        Pillow pillow1 = new SoftPillow();
        pillow1.adjust();
        pillow1.cover();
        pillow1.fluff();
        pillow1.restOn();
        pillow1.restOn();

        SoftPillow softPillow = new SoftPillow();
        softPillow.adjust();
        softPillow.fluff();
        softPillow.cover();
        softPillow.restOn();
        softPillow.wash();

        System.out.println("--------------------------------------------------------------------------");

        Curtain curtain = new Curtain();
        curtain.close();
        curtain.hang();
        curtain.iron();
        curtain.wash();
        curtain.drawOpen();

        Curtain curtain1 = new WindowCurtain();
        curtain1.close();
        curtain1.hang();
        curtain1.iron();
        curtain1.wash();
        curtain1.drawOpen();

        WindowCurtain windowCurtain = new WindowCurtain();
        windowCurtain.hang();
        windowCurtain.drawOpen();
        windowCurtain.close();
        windowCurtain.iron();
        windowCurtain.wash();

        System.out.println("--------------------------------------------------------------------------");

        Comb comb = new Comb();
        comb.clean();
        comb.grip();
        comb.store();
        comb.untangle();
        comb.pack();

        Comb comb1 = new HairComb();
        comb1.clean();
        comb1.grip();
        comb1.store();
        comb1.untangle();
        comb1.pack();

        HairComb hairComb = new HairComb();
        hairComb.pack();
        hairComb.grip();
        hairComb.untangle();
        hairComb.store();
        hairComb.clean();

        System.out.println("----------------------------------------------------------------------");

        Mug mug = new Mug();
        mug.heat();
        mug.pour();
        mug.sip();
        mug.refill();
        mug.clean();

        Mug mug1 = new CoffeeMug();
        mug1.heat();
        mug1.pour();
        mug1.sip();
        mug1.refill();
        mug1.clean();

        CoffeeMug coffeeMug = new CoffeeMug();
        coffeeMug.sip();
        coffeeMug.refill();
        coffeeMug.pour();
        coffeeMug.heat();
        coffeeMug.clean();

        System.out.println("-----------------------------------------------------------------------");

        Oven oven = new Oven();
        oven.defrost();
        oven.bake();
        oven.grill();
        oven.turnOff();
        oven.preheat();

        Oven oven1 = new MicrowaveOven();
        oven1.defrost();
        oven1.bake();
        oven1.grill();
        oven1.turnOff();
        oven1.preheat();


        MicrowaveOven microwaveOven = new MicrowaveOven();
        microwaveOven.bake();
        microwaveOven.defrost();
        microwaveOven.grill();
        microwaveOven.preheat();
        microwaveOven.turnOff();

        Kitchen kitchen = new Kitchen();
        kitchen.cook(oven);
        kitchen.cook(oven1);
        kitchen.cook(microwaveOven);

        System.out.println("---------------------------------------------------------------------------");



    }
}


