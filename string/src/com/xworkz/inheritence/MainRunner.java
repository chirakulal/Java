package com.xworkz.inheritence;

import com.xworkz.inheritence.casting.*;
import com.xworkz.inheritence.casting.Medicines;
import com.xworkz.inheritence.casting.Package;
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

        Government government1 = new Democracy("India", 2024, true);
        government1.provideService();
        government1.conductElections();
        government1.enforceLaws();
        government1.collectTaxes();
        government1.makeLaws();

        Democracy democracy = new Democracy("India", 2024, true);
        democracy.makeLaws();
        democracy.collectTaxes();
        democracy.conductElections();
        democracy.enforceLaws();
        democracy.provideService();
        democracy.holdElection();

        System.out.println("Democracy"+democracy.toString());

        Parliament parliament = new Parliament();
        parliament.election(government);
        parliament.election(government1);
        parliament.election(democracy);

        System.out.println("-----------------------------------------------------");

        Species species = new Species();
        species.alive();
        species.attack();
        species.defend();
        species.move();
        species.speak();

        Species species1 = new Wizard("saji",50,"magic");
        species1.speak();
        species1.move();
        species1.defend();
        species1.attack();
        species1.alive();

        Wizard wizard = new Wizard("saji",50,"magic");
        wizard.alive();
        wizard.attack();
        wizard.move();
        wizard.speak();
        wizard.defend();
        wizard.castSpell();

        System.out.println("Wizard"+wizard.toString());

        Alien alien = new Alien();
        alien.search(species);
        alien.search(species1);
        alien.search(wizard);

        System.out.println("---------------------------------------------");


        Vehicle vehicle = new Vehicle();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.speed();
        vehicle.start();
        vehicle.stop();

        Vehicle vehicle1 = new Truck("panchami",10,60);
        vehicle1.stop();
        vehicle1.start();
        vehicle1.brake();
        vehicle1.accelerate();
        vehicle1.speed();

        Truck truck = new Truck("panchami",10,60);
        truck.wheel();
        truck.brake();
        truck.accelerate();
        truck.speed();
        truck.start();
        truck.stop();

        System.out.println("Truck"+truck.toString());

        Engine engine = new Engine();
        engine.run(vehicle);
        engine.run(vehicle1);
        engine.run(truck);

        System.out.println("-----------------------------------------------------------");



        Hospital hospital = new Hospital();
        hospital.admitPatient();
        hospital.Ambulance();
        hospital.discharge();
        hospital.treat();
        hospital.MedicalCheckup();

        Hospital hospital1 = new GeneralHospital("rama","fever",50);
        hospital1.MedicalCheckup();
        hospital1.treat();
        hospital1.discharge();
        hospital1.Ambulance();
        hospital1.admitPatient();

        GeneralHospital generalHospital = new GeneralHospital("rama","fever",50);
        generalHospital.Emergency();
        generalHospital.admitPatient();
        generalHospital.discharge();
        generalHospital.treat();
        generalHospital.Ambulance();
        generalHospital.MedicalCheckup();

        System.out.println("GeneralHospital - "+generalHospital.toString());

        Medicines medicines = new Medicines();
        medicines.buy(hospital);
        medicines.buy(hospital1);
        medicines.buy(generalHospital);

        System.out.println("--------------------------------------------------------------------------------------");


        Vegetable vegetable = new Vegetable();
        vegetable.grow();
        vegetable.harvest();
        vegetable.nutrients();
        vegetable.pesticide();
        vegetable.water();

        Vegetable vegetable1 = new LeafVeg("Spinach","green",true);
        vegetable1.grow();
        vegetable1.harvest();
        vegetable1.nutrients();
        vegetable1.pesticide();
        vegetable1.water();


        LeafVeg leafVeg = new LeafVeg("Spinach","green",true);
        leafVeg.growAboveGround();
        leafVeg.harvest();
        leafVeg.nutrients();
        leafVeg.water();
        leafVeg.pesticide();
        leafVeg.grow();

        System.out.println("LeafVeg - "+leafVeg.toString());

        Cabbage cabbage = new Cabbage();
        cabbage.peel(vegetable);
        cabbage.peel(vegetable1);
        cabbage.peel(leafVeg);


        System.out.println("-------------------------------------------------------------");



        Education education = new Education();
        education.activity();
        education.certificates();
        education.events();
        education.exams();
        education.teach();

        Education education1 = new School("VMSH","Konaje",500);
        education1.activity();
        education1.certificates();
        education1.events();
        education1.exams();
        education1.teach();

        School school = new  School("VMSH","Konaje",500);
        school.activity();
        school.certificates();
        school.events();
        school.exams();
        school.teach();
        school.play();

        System.out.println("School - "+school.toString());

        University university = new University();
        university.learn(education);
        university.learn(school);
        university.learn(education1);

        System.out.println("--------------------------------------------------------------------------");



        Animal animal = new Animal();
        animal.eat();
        animal.breathe();
        animal.makesound();
        animal.sleep();
        animal.walk();

        Animal animal1 = new Lion("Rani",10,true);
        animal1.eat();
        animal1.breathe();
        animal1.makesound();
        animal1.sleep();
        animal1.walk();

        Lion lion = new Lion("Rani",10,true);
        lion.breathe();
        lion.eat();
        lion.sleep();
        lion.walk();
        lion.makesound();

        System.out.println("Lion - "+lion.toString());

        Carnivores carnivores = new Carnivores();
        carnivores.attack(animal);
        carnivores.attack(animal1);
        carnivores.attack(lion);

        System.out.println("-------------------------------------------------------");


        Shape shape = new Shape();
        shape.color();
        shape.draw();
        shape.move();
        shape.resize();
        shape.rotate();

        Shape shape1 = new Circle("red",10,true);
        shape1.color();
        shape1.draw();
        shape1.move();
        shape1.resize();
        shape1.rotate();

        Circle circle = new Circle("red",10,true);
        circle.color();
        circle.draw();
        circle.move();
        circle.resize();
        circle.rotate();
        System.out.println("Circle - "+circle.toString());

        Rectangle rectangle = new Rectangle();
        rectangle.size(shape);
        rectangle.size(shape1);
        rectangle.size(circle);

        System.out.println("------------------------------------------------------------------------");

        Device device = new Device();
        device.call();
        device.message();
        device.playGames();
        device.track();
        device.videoCall();

        Device device1 = new Phone("Samsung","50000",250);
        device1.videoCall();
        device1.track();
        device1.call();
        device1.message();
        device1.playGames();

        Phone phone = new Phone("Samsung","50000",250);
        phone.call();
        phone.message();
        phone.playGames();
        phone.track();
        phone.videoCall();

        System.out.println("Phone - "+phone.toString());

        Laptops laptops = new Laptops();
        laptops.use(device);
        laptops.use(device1);
        laptops.use(phone);
        System.out.println("---------------------------------------------------------------------------");

        Person person = new Person();
        person.earnMoney();
        person.doJob();
        person.eat();
        person.learn();
        person.sleep();

        Person person1 = new Teacher("radha","maths",15);
        person1.sleep();
        person1.earnMoney();
        person1.eat();
        person1.learn();
        person1.doJob();

        Teacher teacher = new Teacher("radha","maths",15);
        teacher.doJob();
        teacher.earnMoney();
        teacher.eat();
        teacher.learn();
        teacher.sleep();
        teacher.teach();

        System.out.println("Teacher - "+teacher.toString());

        Profession profession = new Profession();
        profession.work(person);
        profession.work(person1);
        profession.work(teacher);

        System.out.println("-------------------------------------------------------------------------");


        Instrument instrument = new Instrument();
        instrument.cords();
        instrument.keys();
        instrument.play();
        instrument.strings();

        Instrument instrument1 = new Guiter("Fender", 6, true);
        instrument1.cords();
        instrument1.play();
        instrument1.keys();
        instrument1.strings();

        Guiter guiter = new Guiter("Fender", 6, true);
        guiter.cords();
        guiter.play();
        guiter.strings();
        guiter.keys();

        System.out.println("Guiter - "+guiter.toString());

        Piano piano = new Piano();
        piano.music(instrument);
        piano.music(instrument1);
        piano.music(guiter);


        System.out.println("-------------------------------------------------------------------");

        Bag bag = new Bag();
        bag.closeZip();
        bag.keepThings();
        bag.openZip();
        bag.size();
        bag.toStore();

        Bag bag1 = new SchoolBag("skybag","red",4);
        bag1.toStore();
        bag1.size();
        bag1.keepThings();
        bag1.closeZip();
        bag1.openZip();

        SchoolBag schoolBag = new SchoolBag("skybag","red",4);
        schoolBag.closeZip();
        schoolBag.keepThings();
        schoolBag.size();
        schoolBag.openZip();
        schoolBag.toStore();

        System.out.println("SchoolBag - "+schoolBag.toString());

        OfficeBag officeBag = new OfficeBag();
        officeBag.buy(bag);
        officeBag.buy(bag1);
        officeBag.buy(schoolBag);

        System.out.println("------------------------------------------------------------------------");


        Book book = new Book();
        book.edit();
        book.publish();
        book.read();
        book.rewrite();
        book.write();

        Book book1 = new Novel("Secret","thushara",50);
        book1.write();
        book1.read();
        book1.publish();
        book1.edit();
        book1.rewrite();

        Novel novel = new Novel("Secret","thushara",50);
        novel.edit();
        novel.publish();
        novel.rewrite();
        novel.write();
        novel.read();

        System.out.println("Novel - "+novel.toString());
        OnlineNovel onlineNovel = new OnlineNovel();
        onlineNovel.buy(book);
        onlineNovel.buy(book1);
        onlineNovel.buy(novel);

        System.out.println("----------------------------------------------------------------------");

        Bank bank = new Bank();
        bank.balance();
        bank.deposit();
        bank.sendmsg();
        bank.save();
        bank.withdraw();

        Bank bank1 = new Account("5463828320","tanvi",60000);
        bank1.withdraw();
        bank1.save();
        bank1.sendmsg();
        bank1.deposit();
        bank1.balance();

        Account account = new Account("5463828320","tanvi",60000);
        account.balance();
        account.save();
        account.deposit();
        account.withdraw();
        account.sendmsg();

        System.out.println("Account - "+account.toString());

        Loan loan = new Loan();
        loan.pay(bank);
        loan.pay(bank1);
        loan.pay(account);


        System.out.println("------------------------------------------------------------------------");


        Appliance appliance = new Appliance();
        appliance.condenser();
        appliance.cool();
        appliance.heat();
        appliance.runThroughElectric();
        appliance.storethings();

        Appliance appliance1 = new Refrigerator("Lg",500,true);
        appliance1.storethings();
        appliance1.heat();
        appliance1.runThroughElectric();
        appliance1.condenser();
        appliance1.cool();

        Refrigerator refrigerator = new Refrigerator("Lg",500,true);
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

        Building building1 = new House("bangaluru",10,false);
        building1.bhk();
        building1.blocks();
        building1.floor();
        building1.rooms();
        building1.security();


        House house = new House("bangaluru",10,false);
        house.bhk();
        house.blocks();
        house.rooms();
        house.security();
        house.floor();

        Rent rent = new Rent();
        rent.sell(building);
        rent.sell(building1);
        rent.sell(house);

        System.out.println("-------------------------------------------------------------------");

        Furniture furniture = new Furniture();
        furniture.sit();
        furniture.design();
        furniture.showcase();
        furniture.tostore();
        furniture.sleep();

        Furniture furniture1 = new Chair("wood","brown",true);
        furniture1.sleep();
        furniture1.sit();
        furniture1.tostore();
        furniture.design();
        furniture1.showcase();

        Chair chair = new Chair("wood","brown",true);
        chair.sit();
        chair.design();
        chair.showcase();
        chair.sleep();
        chair.tostore();

        Sofa sofa = new Sofa();
        sofa.order(furniture);
        sofa.order(furniture1);
        sofa.order(chair);

        System.out.println("-----------------------------------------------------------------");

        Bird bird = new Bird();
        bird.eat();
        bird.fly();
        bird.searchFood();
        bird.sing();
        bird.eat();

        Bird bird1 = new Parrot("ravi","green",false);
        bird1.eat();
        bird1.fly();
        bird1.searchFood();
        bird1.sing();
        bird1.eat();

        Parrot parrot = new Parrot("ravi","green",false);
        parrot.eat();
        parrot.fly();
        parrot.searchFood();
        parrot.sleep();
        parrot.sing();

        Pigeon pigeon = new Pigeon();
        pigeon.passMsg(bird);
        pigeon.passMsg(bird1);
        pigeon.passMsg(parrot);




        System.out.println("-------------------------------------------------------------------");

        Food food = new Food();
        food.addsalt();
        food.eat();
        food.addSpinach();
        food.empty();
        food.ingredients();

        Food food1 = new Pizza("Large", "Paneer", true);
        food1.eat();
        food1.addSpinach();
        food1.empty();
        food1.ingredients();
        food1.addsalt();

        Pizza pizza = new Pizza("Large", "Paneer", true);
        pizza.addsalt();
        pizza.addSpinach();
        pizza.empty();
        pizza.eat();
        pizza.ingredients();

        System.out.println("Pizza - "+pizza.toString());

        Burger burger = new Burger();
        burger.fry(food);
        burger.fry(food1);
        burger.fry(pizza);


        System.out.println("--------------------------------------------------------------------");


        Cloth cloth = new Cloth();
        cloth.clean();
        cloth.iron();
        cloth.stitch();
        cloth.tore();
        cloth.wear();

        Cloth cloth1 = new Shirt("XL","blue",true);
        cloth1.clean();
        cloth1.iron();
        cloth1.stitch();
        cloth1.tore();
        cloth1.wear();

        Shirt shirt = new Shirt("XL","blue",true);
        shirt.clean();
        shirt.iron();
        shirt.stitch();
        shirt.wear();
        shirt.tore();

        System.out.println("Shirt - "+shirt.toString());

        Tshirt tshirt = new Tshirt();
        tshirt.dry(cloth);
        tshirt.dry(cloth1);
        tshirt.dry(shirt);

        System.out.println("---------------------------------------------------------------------");


        Container container = new Container();
        container.capacity();
        container.color();
        container.empty();
        container.fill();
        container.size();

        Container container1 = new Bottel("plastic",500,false);
        container1.capacity();
        container1.color();
        container1.empty();
        container1.fill();
        container1.size();

        Bottel bottel = new Bottel("plastic",500,false);
        bottel.capacity();
        bottel.empty();
        bottel.fill();
        bottel.color();
        bottel.size();

        System.out.println("Bottle - "+ bottel.toString());

        Box box = new Box();
        box.open(container);
        box.open(container1);
        box.open(bottel);


        System.out.println("---------------------------------------------------------------------");

        Employee employee = new Employee();
        employee.department();
        employee.eat();
        employee.salary();
        employee.work();
        employee.timepass();

        Employee employee1 = new Manager("tina","finance",10);
        employee1.department();
        employee1.eat();
        employee1.salary();
        employee1.work();
        employee1.timepass();

        Manager manager = new Manager("tina","finance",10);
        manager.department();
        manager.salary();
        manager.work();
        manager.timepass();
        manager.eat();

        System.out.println("Manager - "+manager.toString());

        TeamLeader teamLeader = new TeamLeader();
        teamLeader.check(employee);
        teamLeader.check(employee1);
        teamLeader.check(manager);


        System.out.println("----------------------------------------------------------------------------");


        Toy toy = new Toy();
        toy.clean();
        toy.throwToy();
        toy.shake();
        toy.squeeze();
        toy.store();

        Toy toy1 = new TeddyBear("rocky","black","30cm");
        toy1.clean();
        toy1.throwToy();
        toy1.shake();
        toy1.squeeze();
        toy1.store();

        TeddyBear teddyBear = new TeddyBear("rocky","black","30cm");
        teddyBear.clean();
        teddyBear.squeeze();
        teddyBear.shake();
        teddyBear.store();
        teddyBear.throwToy();

        System.out.println("TeddyBear - "+teddyBear.toString());

        Doll doll = new Doll();
        doll.purchase(toy);
        doll.purchase(toy1);
        doll.purchase(teddyBear);


        System.out.println("------------------------------------------------------------------------");


        NetworkDevice networkDevice = new NetworkDevice();
        networkDevice.connect();
        networkDevice.disconnect();
        networkDevice.receiveData();
        networkDevice.transmitData();
        networkDevice.reboot();

        NetworkDevice networkDevice1 = new Router("TP-Link", 1200, true);
        networkDevice1.connect();
        networkDevice1.disconnect();
        networkDevice1.receiveData();
        networkDevice1.transmitData();
        networkDevice1.reboot();

        Router router = new Router("TP-Link", 1200, true);
        router.connect();
        router.reboot();
        router.disconnect();
        router.transmitData();
        router.receiveData();

        System.out.println("ROuter - "+router.toString());

        Package packages = new Package();
        packages.data(networkDevice);
        packages.data(networkDevice1);
        packages.data(router);

        System.out.println("------------------------------------------------------------------------");

        Drawing drawing = new Drawing();
        drawing.clean();
        drawing.colourFull();
        drawing.dry();
        drawing.use();
        drawing.dipInPaint();

        Drawing drawing1 = new PaintBrush("Camlin", 5, true);
        drawing1.clean();
        drawing1.colourFull();
        drawing1.dry();
        drawing1.use();
        drawing1.dipInPaint();

        PaintBrush paintBrush = new PaintBrush("Camlin", 5, true);
        paintBrush.dipInPaint();
        paintBrush.dry();
        paintBrush.use();
        paintBrush.colourFull();
        paintBrush.clean();

        System.out.println("PaintBrush - "+paintBrush.toString());

        Sketch sketch = new Sketch();
        sketch.draw(drawing);
        sketch.draw(drawing1);
        sketch.draw(paintBrush);



        System.out.println("--------------------------------------------------------------------");

        Medicine medicine = new Medicine();
        medicine.checkExpiry();
        medicine.consume();
        medicine.measureDosage();
        medicine.prescribe();
        medicine.storeProperly();

        Medicine medicine1 = new Antibiotic("Amoxicillin", 500, true);
        medicine1.checkExpiry();
        medicine1.consume();
        medicine1.measureDosage();
        medicine1.prescribe();
        medicine1.storeProperly();


        Antibiotic antibiotic = new Antibiotic("Amoxicillin", 500, true);
        antibiotic.checkExpiry();
        antibiotic.measureDosage();
        antibiotic.consume();
        antibiotic.storeProperly();
        antibiotic.prescribe();

        System.out.println("Antibiotic - "+antibiotic.toString());

        Injection injection = new Injection();
        injection.inject(medicine);
        injection.inject(medicine1);
        injection.inject(antibiotic);



        System.out.println("---------------------------------------------------------------------");

        Game game = new Game();
        game.end();
        game.pause();
        game.reset();
        game.saveProgress();
        game.start();


        Game game1 = new Chess(2, "8x8", true);
        game1.end();
        game1.pause();
        game1.reset();
        game1.saveProgress();
        game1.start();


        Chess chess = new Chess(2, "8x8", true);
        chess.end();
        chess.reset();
        chess.pause();
        chess.saveProgress();
        chess.start();

        System.out.println("Chess - "+chess.toString());

        System.out.println("-----------------------------------------------------------------------");

        Weapon weapon = new Weapon();
        weapon.sharpen();
        weapon.attack();
        weapon.defend();
        weapon.equip();
        weapon.storeSafely();

        Weapon weapon1 = new Sword("Steel", 90, true);
        weapon1.sharpen();
        weapon1.attack();
        weapon1.defend();
        weapon1.equip();
        weapon1.storeSafely();

        Sword sword = new Sword("Steel", 90, true);
        sword.attack();
        sword.equip();
        sword.defend();
        sword.sharpen();
        sword.storeSafely();

        System.out.println("Sword - "+sword.toString());

        Knife knife = new Knife();
        knife.cut(weapon);
        knife.cut(weapon);
        knife.cut(sword);

        System.out.println("------------------------------------------------------------------------");

        StorageDevice storageDevice = new StorageDevice();
        storageDevice.checkHealth();
        storageDevice.eject();
        storageDevice.format();
        storageDevice.readData();
        storageDevice.writeData();

        StorageDevice storageDevice1 = new HardDisk("1TB", "SSD", true);
        storageDevice1.checkHealth();
        storageDevice1.eject();
        storageDevice1.format();
        storageDevice1.readData();
        storageDevice1.writeData();

        HardDisk hardDisk = new HardDisk("1TB", "SSD", true);
        hardDisk.checkHealth();
        hardDisk.format();
        hardDisk.eject();
        hardDisk.readData();
        hardDisk.writeData();

        System.out.println("HardDisk - "+hardDisk.toString());

        CD cd = new CD();
        cd.read(storageDevice);
        cd.read(storageDevice1);
        cd.read(hardDisk);


        System.out.println("------------------------------------------------------------------------");

        Timepiece timepiece = new Timepiece();
        timepiece.adjustTime();
        timepiece.checkBattery();
        timepiece.displayTime();
        timepiece.setAlarm();
        timepiece.startTimer();

        Timepiece timepiece1 = new Watch("Casio", true, true);
        timepiece1.adjustTime();
        timepiece1.checkBattery();
        timepiece1.displayTime();
        timepiece1.setAlarm();
        timepiece1.startTimer();

        Watch watch = new Watch("Casio", true, true);
        watch.adjustTime();
        watch.checkBattery();
        watch.displayTime();
        watch.setAlarm();
        watch.startTimer();

        System.out.println("Watch  - "+watch.toString());

        Compass compass = new Compass();
        compass.direction(timepiece);
        compass.direction(timepiece1);
        compass.direction(watch);
        System.out.println("------------------------------------------------------------------------");


        Tree tree = new Tree();
        tree.bearFruit();
        tree.grow();
        tree.photosynthesize();
        tree.provideOxygen();
        tree.shedLeaves();

        Tree tree1 = new OakTree(50, 20.5, true);
        tree1.bearFruit();
        tree1.grow();
        tree1.photosynthesize();
        tree1.provideOxygen();
        tree1.shedLeaves();


        OakTree oakTree = new OakTree(50, 20.5, true);
        oakTree.bearFruit();
        oakTree.photosynthesize();
        oakTree.grow();
        oakTree.provideOxygen();
        oakTree.shedLeaves();

        System.out.println("OakTree - "+oakTree.toString());

        AppleTree appleTree = new AppleTree();
        appleTree.plant(tree);
        appleTree.plant(tree1);
        appleTree.plant(oakTree);

        System.out.println("-----------------------------------------------------------------------");

        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.makePayment();
        paymentMethod.validatePayment();
        paymentMethod.addFunds();
        paymentMethod.checkBalance();
        paymentMethod.viewTransactions();

        PaymentMethod paymentMethod1 = new CreditCard("1234-5678-9012-3456", "John Doe", 50000.00);
        paymentMethod1.makePayment();
        paymentMethod1.validatePayment();
        paymentMethod1.addFunds();
        paymentMethod1.checkBalance();
        paymentMethod1.viewTransactions();


        CreditCard creditCard = new CreditCard("1234-5678-9012-3456", "John Doe", 50000.00);
        creditCard.addFunds();
        creditCard.checkBalance();
        creditCard.makePayment();
        creditCard.validatePayment();
        creditCard.viewTransactions();

        System.out.println("CreditCard - "+creditCard.toString());

        DebitCard debitCard =new DebitCard();
        debitCard.pay(paymentMethod);
        debitCard.pay(paymentMethod1);
        debitCard.pay(creditCard);


        System.out.println("-----------------------------------------------------------------------");


        Computer computer = new Computer();
        computer.bootUp();
        computer.connectToInternet();
        computer.processTask();
        computer.shutDown();
        computer.updateSoftware();

        Computer computer1 = new Laptop("HP", 16, true);
        computer1.bootUp();
        computer1.connectToInternet();
        computer1.processTask();
        computer1.shutDown();
        computer1.updateSoftware();

        Laptop laptop = new Laptop("HP", 16, true);
        laptop.bootUp();
        laptop.processTask();
        laptop.connectToInternet();
        laptop.updateSoftware();
        laptop.shutDown();

        System.out.println("Laptop - "+laptop.toString());

        Desktop desktop = new Desktop();
        desktop.stand(computer1);
        desktop.stand(computer);
        desktop.stand(laptop);


        System.out.println("-------------------------------------------------------------------------");


        Camera camera = new Camera();
        camera.adjustFocus();
        camera.capturePhoto();
        camera.changeLens();
        camera.viewGallery();
        camera.recordVideo();

        Camera camera1 = new DSLR("Canon", 24, true);
        camera1.adjustFocus();
        camera1.capturePhoto();
        camera1.changeLens();
        camera1.viewGallery();
        camera1.recordVideo();

        DSLR dslr = new DSLR("Canon", 24, true);
        dslr.adjustFocus();
        dslr.capturePhoto();
        dslr.recordVideo();
        dslr.changeLens();
        dslr.viewGallery();

        System.out.println("DSLR - "+dslr.toString());

        Canon canon = new Canon();
        canon.capture(camera);
        canon.capture(camera1);
        canon.capture(dslr);


        System.out.println("-------------------------------------------------------------------------");


        Tool tool = new Tool();
        tool.checkDurability();
        tool.maintain();
        tool.repair();
        tool.use();
        tool.storeSafely();

        Tool tool1 = new Hammer("Steel", 1.5, true);
        tool1.checkDurability();
        tool1.maintain();
        tool1.repair();
        tool1.use();
        tool1.storeSafely();

        Hammer hammer = new Hammer("Steel", 1.5, true);
        hammer.checkDurability();
        hammer.repair();
        hammer.maintain();
        hammer.storeSafely();
        hammer.use();

        System.out.println("Hammer - "+hammer.toString());

        Axe axe = new Axe();
        axe.cut(tool);
        axe.cut(tool1);
        axe.cut(hammer);

        System.out.println("------------------------------------------------------------------------");

        Clock clock = new Clock();
        clock.resetClock();
        clock.stopClock();
        clock.setAlarm();
        clock.tick();
        clock.showTime();


        Clock clock1 = new DigitalClock("Sony", "24-hour", true);
        clock1.resetClock();
        clock1.stopClock();
        clock1.setAlarm();
        clock1.tick();
        clock1.showTime();

        DigitalClock digitalClock = new DigitalClock("Sony", "24-hour", true);
        digitalClock.resetClock();
        digitalClock.showTime();
        digitalClock.stopClock();
        digitalClock.tick();
        digitalClock.setAlarm();

        System.out.println("DigitalClock - "+digitalClock.toString());

        System.out.println("----------------------------------------------------------------------");

        Sport sport = new Sport();
        sport.followRules();
        sport.lose();
        sport.play();
        sport.win();
        sport.practice();

        Sport sport1 = new FootBall("Adidas", 5, true);
        sport1.followRules();
        sport1.lose();
        sport1.play();
        sport1.win();
        sport1.practice();

        FootBall footBall = new FootBall("Adidas", 5, true);
        footBall.followRules();
        footBall.lose();
        footBall.win();
        footBall.play();
        footBall.practice();

        System.out.println("FootBall - "+footBall.toString());

        Hockey hockey = new Hockey();
        hockey.useStick(sport);
        hockey.useStick(sport1);
        hockey.useStick(footBall);

        System.out.println("-----------------------------------------------------------------------");


        Beverage beverage = new Beverage();
        beverage.addSugar();
        beverage.drink();
        beverage.checkTemperature();
        beverage.serve();
        beverage.prepare();

        Beverage beverage1 = new Coffee("Latte", "Medium", true);
        beverage1.addSugar();
        beverage1.drink();
        beverage1.checkTemperature();
        beverage1.serve();
        beverage1.prepare();

        Coffee coffee = new Coffee("Latte", "Medium", true);
        coffee.addSugar();
        coffee.checkTemperature();
        coffee.drink();
        coffee.prepare();
        coffee.serve();

        System.out.println("Coffee - "+coffee.toString());

        Tea tea = new Tea();
        tea.addLeaves(beverage);
        tea.addLeaves(beverage1);
        tea.addLeaves(coffee);


        System.out.println("----------------------------------------------------------------------");

        Planet planet = new Planet();
        planet.experienceSeasons();
        planet.revolve();
        planet.maintainGravity();
        planet.rotate();
        planet.supportLife();

        Planet planet1 = new Earth(6371.0, true, 7);
        planet1.experienceSeasons();
        planet1.revolve();
        planet1.maintainGravity();
        planet1.rotate();
        planet1.supportLife();

        Earth earth = new Earth(6371.0, true, 7);
        earth.experienceSeasons();
        earth.maintainGravity();
        earth.revolve();
        earth.rotate();
        earth.supportLife();

        System.out.println("Earth - "+earth.toString());

        Mars mars = new Mars();
        mars.searchWater(planet);
        mars.searchWater(planet1);
        mars.searchWater(earth);
        System.out.println("-------------------------------------------------------------------------");


        Gadget gadget = new Gadget();
        gadget.charge();
        gadget.connectToWiFi();
        gadget.turnOff();
        gadget.turnOn();
        gadget.updateSoftware();

        Gadget gadget1 = new Smartphone("Samsung", 128, true);
        gadget1.charge();
        gadget1.connectToWiFi();
        gadget1.turnOff();
        gadget1.turnOn();
        gadget1.updateSoftware();


        Smartphone smartphone = new Smartphone("Samsung", 128, true);
        smartphone.charge();
        smartphone.connectToWiFi();
        smartphone.turnOff();
        smartphone.turnOn();
        smartphone.updateSoftware();

        System.out.println("SmartPhone - "+smartphone.toString());

        System.out.println("------------------------------------------------------------------------");

        Currency currency = new Currency();
        currency.calculateValue();
        currency.exchange();
        currency.storeValue();
        currency.transfer();
        currency.useForTransactions();

        Currency currency1 = new DigitalCurrency("Bitcoin", 65000.50, true);
        currency1.calculateValue();
        currency1.exchange();
        currency1.storeValue();
        currency1.transfer();
        currency1.useForTransactions();

        DigitalCurrency digitalCurrency = new DigitalCurrency("Bitcoin", 65000.50, true);
        digitalCurrency.calculateValue();
        digitalCurrency.storeValue();
        digitalCurrency.transfer();
        digitalCurrency.exchange();
        digitalCurrency.useForTransactions();

        System.out.println("DigitalCurrency -"+digitalCurrency.toString());

        System.out.println("------------------------------------------------------------------------");


        Light light = new Light();
        light.emitLight();
        light.adjustBrightness();
        light.saveEnergy();
        light.turnOff();
        light.turnOn();


        Light light1 = new LEDBulb(12, 3000, true);
        light1.emitLight();
        light1.adjustBrightness();
        light1.saveEnergy();
        light1.turnOff();
        light1.turnOn();

        LEDBulb ledBulb = new LEDBulb(12, 3000, true);
        ledBulb.adjustBrightness();
        ledBulb.saveEnergy();
        ledBulb.emitLight();
        ledBulb.turnOff();
        ledBulb.turnOn();

        System.out.println("LEDBulb - "+ledBulb.toString());

        TubeLight tubeLight = new TubeLight();
        tubeLight.On(light);
        tubeLight.On(light1);
        tubeLight.On(ledBulb);

        System.out.println("------------------------------------------------------------------------");


        Flower flower = new Flower();
        flower.absorbSunlight();
        flower.bloom();
        flower.attractBees();
        flower.releaseFragrance();
        flower.provideNectar();

        Flower flower1 = new Rose("Red", 32, true);
        flower1.absorbSunlight();
        flower1.bloom();
        flower1.attractBees();
        flower1.releaseFragrance();
        flower1.provideNectar();

        Rose rose = new Rose("Red", 32, true);
        rose.absorbSunlight();
        rose.attractBees();
        rose.provideNectar();
        rose.releaseFragrance();
        rose.bloom();

        System.out.println("Rose - "+rose.toString());

        RosePlant rosePlant = new RosePlant();
        rosePlant.plant(flower);
        rosePlant.plant(flower1);
        rosePlant.plant(rose);

        System.out.println("------------------------------------------------------------------------");


        Fish fish = new Fish();
        fish.breatheUnderwater();
        fish.camouflage();
        fish.eatPlankton();
        fish.layEggs();
        fish.swim();

        Fish fish1= new Shark("Great White", 6.4, true);
        fish1.breatheUnderwater();
        fish1.camouflage();
        fish1.eatPlankton();
        fish1.layEggs();
        fish1.swim();


        Shark shark = new Shark("Great White", 6.4, true);
        shark.breatheUnderwater();
        shark.eatPlankton();
        shark.camouflage();
        shark.layEggs();
        shark.swim();

        System.out.println("Shark - "+shark.toString());

        Dolphine dolphine = new Dolphine();
        dolphine.swim(fish);
        dolphine.swim(fish1);
        dolphine.swim(shark);


        System.out.println("-----------------------------------------------------------------------");


        Mountain mountain = new Mountain();
        mountain.attractTourists();
        mountain.provideResources();
        mountain.standTall();
        mountain.experienceWeatherChanges();
        mountain.supportEcosystem();

        Mountain mountain1 = new Everest(8848.86, "Nepal", true);
        mountain1.attractTourists();
        mountain1.provideResources();
        mountain1.standTall();
        mountain1.experienceWeatherChanges();
        mountain1.supportEcosystem();

        Everest everest = new Everest(8848.86, "Nepal", true);
        everest.attractTourists();
        everest.provideResources();
        everest.supportEcosystem();
        everest.experienceWeatherChanges();
        everest.standTall();

        System.out.println("Everest  - "+everest.toString());

        Hiking hiking = new Hiking();
        hiking.climb(mountain);
        hiking.climb(mountain1);
        hiking.climb(everest);

        System.out.println("---------------------------------------------------------------------------");

        Reptile reptile = new Reptile();
        reptile.camouflage();
        reptile.crawl();
        reptile.hibernate();
        reptile.hunt();
        reptile.shedSkin();

        Reptile reptile1 = new Snake("Cobra", 1.8, true);
        reptile1.camouflage();
        reptile1.crawl();
        reptile1.hibernate();
        reptile1.hunt();
        reptile1.shedSkin();

        Snake snake = new Snake("Cobra", 1.8, true);
        snake.camouflage();
        snake.crawl();
        snake.hibernate();
        snake.hunt();
        snake.shedSkin();

        System.out.println("Snake - "+snake.toString());

        System.out.println("---------------------------------------------------------------------------");

        Newspaper newspaper = new Newspaper();
        newspaper.advertise();
        newspaper.distribute();
        newspaper.printNews();
        newspaper.provideInformation();
        newspaper.updateDaily();

        Newspaper newspaper1 = new Magazine("National Geographic", 152, true);
        newspaper1.advertise();
        newspaper1.distribute();
        newspaper1.printNews();
        newspaper1.provideInformation();
        newspaper1.updateDaily();

        Magazine magazine = new Magazine("National Geographic", 152, true);
        magazine.advertise();
        magazine.distribute();
        magazine.printNews();
        magazine.provideInformation();
        magazine.updateDaily();

        System.out.println("Magazine - "+magazine.toString());

        Article article = new Article();
        article.edit(newspaper);
        article.edit(newspaper1);
        article.edit(magazine);

        System.out.println("---------------------------------------------------------------------------");

        Gemstone gemstone = new Gemstone();
        gemstone.cut();
        gemstone.embedInJewelry();
        gemstone.polish();
        gemstone.sell();
        gemstone.shine();

        Gemstone gemstone1 = new Diamond(1.5, "D", true);
        gemstone1.cut();
        gemstone1.embedInJewelry();
        gemstone1.polish();
        gemstone1.sell();
        gemstone1.shine();

        Diamond diamond = new Diamond(1.5, "D", true);
        diamond.cut();
        diamond.embedInJewelry();
        diamond.polish();
        diamond.sell();
        diamond.shine();

        System.out.println("Diamond - "+diamond.toString());

        Gold gold = new Gold();
        gold.purchase(gemstone);
        gold.purchase(gemstone1);
        gold.purchase(diamond);

        System.out.println("------------------------------------------------------------------------------");

        Document document = new Document();
        document.open();
        document.print();
        document.read();
        document.save();
        document.write();

        Document document1 = new Books("The Alchemist", "Paulo Coelho", 208);
        document1.open();
        document1.print();
        document1.read();
        document1.save();
        document1.write();

        Books books = new Books("The Alchemist", "Paulo Coelho", 208);
        books.open();
        books.print();
        books.read();
        books.save();
        books.write();

        System.out.println("Books  - "+books.toString());

        Report report = new Report();
        report.check(document);
        report.check(document1);
        report.check(books);

        System.out.println("------------------------------------------------------------------------");


        Insect insect = new Insect();
        insect.crawl();
        insect.feed();
        insect.fly();
        insect.reproduce();
        insect.undergoMetamorphosis();

        Insect insect1 = new Butterfly("Monarch", "Orange and Black", 9.5);
        insect1.crawl();
        insect1.feed();
        insect1.fly();
        insect1.reproduce();
        insect1.undergoMetamorphosis();

        Butterfly butterfly = new Butterfly("Monarch", "Orange and Black", 9.5);
        butterfly.crawl();
        butterfly.feed();
        butterfly.reproduce();
        butterfly.undergoMetamorphosis();
        butterfly.fly();

        System.out.println("Butterfly - "+butterfly.toString());

        HoneyBee honeyBee = new HoneyBee();
        honeyBee.formBee(insect);
        honeyBee.formBee(insect1);
        honeyBee.formBee(butterfly);

        System.out.println("--------------------------------------------------------------------------");

        Jewel jewel = new Jewel();
        jewel.polish();
        jewel.sell();
        jewel.shine();
        jewel.store();
        jewel.wear();

        Jewel jewel1 = new Necklace("Gold", 45.0, true);
        jewel1.polish();
        jewel1.sell();
        jewel1.shine();
        jewel1.store();
        jewel1.wear();

        Necklace necklace = new Necklace("Gold", 45.0, true);
        necklace.polish();
        necklace.sell();
        necklace.shine();
        necklace.store();
        necklace.wear();

        System.out.println("Necklace - "+necklace.toString());

        Earring earring = new Earring();
        earring.buy(jewel);
        earring.buy(jewel1);
        earring.buy(necklace);

        System.out.println("------------------------------------------------------------------------");

        Language language = new Language();
        language.learn();
        language.read();
        language.speak();
        language.translate();
        language.write();

        Language language1 = new English("Advanced", "British", true);
        language1.learn();
        language1.read();
        language1.speak();
        language1.translate();
        language1.write();

        English english = new English("Advanced", "British", true);
        english.learn();
        english.read();
        english.translate();
        english.write();
        english.speak();

        System.out.println("English - "+english.toString());

        Kannada kannada = new Kannada();
        kannada.talk(language);
        kannada.talk(language1);
        kannada.talk(english);

        System.out.println("---------------------------------------------------------------------");


        Software software = new Software();
        software.configure();
        software.run();
        software.install();
        software.uninstall();
        software.update();

        Software software1 = new OperatingSystem("Linux", "Ubuntu 22.04", true);
        software1.configure();
        software1.run();
        software1.install();
        software1.uninstall();
        software1.update();

        OperatingSystem operatingSystem = new OperatingSystem("Linux", "Ubuntu 22.04", true);
        operatingSystem.configure();
        operatingSystem.run();
        operatingSystem.uninstall();
        operatingSystem.install();
        operatingSystem.update();

        System.out.println("OperatingSystem - "+operatingSystem.toString());

        System.out.println("-------------------------------------------------------------------------");


        Browser browser = new Browser();
        browser.close();
        browser.extensions();
        browser.open();
        browser.incognitoMode();
        browser.navigate();

        Browser browser1 = new FireFox("124.0.2", true, 5);
        browser1.close();
        browser1.extensions();
        browser1.open();
        browser1.incognitoMode();
        browser1.navigate();


        FireFox fireFox = new FireFox("124.0.2", true, 5);
        fireFox.close();
        fireFox.extensions();
        fireFox.incognitoMode();
        fireFox.open();
        fireFox.navigate();

        System.out.println("FireFox  - "+fireFox.toString());

        System.out.println("----------------------------------------------------------------------");

        Restaurant restaurant = new Restaurant();
        restaurant.addIngredients();
        restaurant.addsalt();
        restaurant.clean();
        restaurant.cook();
        restaurant.taste();

        Restaurant restaurant1 = new Chef("Gordon Ramsay", "British Cuisine", 25);
        restaurant1.addIngredients();
        restaurant1.addsalt();
        restaurant1.clean();
        restaurant1.cook();
        restaurant1.taste();

        Chef  chef = new Chef("Gordon Ramsay", "British Cuisine", 25);
        chef.addIngredients();
        chef.cook();
        chef.taste();
        chef.addsalt();
        chef.clean();

        System.out.println("Chef - " +chef.toString());

        System.out.println("----------------------------------------------------------------------");


        Festival festival = new Festival();
        festival.celebrate();
        festival.decorate();
        festival.enjoyMusic();
        festival.feast();
        festival.gatherPeople();

        Festival festival1 = new Deepavali("2025-10-20", true, 108);
        festival1.celebrate();
        festival1.decorate();
        festival1.enjoyMusic();
        festival1.feast();
        festival1.gatherPeople();

        Deepavali deepavali = new Deepavali("2025-10-20", true, 108);
        deepavali.celebrate();
        deepavali.enjoyMusic();
        deepavali.decorate();
        deepavali.feast();
        deepavali.gatherPeople();

        System.out.println("Deepavali - "+deepavali.toString());

        System.out.println("-------------------------------------------------------------------------");

        Shampoo shampoo = new Shampoo();
        shampoo.apply();
        shampoo.rub();
        shampoo.clean();
        shampoo.rinse();
        shampoo.wash();

        Shampoo shampoo1 = new CleanicPlus("Disinfectant Spray", 500, true);
        shampoo1.apply();
        shampoo1.rub();
        shampoo1.clean();
        shampoo1.rinse();
        shampoo1.wash();

        CleanicPlus cleanicPlus = new CleanicPlus("Disinfectant Spray", 500, true);
        cleanicPlus.apply();
        cleanicPlus.rub();
        cleanicPlus.rinse();
        cleanicPlus.wash();
        cleanicPlus.clean();

        System.out.println("CleanicPlus - "+cleanicPlus.toString());

        System.out.println("-----------------------------------------------------------------------");


        AudioDevice audioDevice = new AudioDevice();
        audioDevice.beats();
        audioDevice.call();
        audioDevice.listen();
        audioDevice.music();
        audioDevice.play();

        AudioDevice audioDevice1 = new Earphone("Sony", true, 24);
        audioDevice1.beats();
        audioDevice1.call();
        audioDevice1.listen();
        audioDevice1.music();
        audioDevice1.play();

        Earphone earphone = new Earphone("Sony", true, 24);
        earphone.beats();
        earphone.listen();
        earphone.call();
        earphone.music();
        earphone.play();

        System.out.println("Earphone - "+earphone.toString());

        System.out.println("-----------------------------------------------------------------------");

        Bus bus = new Bus();
        bus.pass();
        bus.seat();
        bus.reserved();
        bus.stand();
        bus.ticket();

        Bus bus1 = new MaheshBus("MH102", "Chennai to Coimbatore", 50);
        bus1.pass();
        bus1.seat();
        bus1.reserved();
        bus1.stand();
        bus1.ticket();

        MaheshBus maheshBus = new MaheshBus("MH102", "Chennai to Coimbatore", 50);
        maheshBus.pass();
        maheshBus.seat();
        maheshBus.reserved();
        maheshBus.ticket();
        maheshBus.stand();

        System.out.println("MaheshBus - "+maheshBus.toString());

        System.out.println("-------------------------------------------------------------------------");

        Footwear footwear = new Footwear();
        footwear.remove();
        footwear.run();
        footwear.tie();
        footwear.walk();
        footwear.wear();

        Footwear footwear1 = new Shoe("Nike", 9, true);
        footwear1.remove();
        footwear1.run();
        footwear1.tie();
        footwear1.walk();
        footwear1.wear();

        Shoe shoe = new Shoe("Nike", 9, true);
        shoe.remove();
        shoe.tie();
        shoe.run();
        shoe.walk();
        shoe.wear();

        System.out.println("Shoe - "+shoe.toString());

        System.out.println("------------------------------------------------------------------------");

        Tournament tournament = new Tournament();
        tournament.declareWinner();
        tournament.entertainFans();
        tournament.organize();
        tournament.scheduleMatches();
        tournament.teamsParticipate();

        Tournament tournament1 = new IPL("Chennai Super Kings", "MS Dhoni", 120);
        tournament1.declareWinner();
        tournament1.entertainFans();
        tournament1.organize();
        tournament1.scheduleMatches();
        tournament1.teamsParticipate();

        IPL ipl = new IPL("Chennai Super Kings", "MS Dhoni", 120);
        ipl.declareWinner();
        ipl.organize();
        ipl.entertainFans();
        ipl.scheduleMatches();
        ipl.teamsParticipate();

        System.out.println("IPL - "+ipl.toString());

        System.out.println("--------------------------------------------------------------------------");



        Fruit fruit = new Fruit();
        fruit.eat();
        fruit.grow();
        fruit.provideNutrition();
        fruit.harvest();
        fruit.ripen();

        Fruit fruit1 = new Mango("Alphonso", 300, true);
        fruit1.eat();
        fruit1.grow();
        fruit1.provideNutrition();
        fruit1.harvest();
        fruit1.ripen();

        Mango mango = new Mango("Alphonso", 300, true);
        mango.eat();
        mango.provideNutrition();
        mango.grow();
        mango.ripen();
        mango.harvest();

        System.out.println("Mango - "+mango.toString());

        System.out.println("------------------------------------------------------------------------");



        Door door = new Door();
        door.close();
        door.lock();
        door.material();
        door.open();
        door.unlock();

        Door door1 = new WoodenDoor(210, 90, "Teak");
        door1.close();
        door1.lock();
        door1.material();
        door1.open();
        door1.unlock();

        WoodenDoor woodenDoor = new WoodenDoor(210, 90, "Teak");
        woodenDoor.close();
        woodenDoor.lock();
        woodenDoor.material();
        woodenDoor.unlock();
        woodenDoor.open();

        System.out.println("Wooden - "+woodenDoor.toString());

        System.out.println("---------------------------------------------------------------------");



        Country country = new Country();
        country.continent();
        country.currency();
        country.government();
        country.language();
        country.population();

        Country country1 = new India("New Delhi", 1400000000L, "Hindi");
        country1.continent();
        country1.currency();
        country1.government();
        country1.language();
        country1.population();

        India india = new India("New Delhi", 1400000000L, "Hindi");
        india.continent();
        india.population();
        india.currency();
        india.language();
        india.continent();

        System.out.println("India - "+india.toString());
        System.out.println("----------------------------------------------------------------------------");

        EnergySource energySource = new EnergySource();
        energySource.distributeEnergy();
        energySource.generatePower();
        energySource.storeEnergy();
        energySource.maintain();
        energySource.reduceCarbonFootprint();

        EnergySource energySource1 = new SolarPanel(300, "Tata Power", true);
        energySource1.distributeEnergy();
        energySource1.generatePower();
        energySource1.storeEnergy();
        energySource1.maintain();
        energySource1.reduceCarbonFootprint();

        SolarPanel solarPanel = new SolarPanel(300, "Tata Power", true);
        solarPanel.distributeEnergy();
        solarPanel.generatePower();
        solarPanel.storeEnergy();
        solarPanel.reduceCarbonFootprint();
        solarPanel.maintain();

        System.out.println("SolarPanel - "+solarPanel.toString());

        System.out.println("--------------------------------------------------------------------------");

        Ships ships = new Ships();
        ships.anchor();
        ships.carryCargo();
        ships.navigate();
        ships.sail();
        ships.signal();

        Ships ships1 = new CruiseShip("Ocean Pearl", 3000, true);
        ships1.anchor();
        ships1.carryCargo();
        ships1.navigate();
        ships1.sail();
        ships1.signal();

        CruiseShip cruiseShip = new CruiseShip("Ocean Pearl", 3000, true);
        cruiseShip.carryCargo();
        cruiseShip.sail();
        cruiseShip.signal();
        cruiseShip.anchor();
        cruiseShip.navigate();

        System.out.println("CruseShip - "+cruiseShip.toString());

        System.out.println("-------------------------------------------------------------------------");


        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.compile();
        programmingLanguage.debug();
        programmingLanguage.execute();
        programmingLanguage.maintain();
        programmingLanguage.optimize();

        ProgrammingLanguage programmingLanguage1 = new Java("Java 17", "Oracle", true);
        programmingLanguage1.compile();
        programmingLanguage1.debug();
        programmingLanguage1.execute();
        programmingLanguage1.maintain();
        programmingLanguage1.optimize();

        Java java = new Java("Java 17", "Oracle", true);
        java.compile();
        java.execute();
        java.debug();
        java.optimize();
        java.maintain();

        System.out.println("Java - "+java.toString());

        System.out.println("--------------------------------------------------------------------------");


        Fabric fabric = new Fabric();
        fabric.dry();
        fabric.dye();
        fabric.fold();
        fabric.wash();
        fabric.weave();

        Fabric fabric1 = new Bedsheet("Cotton", "Queen", true);
        fabric1.dry();
        fabric1.dye();
        fabric1.fold();
        fabric1.wash();
        fabric1.weave();

        Bedsheet bedsheet = new Bedsheet("Cotton", "Queen", true);
        bedsheet.dye();
        bedsheet.fold();
        bedsheet.weave();
        bedsheet.dry();
        bedsheet.wash();

        System.out.println("Bedsheet - "+bedsheet.toString());

        System.out.println("--------------------------------------------------------------------------");


        GlassObject glassObject = new GlassObject();
        glassObject.breakGlass();
        glassObject.frame();
        glassObject.mount();
        glassObject.reflect();
        glassObject.clean();

        GlassObject glassObject1 = new Mirror("Round", 60, true);
        glassObject1.breakGlass();
        glassObject1.frame();
        glassObject1.mount();
        glassObject1.reflect();
        glassObject1.clean();

        Mirror mirror = new Mirror("Round", 60, true);
        mirror.breakGlass();
        mirror.frame();
        mirror.reflect();
        mirror.mount();
        mirror.clean();

        System.out.println("Mirror - "+mirror.toString());

        System.out.println("------------------------------------------------------------------------");

        ShowerGel showerGel = new ShowerGel();
        showerGel.cleanse();
        showerGel.foam();
        showerGel.fragrance();
        showerGel.moisturize();
        showerGel.rinseOff();

        ShowerGel showerGel1 = new Pears("Bartlett", 180, true);
        showerGel1.cleanse();
        showerGel1.foam();
        showerGel1.fragrance();
        showerGel1.moisturize();
        showerGel1.rinseOff();


        Pears pears = new Pears("Bartlett", 180, true);
        pears.cleanse();
        pears.fragrance();
        pears.foam();
        pears.moisturize();
        pears.rinseOff();

        System.out.println("Pears "+pears.toString());

        System.out.println("------------------------------------------------------------------------");

        Dishware dishware = new Dishware();
        dishware.breakIfDropped();
        dishware.serveFood();
        dishware.stack();
        dishware.store();
        dishware.clean();


        Dishware dishware1 = new Plate("Ceramic", 28, true);
        dishware1.breakIfDropped();
        dishware1.serveFood();
        dishware1.stack();
        dishware1.store();
        dishware1.clean();


        Plate plate = new Plate("Ceramic", 28, true);
        plate.breakIfDropped();
        plate.serveFood();
        plate.clean();
        plate.store();
        plate.stack();

        System.out.println("Plate - "+plate.toString());

        System.out.println("------------------------------------------------------------------------");

        Liquid liquid = new Liquid();
        liquid.evaporate();
        liquid.mix();
        liquid.lubricate();
        liquid.pour();
        liquid.store();

        Liquid liquid1 = new Oil("Olive", 500, true);
        liquid1.evaporate();
        liquid1.mix();
        liquid1.lubricate();
        liquid1.pour();
        liquid1.store();

        Oil oil = new Oil("Olive", 500, true);
        oil.mix();
        oil.lubricate();
        oil.evaporate();
        oil.store();
        oil.pour();

        System.out.println("Oil - "+oil.toString());

        System.out.println("-----------------------------------------------------------------------");


        Sunscreen sunscreen = new Sunscreen();
        sunscreen.absorb();
        sunscreen.hydrate();
        sunscreen.preventBurns();
        sunscreen.protectFromUV();
        sunscreen.provideSPF();

        Sunscreen sunscreen1 = new Deconstruct("Old Factory", "Bulldozer, Crane", true);
        sunscreen1.absorb();
        sunscreen1.hydrate();
        sunscreen1.preventBurns();
        sunscreen1.protectFromUV();
        sunscreen1.provideSPF();

        Deconstruct deconstruct = new Deconstruct("Old Factory", "Bulldozer, Crane", true);
        deconstruct.absorb();
        deconstruct.preventBurns();
        deconstruct.hydrate();
        deconstruct.protectFromUV();
        deconstruct.provideSPF();

        System.out.println("Deconstruct - "+deconstruct.toString());

        System.out.println("----------------------------------------------------------------------");

        DairyProduct dairyProduct = new DairyProduct();
        dairyProduct.consume();
        dairyProduct.expireQuickly();
        dairyProduct.mixWithFood();
        dairyProduct.provideNutrients();
        dairyProduct.storeCold();

        DairyProduct dairyProduct1 = new GRB(35.2, 800.5, "NGC 1234");
        dairyProduct1.consume();
        dairyProduct1.expireQuickly();
        dairyProduct1.mixWithFood();
        dairyProduct1.provideNutrients();
        dairyProduct1.storeCold();

        GRB grb = new GRB(35.2, 800.5, "NGC 1234");
        grb.mixWithFood();
        grb.expireQuickly();
        grb.provideNutrients();
        grb.storeCold();
        grb.consume();

        System.out.println("GRB - "+grb.toString());

        System.out.println("---------------------------------------------------------------------");


        FabricSoftener fabricSoftener=new FabricSoftener();
        fabricSoftener.addFragrance();
        fabricSoftener.softenClothes();
        fabricSoftener.enhanceFreshness();
        fabricSoftener.preventStatic();
        fabricSoftener.reduceWrinkles();

        FabricSoftener fabricSoftener1=new Comfort("High", 22.5, true);
        fabricSoftener1.addFragrance();
        fabricSoftener1.softenClothes();
        fabricSoftener1.enhanceFreshness();
        fabricSoftener1.preventStatic();
        fabricSoftener1.reduceWrinkles();

        Comfort comfort = new Comfort("High", 22.5, true);
        comfort.addFragrance();
        comfort.preventStatic();
        comfort.reduceWrinkles();
        comfort.enhanceFreshness();
        comfort.softenClothes();

        System.out.println("Comfort - "+comfort.toString());

        System.out.println("-------------------------------------------------------------------------");

        SkincareProduct skincareProduct = new SkincareProduct();
        skincareProduct.absorb();
        skincareProduct.apply();
        skincareProduct.moisturize();
        skincareProduct.protect();
        skincareProduct.soothe();

        SkincareProduct skincareProduct1 = new AloeVeraGel("Nature's Touch", 150, true);
        skincareProduct1.absorb();
        skincareProduct1.apply();
        skincareProduct1.moisturize();
        skincareProduct1.protect();
        skincareProduct1.soothe();

        AloeVeraGel aloeVeraGel = new AloeVeraGel("Nature's Touch", 150, true);
        aloeVeraGel.absorb();
        aloeVeraGel.moisturize();
        aloeVeraGel.protect();
        aloeVeraGel.soothe();
        aloeVeraGel.apply();

        System.out.println("AloeVeraGel - "+aloeVeraGel.toString());

        System.out.println("-------------------------------------------------------------------------");

        InstantFood instantFood = new InstantFood();
        instantFood.addWater();
        instantFood.boil();
        instantFood.openPack();
        instantFood.serve();
        instantFood.stir();

        InstantFood instantFood1 = new Maggi("Masala", 2, true);
        instantFood1.addWater();
        instantFood1.boil();
        instantFood1.openPack();
        instantFood1.serve();
        instantFood1.stir();

        Maggi maggi = new Maggi("Masala", 2, true);
        maggi.addWater();
        maggi.openPack();
        maggi.boil();
        maggi.stir();
        maggi.serve();

        System.out.println("Maggi - "+maggi.toString() );

        System.out.println("---------------------------------------------------------------------------");

        Toothpaste toothpaste = new Toothpaste();
        toothpaste.cleanTeeth();
        toothpaste.freshenBreath();
        toothpaste.protectGums();
        toothpaste.removePlaque();
        toothpaste.whitenTeeth();

        Toothpaste toothpaste1 = new Colgate("Strong Mint", 150, true);
        toothpaste1.cleanTeeth();
        toothpaste1.freshenBreath();
        toothpaste1.protectGums();
        toothpaste1.removePlaque();
        toothpaste1.whitenTeeth();


        Colgate colgate = new Colgate("Strong Mint", 150, true);
        colgate.cleanTeeth();
        colgate.protectGums();
        colgate.freshenBreath();
        colgate.whitenTeeth();
        colgate.removePlaque();

        System.out.println("Colagate - "+colgate.toString());

        System.out.println("------------------------------------------------------------------------");

        Detergent detergent = new Detergent();
        detergent.cleanClothes();
        detergent.dissolve();
        detergent.foamUp();
        detergent.removeStains();
        detergent.smellGood();

        Detergent detergent1 = new SurfExcel("Powder", 1000, true);
        detergent1.cleanClothes();
        detergent1.dissolve();
        detergent1.foamUp();
        detergent1.removeStains();
        detergent1.smellGood();

        SurfExcel surfExcel = new SurfExcel("Powder", 1000, true);
        surfExcel.cleanClothes();
        surfExcel.foamUp();
        surfExcel.dissolve();
        surfExcel.removeStains();
        surfExcel.smellGood();

        System.out.println("SurfExcel - "+surfExcel.toString());

        System.out.println("------------------------------------------------------------------------");

        EBook eBook = new EBook();
        eBook.openBook();
        eBook.adjustBrightness();
        eBook.bookmarkPage();
        eBook.searchText();
        eBook.turnPage();

        EBook eBook1 = new Kindle("Paperwhite", 16, true);
        eBook1.openBook();
        eBook1.adjustBrightness();
        eBook1.bookmarkPage();
        eBook1.searchText();
        eBook1.turnPage();

        Kindle kindle = new Kindle("Paperwhite", 16, true);
        kindle.bookmarkPage();
        kindle.openBook();
        kindle.searchText();
        kindle.adjustBrightness();
        kindle.turnPage();

        System.out.println("Kindle - "+kindle.toString());

        System.out.println("------------------------------------------------------------------------");

        Antiseptic antiseptic = new Antiseptic();
        antiseptic.coolBurn();
        antiseptic.disinfect();
        antiseptic.healFaster();
        antiseptic.reduceInfection();
        antiseptic.killGerms();

        Antiseptic antiseptic1 = new Dettol("Liquid", 500, true);
        antiseptic1.coolBurn();
        antiseptic1.disinfect();
        antiseptic1.healFaster();
        antiseptic1.reduceInfection();
        antiseptic1.killGerms();

        Dettol dettol = new Dettol("Liquid", 500, true);
        dettol.coolBurn();
        dettol.healFaster();
        dettol.disinfect();
        dettol.reduceInfection();
        dettol.killGerms();

        System.out.println("Dettol - "+dettol.toString());

        System.out.println("--------------------------------------------------------------------------");

        Soap soap = new Soap();
        soap.foam();
        soap.removeStains();
        soap.rinse();
        soap.smellFresh();
        soap.washClothes();

        Soap soap1 = new Rin("Bar", 250, true);
        soap1.foam();
        soap1.removeStains();
        soap1.rinse();
        soap1.smellFresh();
        soap1.washClothes();

        Rin rin = new Rin("Bar", 250, true);
        rin.foam();
        rin.removeStains();
        rin.smellFresh();
        rin.washClothes();
        rin.rinse();

        System.out.println("Rin - "+rin.toString());

        System.out.println("-------------------------------------------------------------------");

        Speaker speaker = new Speaker();
        speaker.adjustVolume();
        speaker.charge();
        speaker.connectBluetooth();
        speaker.playSound();
        speaker.turnOff();

        Speaker speaker1 = new JBL("Flip 6", 12, true);
        speaker1.adjustVolume();
        speaker1.charge();
        speaker1.connectBluetooth();
        speaker1.playSound();
        speaker1.turnOff();

        JBL jbl = new JBL("Flip 6", 12, true);
        jbl.adjustVolume();
        jbl.connectBluetooth();
        jbl.playSound();
        jbl.charge();
        jbl.turnOff();

        System.out.println("JBL - "+jbl.toString());


        System.out.println("-------------------------------------------------------------------------");

        Watches watches = new Watches();
        watches.changeStrap();
        watches.checkBattery();
        watches.setAlarm();
        watches.showDate();
        watches.showDate();

        Watches watches1 = new Titan("Edge", 7999.99, true);
        watches1.changeStrap();
        watches1.checkBattery();
        watches1.setAlarm();
        watches1.showDate();
        watches1.showDate();

        Titan titan = new Titan("Edge", 7999.99, true);
        titan.changeStrap();
        titan.showDate();
        titan.checkBattery();
        titan.setAlarm();
        titan.showTime();

        System.out.println("Tiatan - "+titan.toString());

        System.out.println("-------------------------------------------------------------------------");

        Headphones headphones = new Headphones();
        headphones.charge();
        headphones.decreaseVolume();
        headphones.increaseVolume();
        headphones.pauseMusic();
        headphones.playMusic();

        Headphones headphones1 = new Boat("Airdopes 141", 42, true);
        headphones1.charge();
        headphones1.decreaseVolume();
        headphones1.increaseVolume();
        headphones1.pauseMusic();
        headphones1.playMusic();

        Boat boat = new Boat("Airdopes 141", 42, true);
        boat.increaseVolume();
        boat.decreaseVolume();
        boat.pauseMusic();
        boat.playMusic();
        boat.charge();

        System.out.println("Boat - "+boat.toString());

        System.out.println("---------------------------------------------------------------------------");

        Juice juice = new Juice();
        juice.drink();
        juice.openCap();
        juice.pour();
        juice.refrigerate();
        juice.shakeWell();

        Juice juice1 = new Real("Mango", 1000, true);
        juice1.drink();
        juice1.openCap();
        juice1.pour();
        juice1.refrigerate();
        juice1.shakeWell();

        Real real = new Real("Mango", 1000, true);
        real.pour();
        real.openCap();
        real.refrigerate();
        real.shakeWell();
        real.drink();

        System.out.println("Real - "+real.toString());

        System.out.println("--------------------------------------------------------------------------");

        Pen pen = new Pen();
        pen.cap();
        pen.inkFlow();
        pen.refill();
        pen.uncap();
        pen.write();

        Pen pen1 = new Reynolds("Gel Pen", "Blue", false);
        pen1.cap();
        pen1.inkFlow();
        pen1.refill();
        pen1.uncap();
        pen1.write();

        Reynolds reynolds =new Reynolds("Gel Pen", "Blue", false);
        reynolds.cap();
        reynolds.refill();
        reynolds.inkFlow();
        reynolds.uncap();
        reynolds.write();

        System.out.println("Reynolds - "+reynolds.toString());

        System.out.println("-----------------------------------------------------------------------");

        Towel towel = new Towel();
        towel.absorb();
        towel.fold();
        towel.hang();
        towel.dry();
        towel.wash();

        Towel towel1 = new CottonTowel("Blue", "Large", 8);
        towel1.absorb();
        towel1.fold();
        towel1.hang();
        towel1.dry();
        towel1.wash();


        CottonTowel cottonTowel = new CottonTowel("Blue", "Large", 8);
        cottonTowel.dry();
        cottonTowel.fold();
        cottonTowel.absorb();
        cottonTowel.hang();
        cottonTowel.wash();

        System.out.println("CottonTowel - "+cottonTowel.toString());

        System.out.println("-------------------------------------------------------------------------");

        Television television = new Television();
        television.adjustVolume();
        television.changeChannel();
        television.connectHdmi();
        television.powerOn();
        television.showGuide();

        Television television1 = new LG("Television", "LG55UHD2024", 2);
        television1.adjustVolume();
        television1.changeChannel();
        television1.connectHdmi();
        television1.powerOn();
        television1.showGuide();

        LG lg = new LG("Television", "LG55UHD2024", 2);
        lg.adjustVolume();
        lg.connectHdmi();
        lg.adjustVolume();
        lg.powerOn();
        lg.showGuide();

        System.out.println("LG - "+lg.toString());

        System.out.println("------------------------------------------------------------------------");


        WaterPurifier waterPurifier = new WaterPurifier();
        waterPurifier.filterWater();
        waterPurifier.storeWater();
        waterPurifier.autoShutdown();
        waterPurifier.indicateLevel();
        waterPurifier.removeGerms();

        WaterPurifier waterPurifier1 = new Kent("Grand Plus", 8, true);
        waterPurifier1.filterWater();
        waterPurifier1.storeWater();
        waterPurifier1.autoShutdown();
        waterPurifier1.indicateLevel();
        waterPurifier1.removeGerms();

        Kent kent =new Kent("Grand Plus", 8, true);
        kent.autoShutdown();
        kent.indicateLevel();
        kent.filterWater();
        kent.storeWater();
        kent.removeGerms();

        System.out.println("Kent - "+kent.toString());

        System.out.println("---------------------------------------------------------------------------");

        Notebook notebook = new Notebook();
        notebook.decorate();
        notebook.label();
        notebook.staplePages();
        notebook.tearPage();
        notebook.writeNotes();

        Notebook notebook1 = new Classmate("Notebook", 45.0, true);
        notebook1.decorate();
        notebook1.label();
        notebook1.staplePages();
        notebook1.tearPage();
        notebook1.writeNotes();

        Classmate classmate = new Classmate("Notebook", 45.0, true);
        classmate.staplePages();
        classmate.label();
        classmate.tearPage();
        classmate.writeNotes();
        classmate.decorate();

        System.out.println("Classmate - "+classmate.toString());

        System.out.println("-----------------------------------------------------------------------");

        Fan fan = new Fan();
        fan.changeSpeed();
        fan.cleanBlades();
        fan.rotate();
        fan.swing();
        fan.stop();

        Fan fan1 = new Crompton("Ceiling Fan", 75, true);
        fan1.changeSpeed();
        fan1.cleanBlades();
        fan1.rotate();
        fan1.swing();
        fan1.stop();

        Crompton crompton = new Crompton("Ceiling Fan", 75, true);
        crompton.changeSpeed();
        crompton.cleanBlades();
        crompton.swing();
        crompton.stop();
        crompton.rotate();

        System.out.println("Crompton - "+crompton.toString());
        System.out.println("------------------------------------------------------------------------");

        Chocolate chocolate = new Chocolate();
        chocolate.bite();
        chocolate.chew();
        chocolate.melt();
        chocolate.share();
        chocolate.unwrap();


        Chocolate chocolate1 = new DairyMilk("Silk", 150, false);
        chocolate1.bite();
        chocolate1.chew();
        chocolate1.melt();
        chocolate1.share();
        chocolate1.unwrap();

        DairyMilk dairyMilk = new DairyMilk("Silk", 150, false);
        dairyMilk.bite();
        dairyMilk.melt();
        dairyMilk.chew();
        dairyMilk.share();
        dairyMilk.unwrap();

        System.out.println("DairyMilk - "+dairyMilk.toString());

        System.out.println("------------------------------------------------------------------------");


        Mouse mouse = new Mouse();
        mouse.click();
        mouse.drag();
        mouse.move();
        mouse.doubleClick();
        mouse.scroll();

        Mouse mouse1 = new WirelessMouse("Logitech", 90, 1600);
        mouse1.click();
        mouse1.drag();
        mouse1.move();
        mouse1.doubleClick();
        mouse1.scroll();

        WirelessMouse wirelessMouse = new WirelessMouse("Logitech", 90, 1600);
        wirelessMouse.click();
        wirelessMouse.drag();
        wirelessMouse.doubleClick();
        wirelessMouse.move();
        wirelessMouse.scroll();

        System.out.println("WirelessMouse - "+wirelessMouse.toString());

        System.out.println("-------------------------------------------------------------------------");

        Bucket bucket = new Bucket();
        bucket.carry();
        bucket.empty();
        bucket.clean();
        bucket.fillWater();
        bucket.store();

        Bucket bucket1 = new PlasticBucket("Blue", 15, true);
        bucket1.carry();
        bucket1.empty();
        bucket1.clean();
        bucket1.fillWater();
        bucket1.store();

        PlasticBucket plasticBucket = new PlasticBucket("Blue", 15, true);
        plasticBucket.carry();
        plasticBucket.fillWater();
        plasticBucket.empty();
        plasticBucket.store();
        plasticBucket.clean();

        System.out.println("PlasticBucket - "+plasticBucket.toString());

        System.out.println("-----------------------------------------------------------------------");

        Pillow pillow = new Pillow();
        pillow.adjust();
        pillow.cover();
        pillow.fluff();
        pillow.restOn();
        pillow.restOn();

        Pillow pillow1 = new SoftPillow("Memory Foam", "King", true);
        pillow1.adjust();
        pillow1.cover();
        pillow1.fluff();
        pillow1.restOn();
        pillow1.restOn();

        SoftPillow softPillow = new SoftPillow("Memory Foam", "King", true);
        softPillow.adjust();
        softPillow.fluff();
        softPillow.cover();
        softPillow.restOn();
        softPillow.wash();
        System.out.println("SoftPillow - "+softPillow.toString());

        System.out.println("--------------------------------------------------------------------------");

        Curtain curtain = new Curtain();
        curtain.close();
        curtain.hang();
        curtain.iron();
        curtain.wash();
        curtain.drawOpen();

        Curtain curtain1 = new WindowCurtain("Polyester", 220, true);
        curtain1.close();
        curtain1.hang();
        curtain1.iron();
        curtain1.wash();
        curtain1.drawOpen();

        WindowCurtain windowCurtain = new WindowCurtain("Polyester", 220, true);
        windowCurtain.hang();
        windowCurtain.drawOpen();
        windowCurtain.close();
        windowCurtain.iron();
        windowCurtain.wash();

        System.out.println("WindowCurtain - "+windowCurtain.toString());

        System.out.println("--------------------------------------------------------------------------");

        Comb comb = new Comb();
        comb.clean();
        comb.grip();
        comb.store();
        comb.untangle();
        comb.pack();

        Comb comb1 = new HairComb("Wood", 25, false);
        comb1.clean();
        comb1.grip();
        comb1.store();
        comb1.untangle();
        comb1.pack();

        HairComb hairComb = new HairComb("Wood", 25, false);
        hairComb.pack();
        hairComb.grip();
        hairComb.untangle();
        hairComb.store();
        hairComb.clean();

        System.out.println("HairComb - "+hairComb.toString());

        System.out.println("----------------------------------------------------------------------");

        Mug mug = new Mug();
        mug.heat();
        mug.pour();
        mug.sip();
        mug.refill();
        mug.clean();




        Mug mug1 = new CoffeeMug("Black", 350, true);
        mug1.heat();
        mug1.pour();
        mug1.sip();
        mug1.refill();
        mug1.clean();


        CoffeeMug coffeeMug = new CoffeeMug("Black", 350, true);
        coffeeMug.sip();
        coffeeMug.refill();
        coffeeMug.pour();
        coffeeMug.heat();
        coffeeMug.clean();

        System.out.println("CoffeeMug -"+coffeeMug.toString());

        Utensils utensils = new Utensils();
        utensils.wash(mug);
        utensils.wash(mug1);
        utensils.wash(coffeeMug);


        System.out.println("-----------------------------------------------------------------------");


        Oven oven = new Oven();
        oven.defrost();
        oven.bake();
        oven.grill();
        oven.turnOff();
        oven.preheat();


        Oven oven1 = new MicrowaveOven("LG", 28, true);
        oven1.defrost();
        oven1.bake();
        oven1.grill();
        oven1.turnOff();
        oven1.preheat();


        MicrowaveOven microwaveOven = new MicrowaveOven("LG", 28, true);
        microwaveOven.bake();
        microwaveOven.defrost();
        microwaveOven.grill();
        microwaveOven.preheat();
        microwaveOven.turnOff();


        System.out.println("MicrowaveOven - "+microwaveOven.toString());


        Kitchen kitchen = new Kitchen();
        kitchen.cook(oven);
        kitchen.cook(oven1);
        kitchen.cook(microwaveOven);



        System.out.println("---------------------------------------------------------------------------");




    }
}


