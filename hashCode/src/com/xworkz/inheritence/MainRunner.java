package com.xworkz.inheritence;

import com.xworkz.inheritence.external.*;


public class MainRunner {

    public static void main(String[] args) {


        Democracy democracy = new Democracy("India", 2024, true);
        Democracy democracy1 = new Democracy("India",2024,true);


        System.out.println("Democracy"+democracy.toString());
        System.out.println("Original : "+democracy.hashCode());
        System.out.println(System.identityHashCode(democracy));

        boolean value = democracy1.equals(democracy);
        System.out.println("Both the value are same "+value);


        System.out.println("-----------------------------------------------------");


        Wizard wizard = new Wizard("saji",50,"magic");
        Wizard wizard1 = new Wizard("ravi",50,"magic");



        System.out.println("Wizard"+wizard.toString());
        System.out.println(wizard.hashCode());
        System.out.println(System.identityHashCode(wizard));

        boolean check = wizard1.equals(wizard);
        System.out.println(check);

        System.out.println("---------------------------------------------");

        Truck truck = new Truck("panchami",10,60);
        Truck truck1 = new Truck("panchami",10,60);

        System.out.println("Truck"+truck.toString());
        System.out.println(truck.hashCode());
        System.out.println(System.identityHashCode(truck));
        boolean tru = truck1.equals(truck);
        System.out.println(tru);

        System.out.println("-----------------------------------------------------------");


        GeneralHospital generalHospital = new GeneralHospital("rama","fever",50);
        GeneralHospital generalHospital1 = new GeneralHospital("rama","fever",50);

        System.out.println("GeneralHospital - "+generalHospital.toString());
        System.out.println(generalHospital.hashCode());
        System.out.println(System.identityHashCode(generalHospital));
        System.out.println(generalHospital1.equals(generalHospital));

        System.out.println("--------------------------------------------------------------------------------------");



        LeafVeg leafVeg = new LeafVeg("Spinach","green",true);
        LeafVeg leafVeg1 = new LeafVeg("Cabbage","green",true);
        System.out.println("LeafVeg - "+leafVeg.toString());
        System.out.println(leafVeg.hashCode());
        System.out.println(System.identityHashCode(leafVeg));
        System.out.println(leafVeg.equals(leafVeg1));

        System.out.println("-------------------------------------------------------------");


        School school = new  School("VMSH","Konaje",500);
        School school1 = new  School("cec","Mangaluru",2000);

        System.out.println("School - "+school.toString());
        System.out.println(school.hashCode());
        System.out.println(System.identityHashCode(school));
        System.out.println(school.equals(school1));

        System.out.println("--------------------------------------------------------------------------");


        Lion lion = new Lion("Rani",10,true);
        Lion lion1 = new Lion("Rani",10,true);
        System.out.println("Lion - "+lion.toString());
        System.out.println(lion.hashCode());
        System.out.println(System.identityHashCode(lion));
        System.out.println(lion.equals(lion1));

        System.out.println("-------------------------------------------------------");


        Circle circle = new Circle("red",10,true);
        Circle circle1 = new Circle("blue",5,false);

        System.out.println("Circle - "+circle.toString());
        System.out.println(circle.hashCode());
        System.out.println(System.identityHashCode(circle));

        System.out.println(circle1.equals(circle));


        System.out.println("------------------------------------------------------------------------");

        Phone phone = new Phone("Samsung","50000",250);
        Phone phone1 = new Phone("Samsung","50000",250);

        System.out.println("Phone - "+phone.toString());
        System.out.println(System.identityHashCode(phone));
        System.out.println(phone1.equals(phone));


        System.out.println("---------------------------------------------------------------------------");


        Teacher teacher = new Teacher("radha","maths",15);
        Teacher teacher1 = new Teacher("radha","maths",15);
        System.out.println("Teacher - "+teacher.toString());
        System.out.println(teacher.hashCode());
        System.out.println(System.identityHashCode(teacher1));


        System.out.println("-------------------------------------------------------------------------");

        Guiter guiter = new Guiter("Fender", 6, true);
        Guiter guiter1 = new Guiter("Fender", 6, true);

        System.out.println("Guiter - "+guiter.toString());
        System.out.println(guiter.hashCode());
        System.out.println(System.identityHashCode(guiter));
        System.out.println(guiter.equals(guiter1));

        System.out.println("-------------------------------------------------------------------");

        SchoolBag schoolBag = new SchoolBag("skybag","red",4);
        SchoolBag schoolBag1 = new SchoolBag("skybag","red",4);

        System.out.println("SchoolBag - "+schoolBag.toString());
        System.out.println(schoolBag.hashCode());
        System.out.println(System.identityHashCode(schoolBag));
        System.out.println(schoolBag1.equals(schoolBag));


        System.out.println("------------------------------------------------------------------------");

        Novel novel = new Novel("Secret","thushara",50);
        Novel novel1 = new Novel("Secret","thushara",50);
        System.out.println("Novel - "+novel.toString());
        System.out.println(novel.hashCode());
        System.out.println(System.identityHashCode(novel));
        System.out.println(novel1.equals(novel));

        System.out.println("----------------------------------------------------------------------");

        Account account = new Account("5463828320","tanvi",60000);;
        Account account1 = new Account("5463828320","tanvi",60000);;
        System.out.println("Account - "+account.toString());
        System.out.println(account.hashCode());
        System.out.println(System.identityHashCode(account));
        System.out.println(account1.equals(account));


        System.out.println("------------------------------------------------------------------------");


        Refrigerator refrigerator = new Refrigerator("Lg",500,true);
        Refrigerator refrigerator1 = new Refrigerator("whirlpool",500,true);
        System.out.println("Refrigerator - "+refrigerator.toString());
        System.out.println(refrigerator.hashCode());
        System.out.println(System.identityHashCode(refrigerator));
        System.out.println(refrigerator1.equals(refrigerator));

        System.out.println("-------------------------------------------------------------");


        House house = new House("bangaluru",10,false);
        House house1 = new House("bangaluru",10,false);

        System.out.println("House - "+house.toString());
        System.out.println(house.hashCode());
        System.out.println(System.identityHashCode(house));
        System.out.println(house.equals(house1));

        System.out.println("-------------------------------------------------------------------");


        Chair chair = new Chair("wood","brown",true);
        Chair chair1 = new Chair("wood","brown",true);

        System.out.println("Chair - "+chair.toString());
        System.out.println(chair.hashCode());
        System.out.println(System.identityHashCode(chair));
        System.out.println(chair1.equals(chair));


        System.out.println("-----------------------------------------------------------------");


        Parrot parrot = new Parrot("ravi","green",false);
        Parrot parrot1 = new Parrot("ravi","green",false);

        System.out.println("Parrot - "+parrot.toString());
        System.out.println(parrot.hashCode());
        System.out.println(System.identityHashCode(parrot));
        System.out.println(parrot1.equals(parrot));



        System.out.println("-------------------------------------------------------------------");

        Pizza pizza = new Pizza("Large", "Paneer", true);
        Pizza pizza1 = new Pizza("Large", "Paneer", true);

        System.out.println("Pizza - "+pizza.toString());
        System.out.println(pizza.hashCode());
        System.out.println(System.identityHashCode(pizza));
        System.out.println(pizza1.equals(pizza));

        System.out.println("--------------------------------------------------------------------");


        Shirt shirt = new Shirt("XL","blue",true);
        Shirt shirt1 = new Shirt("XL","blue",true);
        System.out.println("Shirt - "+shirt.toString());
        System.out.println(shirt.hashCode());
        System.out.println(System.identityHashCode(shirt));
        System.out.println(shirt.equals(shirt1));
        System.out.println(shirt1.equals(shirt));


        System.out.println("---------------------------------------------------------------------");


        Bottel bottel = new Bottel("plastic",500,false);
        Bottel bottel1 = new Bottel("plastic",500,false);

        System.out.println("Bottle - "+ bottel.toString());
        System.out.println(bottel.hashCode());
        System.out.println(System.identityHashCode(bottel));
        System.out.println(bottel1.equals(bottel));

        System.out.println("---------------------------------------------------------------------");

        Manager manager = new Manager("tina","finance",10);
        Manager manager1 = new Manager("pina","sales",10);

        System.out.println("Manager - "+manager.toString());
        System.out.println(manager.hashCode());
        System.out.println(System.identityHashCode(manager));
        System.out.println(manager1.equals(manager));

        System.out.println("----------------------------------------------------------------------------");


        TeddyBear teddyBear = new TeddyBear("rocky","black","30cm");
        TeddyBear teddyBear1 = new TeddyBear("rocky","black","30cm");

        System.out.println("TeddyBear - "+teddyBear.toString());
        System.out.println(teddyBear.hashCode());
        System.out.println(System.identityHashCode(teddyBear));
        System.out.println(teddyBear1.equals(teddyBear));


        System.out.println("------------------------------------------------------------------------");


        Router router = new Router("TP-Link", 1200, true);
        System.out.println("ROuter - "+router.toString());
        System.out.println(router.hashCode());
        System.out.println(System.identityHashCode(router));

        System.out.println("------------------------------------------------------------------------");

        PaintBrush paintBrush = new PaintBrush("Camlin", 5, true);
        PaintBrush paintBrush1 = new PaintBrush("Camlin", 5, true);

        System.out.println("PaintBrush - "+paintBrush.toString());
        System.out.println(paintBrush.hashCode());
        System.out.println(System.identityHashCode(paintBrush));
        System.out.println(paintBrush1.equals(paintBrush));


        System.out.println("--------------------------------------------------------------------");

        Antibiotic antibiotic = new Antibiotic("Amoxicillin", 500, true);
        Antibiotic antibiotic1 = new Antibiotic("Amoxicillin", 500, true);

        System.out.println("Antibiotic - "+antibiotic.toString());
        System.out.println(antibiotic.hashCode());
        System.out.println(System.identityHashCode(antibiotic));
        System.out.println(antibiotic1.equals(antibiotic));

        System.out.println("---------------------------------------------------------------------");



        Chess chess = new Chess(2, "8x8", true);
        Chess chess1 = new Chess(2, "16x16", true);

        System.out.println("Chess - "+chess.toString());
        System.out.println(chess.hashCode());
        System.out.println(System.identityHashCode(chess));
        System.out.println(chess1.equals(chess));

        System.out.println("-----------------------------------------------------------------------");


        Sword sword = new Sword("Steel", 90, true);
        Sword sword1 = new Sword("gold", 90, true);

        System.out.println("Sword - "+sword.toString());
        System.out.println(sword.hashCode());
        System.out.println(System.identityHashCode(sword));
        System.out.println(sword1.equals(sword));

        System.out.println("------------------------------------------------------------------------");
        HardDisk hardDisk = new HardDisk("1TB", "SSD", true);
        HardDisk hardDisk1 = new HardDisk("1TB", "SSD", false);

        System.out.println("HardDisk - "+hardDisk.toString());
        System.out.println(hardDisk.hashCode());
        System.out.println(System.identityHashCode(hardDisk));
        System.out.println(hardDisk1.equals(hardDisk));

        System.out.println("------------------------------------------------------------------------");

        Watch watch = new Watch("Casio", true, true);
        Watch watch1 = new Watch("Titan", false, true);

        System.out.println("Watch  - "+watch.toString());
        System.out.println(watch.hashCode());
        System.out.println(System.identityHashCode(watch));
        System.out.println(watch.equals(watch1));


        System.out.println("------------------------------------------------------------------------");

        OakTree oakTree = new OakTree(50, 20.5, true);
        OakTree oakTree1 = new OakTree(45, 20.5, true);

        System.out.println("OakTree - "+oakTree.toString());
        System.out.println(oakTree.hashCode());
        System.out.println(System.identityHashCode(oakTree));
        System.out.println(oakTree1.equals(oakTree));


        System.out.println("-----------------------------------------------------------------------");

        CreditCard creditCard = new CreditCard("1234-5678-9012-3456", "John Doe", 50000.00);
        CreditCard creditCard1 = new CreditCard("1234-5678-9012-3456", "John Doe", 50000.00);

        System.out.println("CreditCard - "+creditCard.toString());
        System.out.println(creditCard.hashCode());
        System.out.println(System.identityHashCode(creditCard));
        System.out.println(creditCard1.equals(creditCard));



        System.out.println("-----------------------------------------------------------------------");

        Laptop laptop = new Laptop("HP", 16, true);
        Laptop laptop1 = new Laptop("Dell", 16, true);

        System.out.println("Laptop - "+laptop.toString());
        System.out.println(laptop.hashCode());
        System.out.println(System.identityHashCode(laptop));
        System.out.println(laptop.equals(laptop1));

        System.out.println("-------------------------------------------------------------------------");



        DSLR dslr = new DSLR("Canon", 24, true);
        DSLR dslr1 = new DSLR("Sony", 24, true);

        System.out.println("DSLR - "+dslr.toString());
        System.out.println(dslr.hashCode());
        System.out.println(System.identityHashCode(dslr));
        System.out.println(dslr1.equals(dslr));




        System.out.println("-------------------------------------------------------------------------");


        Hammer hammer = new Hammer("Steel", 1.5, true);
        Hammer hammer1 = new Hammer("Steel", 1.5, true);

        System.out.println("Hammer - "+hammer.toString());
        System.out.println(hammer.hashCode());
        System.out.println(System.identityHashCode(hammer));
        System.out.println(hammer.equals(hammer1));

        System.out.println("------------------------------------------------------------------------");

        DigitalClock digitalClock = new DigitalClock("Sony", "24-hour", true);
        DigitalClock digitalClock1 = new DigitalClock("Sony", "12-hour", false);

        System.out.println("DigitalClock - "+digitalClock.toString());
        System.out.println(digitalClock.hashCode());
        System.out.println(System.identityHashCode(digitalClock));
        System.out.println(digitalClock1.equals(digitalClock));

        System.out.println("----------------------------------------------------------------------");

        FootBall footBall = new FootBall("Adidas", 5, true);
        FootBall footBall1 = new FootBall("Nike", 5, true);

        System.out.println("FootBall - "+footBall.toString());
        System.out.println(footBall.hashCode());
        System.out.println(System.identityHashCode(footBall));
        System.out.println(footBall1.equals(footBall));

        System.out.println("-----------------------------------------------------------------------");


        Coffee coffee = new Coffee("Latte", "Medium", true);
        Coffee coffee1 = new Coffee("Latte", "Medium", true);

        System.out.println("Coffee - "+coffee.toString());
        System.out.println(coffee.hashCode());
        System.out.println(System.identityHashCode(coffee));
        System.out.println(coffee1.equals(coffee));


        System.out.println("----------------------------------------------------------------------");


        Earth earth = new Earth(6371.0, true, 7);
        Earth earth1 = new Earth(6371.0, true, 7);

        System.out.println("Earth - "+earth.toString());
        System.out.println(earth.hashCode());
        System.out.println(System.identityHashCode(earth));
        System.out.println(earth1.equals(earth));

        System.out.println("-------------------------------------------------------------------------");



        Smartphone smartphone = new Smartphone("Samsung", 128, true);
        Smartphone smartphone1 = new Smartphone("Samsung", 128, true);

        System.out.println("SmartPhone - "+smartphone.toString());
        System.out.println(smartphone.hashCode());
        System.out.println(System.identityHashCode(smartphone));
        System.out.println(smartphone1.equals(smartphone));

        System.out.println("------------------------------------------------------------------------");

        DigitalCurrency digitalCurrency = new DigitalCurrency("Bitcoin", 65000.50, true);
        DigitalCurrency digitalCurrency1 = new DigitalCurrency("Bitcoin", 70000.50, true);

        System.out.println("DigitalCurrency -"+digitalCurrency.toString());
        System.out.println(digitalCurrency.hashCode());
        System.out.println(System.identityHashCode(digitalCurrency));
        System.out.println(digitalCurrency1.equals(digitalCurrency));


        System.out.println("------------------------------------------------------------------------");


        LEDBulb ledBulb = new LEDBulb(12, 3000, true);
        LEDBulb ledBulb1 = new LEDBulb(12, 3000, false);

        System.out.println("LEDBulb - "+ledBulb.toString());
        System.out.println(ledBulb.hashCode());
        System.out.println(System.identityHashCode(ledBulb));
        System.out.println(ledBulb1.equals(ledBulb));


        System.out.println("------------------------------------------------------------------------");

        Rose rose = new Rose("Red", 32, true);
        Rose rose1 = new Rose("Pink", 32, true);

        System.out.println("Rose - "+rose.toString());
        System.out.println(rose.hashCode());
        System.out.println(System.identityHashCode(rose));
        System.out.println(rose1.equals(rose));

        System.out.println("------------------------------------------------------------------------");

        Shark shark = new Shark("Great White", 6.4, true);
        Shark shark1 = new Shark("Great White", 6.4, true);
        System.out.println("Shark - "+shark.toString());
        System.out.println(shark.hashCode());
        System.out.println(System.identityHashCode(shark));
        System.out.println(shark1.equals(shark));


        System.out.println("-----------------------------------------------------------------------");


        Everest everest = new Everest(8848.86, "Nepal", true);
        Everest everest1 = new Everest(8848.86, "Nepal", false);

        System.out.println("Everest  - "+everest.toString());
        System.out.println(everest.hashCode());
        System.out.println(System.identityHashCode(everest));
        System.out.println(everest.equals(everest1));


        System.out.println("---------------------------------------------------------------------------");

        Snake snake = new Snake("Cobra", 1.8, true);
        Snake snake1 = new Snake("Cobra", 1.8, true);

        System.out.println("Snake - "+snake.toString());
        System.out.println(snake.hashCode());
        System.out.println(System.identityHashCode(snake));
        System.out.println(snake1.equals(snake));

        System.out.println("---------------------------------------------------------------------------");


        Magazine magazine = new Magazine("National Geographic", 152, true);
        Magazine magazine1 = new Magazine("National Geographic", 152, false);


        System.out.println("Magazine - "+magazine.toString());
        System.out.println(magazine.hashCode());
        System.out.println(System.identityHashCode(magazine));
        System.out.println(magazine1.equals(magazine));

        System.out.println("--------------------------------------------------------------------------");

        Diamond diamond = new Diamond(1.5, "D", true);
        Diamond diamond1 = new Diamond(2.5, "D", true);

        System.out.println("Diamond - "+diamond.toString());
        System.out.println(diamond.hashCode());
        System.out.println(System.identityHashCode(diamond));
        System.out.println(diamond1.equals(diamond));

        System.out.println("------------------------------------------------------------------------------");


        Books books = new Books("The Alchemist", "Paulo Coelho", 208);
        Books books1 = new Books("The Alchemist", "Paulo Coelho", 208);

        System.out.println("Books  - "+books.toString());
        System.out.println(books.hashCode());
        System.out.println(System.identityHashCode(books));
        System.out.println(books1.equals(books));
        System.out.println("------------------------------------------------------------------------");



        Butterfly butterfly = new Butterfly("Monarch", "Orange and Black", 9.5);
        Butterfly butterfly1 = new Butterfly("Monarch", "Orange and Black", 9.5);

        System.out.println("Butterfly - "+butterfly.toString());
        System.out.println(butterfly.hashCode());
        System.out.println(System.identityHashCode(butterfly));
        System.out.println(butterfly1.equals(butterfly));


        System.out.println("--------------------------------------------------------------------------");


        Necklace necklace = new Necklace("Gold", 45.0, true);
        Necklace necklace1 = new Necklace("Gold", 55.0, true);

        System.out.println("Necklace - "+necklace.toString());
        System.out.println(necklace.hashCode());
        System.out.println(System.identityHashCode(necklace));
        System.out.println(necklace1.equals(necklace));


        System.out.println("------------------------------------------------------------------------");


        English english = new English("Advanced", "British", true);
        English english1 = new English("Advanced", "British", false);

        System.out.println("English - "+english.toString());
        System.out.println(english.hashCode());
        System.out.println(System.identityHashCode(english));
        System.out.println(english1.equals(english));


        System.out.println("---------------------------------------------------------------------");

        OperatingSystem operatingSystem = new OperatingSystem("Linux", "Ubuntu 22.04", true);
        OperatingSystem operatingSystem1 = new OperatingSystem("windows", "Ubuntu 22.04", true);

        System.out.println("OperatingSystem - "+operatingSystem.toString());
        System.out.println(operatingSystem.hashCode());
        System.out.println(System.identityHashCode(operatingSystem));
        System.out.println(operatingSystem1.equals(operatingSystem));

        System.out.println("-------------------------------------------------------------------------");




        FireFox fireFox = new FireFox("124.0.2", true, 5);
        FireFox fireFox1 = new FireFox("124.0.2", true, 5);

        System.out.println("FireFox  - "+fireFox.toString());
        System.out.println(fireFox.hashCode());
        System.out.println(System.identityHashCode(fireFox));
        System.out.println(fireFox1.equals(fireFox));

        System.out.println("----------------------------------------------------------------------");


        Chef  chef = new Chef("Gordon Ramsay", "British Cuisine", 25);
        Chef  chef1 = new Chef("Gordon Ramsay", "British Cuisine", 25);

        System.out.println("Chef - " +chef.toString());
        System.out.println(chef.hashCode());
        System.out.println(System.identityHashCode(chef));
        System.out.println(chef1.equals(chef));

        System.out.println("----------------------------------------------------------------------");


        Deepavali deepavali = new Deepavali("2025-10-20", true, 108);
        Deepavali deepavali1 = new Deepavali("2025-10-21", true, 108);

        System.out.println("Deepavali - "+deepavali.toString());
        System.out.println(deepavali.hashCode());
        System.out.println(System.identityHashCode(deepavali));
        System.out.println(deepavali1.equals(deepavali));

        System.out.println("-------------------------------------------------------------------------");

        CleanicPlus cleanicPlus = new CleanicPlus("Disinfectant Spray", 500, true);
        CleanicPlus cleanicPlus1 = new CleanicPlus("Disinfectant Spray", 500, true);

        System.out.println("CleanicPlus - "+cleanicPlus.toString());
        System.out.println(cleanicPlus.hashCode());
        System.out.println(System.identityHashCode(cleanicPlus));
        System.out.println(cleanicPlus1.equals(cleanicPlus));

        System.out.println("-----------------------------------------------------------------------");


        Earphone earphone = new Earphone("Sony", true, 24);
        Earphone earphone1 = new Earphone("Sony", false, 24);

        System.out.println("Earphone - "+earphone.toString());
        System.out.println(earphone.hashCode());
        System.out.println(System.identityHashCode(earphone));
        System.out.println(earphone1.equals(earphone));

        System.out.println("-----------------------------------------------------------------------");


        MaheshBus maheshBus = new MaheshBus("MH102", "Chennai to Coimbatore", 50);
        MaheshBus maheshBus1 = new MaheshBus("MH105", "Chennai to Coimbatore", 50);

        System.out.println("MaheshBus - "+maheshBus.toString());
        System.out.println(maheshBus.hashCode());
        System.out.println(System.identityHashCode(maheshBus));
        System.out.println(maheshBus1.equals(maheshBus));

        System.out.println("-------------------------------------------------------------------------");

        Shoe shoe = new Shoe("Nike", 9, true);
        Shoe shoe1 = new Shoe("Nike", 10, true);

        System.out.println("Shoe - "+shoe.toString());
        System.out.println(shoe.hashCode());
        System.out.println(System.identityHashCode(shoe));
        System.out.println(shoe1.equals(shoe));

        System.out.println("------------------------------------------------------------------------");

        IPL ipl = new IPL("Chennai Super Kings", "MS Dhoni", 120);
        IPL ipl1 = new IPL("Chennai Super Kings", "MS Dhoni", 120);

        System.out.println("IPL - "+ipl.toString());
        System.out.println(ipl.hashCode());
        System.out.println(System.identityHashCode(ipl));
        System.out.println(ipl1.equals(ipl));

        System.out.println("--------------------------------------------------------------------------");


        Mango mango = new Mango("Alphonso", 300, true);
        Mango mango1 = new Mango("Alphonso", 300, true);

        System.out.println("Mango - "+mango.toString());
        System.out.println(mango.hashCode());
        System.out.println(System.identityHashCode(mango));
        System.out.println(mango1.equals(mango));

        System.out.println("------------------------------------------------------------------------");




        WoodenDoor woodenDoor = new WoodenDoor(210, 90, "Teak");
        WoodenDoor woodenDoor1 = new WoodenDoor(310, 90, "Teak");

        System.out.println("Wooden - "+woodenDoor.toString());
        System.out.println(woodenDoor.hashCode());
        System.out.println(System.identityHashCode(woodenDoor));
        System.out.println(woodenDoor1.equals(woodenDoor));

        System.out.println("---------------------------------------------------------------------");




        India india = new India("New Delhi", 1400000000L, "Hindi");
        India india1 = new India("New Delhi", 1400000000L, "Hindi");

        System.out.println("India - "+india.toString());
        System.out.println(india.hashCode());
        System.out.println(System.identityHashCode(india));
        System.out.println(india1.equals(india));

        System.out.println("----------------------------------------------------------------------------");

        SolarPanel solarPanel = new SolarPanel(300, "Tata Power", true);
        SolarPanel solarPanel1 = new SolarPanel(300, "Tata Power", true);

        System.out.println("SolarPanel - "+solarPanel.toString());
        System.out.println(solarPanel.hashCode());
        System.out.println(System.identityHashCode(solarPanel));
        System.out.println(solarPanel1.equals(solarPanel));

        System.out.println("--------------------------------------------------------------------------");

        CruiseShip cruiseShip = new CruiseShip("Ocean Pearl", 3000, true);
        CruiseShip cruiseShip1 = new CruiseShip("Ocean Pearl", 4000, true);

        System.out.println("CruseShip - "+cruiseShip.toString());
        System.out.println(cruiseShip.hashCode());
        System.out.println(System.identityHashCode(cruiseShip));
        System.out.println(cruiseShip1.equals(cruiseShip));

        System.out.println("-------------------------------------------------------------------------");


        Java java = new Java("Java 17", "Oracle", true);
        Java java1 = new Java("Java 8", "Oracle", true);

        System.out.println("Java - "+java.toString());
        System.out.println(java.hashCode());
        System.out.println(System.identityHashCode(java));
        System.out.println(java1.equals(java));

        System.out.println("--------------------------------------------------------------------------");


        Bedsheet bedsheet = new Bedsheet("Cotton", "Queen", true);
        Bedsheet bedsheet1 = new Bedsheet("Cotton", "Queen", true);

        System.out.println("Bedsheet - "+bedsheet.toString());
        System.out.println(bedsheet.hashCode());
        System.out.println(System.identityHashCode(bedsheet));
        System.out.println(bedsheet1.equals(bedsheet));

        System.out.println("--------------------------------------------------------------------------");


        Mirror mirror = new Mirror("Round", 60, true);
        Mirror mirror1 = new Mirror("Square", 60, true);

        System.out.println("Mirror - "+mirror.toString());
        System.out.println(mirror.hashCode());
        System.out.println(System.identityHashCode(mirror));
        System.out.println(mirror1.equals(mirror));

        System.out.println("------------------------------------------------------------------------");


        Pears pears = new Pears("Bartlett", 180, true);
        Pears pears1 = new Pears("Bartlett", 180, true);

        System.out.println("Pears "+pears.toString());
        System.out.println(pears.hashCode());
        System.out.println(System.identityHashCode(pears));
        System.out.println(pears1.equals(pears));

        System.out.println("------------------------------------------------------------------------");


        Plate plate = new Plate("Ceramic", 28, true);
        Plate plate1 = new Plate("Ceramic", 20, true);

        System.out.println("Plate - "+plate.toString());
        System.out.println(plate.hashCode());
        System.out.println(System.identityHashCode(plate));
        System.out.println(plate1.equals(plate));

        System.out.println("------------------------------------------------------------------------");


        Oil oil = new Oil("Olive", 500, true);
        Oil oil1 = new Oil("Olive", 500, true);


        System.out.println("Oil - "+oil.toString());
        System.out.println(oil.hashCode());
        System.out.println(System.identityHashCode(oil));
        System.out.println(oil1.equals(oil));

        System.out.println("-----------------------------------------------------------------------");

        Deconstruct deconstruct = new Deconstruct("Old Factory", "Bulldozer, Crane", true);
        Deconstruct deconstruct1 = new Deconstruct("Old Factory", "Bulldozer, Crane", true);

        System.out.println("Deconstruct - "+deconstruct.toString());
        System.out.println(deconstruct.hashCode());
        System.out.println(System.identityHashCode(deconstruct));
        System.out.println(deconstruct1.equals(deconstruct));

        System.out.println("---------------------------------------------------------------------");


        GRB grb = new GRB(35.2, 800.5, "NGC 1234");
        GRB grb1 = new GRB(35.2, 800.5, "NGC 1237");

        System.out.println("GRB - "+grb.toString());
        System.out.println(grb.hashCode());
        System.out.println(System.identityHashCode(grb));
        System.out.println(grb.equals(grb1));

        System.out.println("---------------------------------------------------------------------");

        Comfort comfort = new Comfort("High", 22.5, true);
        Comfort comfort1 = new Comfort("low", 22.5, true);

        System.out.println("Comfort - "+comfort.toString());
        System.out.println(comfort.hashCode());
        System.out.println(System.identityHashCode(comfort));
        System.out.println(comfort1.equals(comfort));

        System.out.println("-------------------------------------------------------------------------");

        AloeVeraGel aloeVeraGel = new AloeVeraGel("Nature's Touch", 150, true);
        AloeVeraGel aloeVeraGel1 = new AloeVeraGel("Nature's Touch", 150, true);

        System.out.println("AloeVeraGel - "+aloeVeraGel.toString());
        System.out.println(aloeVeraGel.hashCode());
        System.out.println(System.identityHashCode(aloeVeraGel));
        System.out.println(aloeVeraGel1.equals(aloeVeraGel));

        System.out.println("-------------------------------------------------------------------------");

        Maggi maggi = new Maggi("Masala", 2, true);
        Maggi maggi1 = new Maggi("Masala", 5, true);

        System.out.println("Maggi - "+maggi.toString() );
        System.out.println(maggi.hashCode());
        System.out.println(System.identityHashCode(maggi));
        System.out.println(maggi1.equals(maggi));

        System.out.println("---------------------------------------------------------------------------");

        Colgate colgate = new Colgate("Strong Mint", 150, true);
        Colgate colgate1 = new Colgate("charcol", 150, true);

        System.out.println("Colagate - "+colgate.toString());
        System.out.println(colgate.hashCode());
        System.out.println(System.identityHashCode(colgate));
        System.out.println(colgate1.equals(colgate));

        System.out.println("------------------------------------------------------------------------");

        SurfExcel surfExcel = new SurfExcel("Powder", 1000, true);
        SurfExcel surfExcel1 = new SurfExcel("Liquid", 1000, true);

        System.out.println("SurfExcel - "+surfExcel.toString());
        System.out.println(surfExcel.hashCode());
        System.out.println(System.identityHashCode(surfExcel));
        System.out.println(surfExcel1.equals(surfExcel));

        System.out.println("------------------------------------------------------------------------");

        Kindle kindle = new Kindle("Paperwhite", 16, true);
        Kindle kindle1 = new Kindle("Paperwhite", 16, true);

        System.out.println("Kindle - "+kindle.toString());
        System.out.println(kindle.hashCode());
        System.out.println(System.identityHashCode(kindle));
        System.out.println(kindle1.equals(kindle));

        System.out.println("------------------------------------------------------------------------");


        Dettol dettol = new Dettol("Liquid", 500, true);
        Dettol dettol1 = new Dettol("solid", 500, true);

        System.out.println("Dettol - "+dettol.toString());
        System.out.println(dettol.hashCode());
        System.out.println(System.identityHashCode(dettol));
        System.out.println(dettol1.equals(dettol));


        System.out.println("--------------------------------------------------------------------------");
;

        Rin rin = new Rin("Bar", 250, true);
        Rin rin1 = new Rin("Bar", 250, true);

        System.out.println("Rin - "+rin.toString());
        System.out.println(rin.hashCode());
        System.out.println(System.identityHashCode(rin));
        System.out.println(rin1.equals(rin));

        System.out.println("-------------------------------------------------------------------");

        JBL jbl = new JBL("Flip 6", 12, true);
        JBL jbl1 = new JBL("Flip 6", 12, true);

        System.out.println("JBL - "+jbl.toString());
        System.out.println(jbl.hashCode());
        System.out.println(System.identityHashCode(jbl));
        System.out.println(jbl1.equals(jbl));


        System.out.println("-------------------------------------------------------------------------");

        Titan titan = new Titan("Edge", 7999.99, true);
        Titan titan1 = new Titan("Edge", 7999.99, true);


        System.out.println("Tiatan - "+titan.toString());
        System.out.println(titan.hashCode());
        System.out.println(System.identityHashCode(titan));
        System.out.println(titan1.equals(titan));

        System.out.println("-------------------------------------------------------------------------");


        Boat boat = new Boat("Airdopes 141", 42, true);
        Boat boat1 = new Boat("Airdopes 145", 42, true);


        System.out.println("Boat - "+boat.toString());
        System.out.println(boat.hashCode());
        System.out.println(System.identityHashCode(boat));
        System.out.println(boat1.equals(boat));

        System.out.println("---------------------------------------------------------------------------");


        Real real = new Real("Mango", 1000, true);
        Real real1 = new Real("Apple", 1000, true);


        System.out.println("Real - "+real.toString());
        System.out.println(real.hashCode());
        System.out.println(System.identityHashCode(real));
        System.out.println(real.equals(real1));

        System.out.println("--------------------------------------------------------------------------");

        Reynolds reynolds =new Reynolds("Gel Pen", "Blue", false);
        Reynolds reynolds1 =new Reynolds("Ball Pen", "Blue", false);

        System.out.println("Reynolds - "+reynolds.toString());
        System.out.println(reynolds.hashCode());
        System.out.println(System.identityHashCode(reynolds));
        System.out.println(reynolds1.equals(reynolds));

        System.out.println("-----------------------------------------------------------------------");

        CottonTowel cottonTowel = new CottonTowel("Blue", "Large", 8);
        CottonTowel cottonTowel1 = new CottonTowel("Blue", "Large", 8);


        System.out.println("CottonTowel - "+cottonTowel.toString());
        System.out.println(cottonTowel.hashCode());
        System.out.println(System.identityHashCode(cottonTowel));
        System.out.println(cottonTowel1.equals(cottonTowel));

        System.out.println("-------------------------------------------------------------------------");


        LG lg = new LG("Television", "LG55UHD2024", 2);
        LG lg1 = new LG("Fridge", "LG55UHD2024", 2);

        System.out.println("LG - "+lg.toString());
        System.out.println(lg.hashCode());
        System.out.println(System.identityHashCode(lg));
        System.out.println(lg1.equals(lg));

        System.out.println("------------------------------------------------------------------------");

        Kent kent =new Kent("Grand Plus", 8, true);
        Kent kent1 =new Kent("Grand Plus", 8, true);

        System.out.println("Kent - "+kent.toString());
        System.out.println(kent.hashCode());
        System.out.println(System.identityHashCode(kent));
        System.out.println(kent.equals(kent1));

        System.out.println("---------------------------------------------------------------------------");

        Classmate classmate = new Classmate("Notebook", 45.0, true);
        Classmate classmate1 = new Classmate("Notebook", 45.0, true);

        System.out.println("Classmate - "+classmate.toString());
        System.out.println(classmate.hashCode());
        System.out.println(System.identityHashCode(classmate));
        System.out.println(classmate1.equals(classmate));

        System.out.println("-----------------------------------------------------------------------");

        Crompton crompton = new Crompton("Ceiling Fan", 75, true);
        Crompton crompton1 = new Crompton("Ceiling Fan", 75, true);

        System.out.println("Crompton - "+crompton.toString());
        System.out.println(crompton.hashCode());
        System.out.println(System.identityHashCode(crompton));
        System.out.println(crompton1.equals(crompton));
        System.out.println("------------------------------------------------------------------------");


        DairyMilk dairyMilk = new DairyMilk("Silk", 150, false);
        DairyMilk dairyMilk1 = new DairyMilk("Bubbly", 150, false);

        System.out.println("DairyMilk - "+dairyMilk.toString());
        System.out.println(dairyMilk.hashCode());
        System.out.println(System.identityHashCode(dairyMilk));
        System.out.println(dairyMilk1.equals(dairyMilk));

        System.out.println("------------------------------------------------------------------------");



        WirelessMouse wirelessMouse = new WirelessMouse("Logitech", 90, 1600);
        WirelessMouse wirelessMouse1 = new WirelessMouse("Logitech", 90, 1600);

        System.out.println("WirelessMouse - "+wirelessMouse.toString());
        System.out.println(wirelessMouse.hashCode());
        System.out.println(System.identityHashCode(wirelessMouse));
        System.out.println(wirelessMouse1.equals(wirelessMouse));

        System.out.println("-------------------------------------------------------------------------");


        PlasticBucket plasticBucket = new PlasticBucket("Blue", 15, true);
        PlasticBucket plasticBucket1 = new PlasticBucket("Red", 15, true);

        System.out.println("PlasticBucket - "+plasticBucket.toString());
        System.out.println(plasticBucket.hashCode());
        System.out.println(System.identityHashCode(plasticBucket));
        System.out.println(plasticBucket1.equals(plasticBucket));

        System.out.println("-----------------------------------------------------------------------");

        SoftPillow softPillow = new SoftPillow("Memory Foam", "King", true);
        SoftPillow softPillow1 = new SoftPillow("Memory Foam", "King", true);

        System.out.println("SoftPillow - "+softPillow.toString());
        System.out.println(softPillow.hashCode());
        System.out.println(System.identityHashCode(softPillow));
        System.out.println(softPillow1.equals(softPillow));

        System.out.println("--------------------------------------------------------------------------");



        WindowCurtain windowCurtain = new WindowCurtain("Polyester", 220, true);
        WindowCurtain windowCurtain1 = new WindowCurtain("Cotton", 220, true);


        System.out.println("WindowCurtain - "+windowCurtain.toString());
        System.out.println(windowCurtain.hashCode());
        System.out.println(System.identityHashCode(windowCurtain));
        System.out.println(windowCurtain.equals(windowCurtain1));

        System.out.println("--------------------------------------------------------------------------");

        HairComb hairComb = new HairComb("Wood", 25, false);
        HairComb hairComb1 = new HairComb("Plastic", 25, false);

        System.out.println("HairComb - "+hairComb.toString());
        System.out.println(hairComb.hashCode());
        System.out.println(System.identityHashCode(hairComb));
        System.out.println(hairComb.equals(hairComb1));

        System.out.println("----------------------------------------------------------------------");


        CoffeeMug coffeeMug = new CoffeeMug("Black", 350, true);
        CoffeeMug coffeeMug1 = new CoffeeMug("Blue", 350, true);


        System.out.println("CoffeeMug -"+coffeeMug.toString());
        System.out.println(coffeeMug.hashCode());
        System.out.println(System.identityHashCode(coffeeMug));
        System.out.println(coffeeMug.equals(coffeeMug1));

        System.out.println("-----------------------------------------------------------------------");

        MicrowaveOven microwaveOven = new MicrowaveOven("LG", 28, true);
        MicrowaveOven microwaveOven1 = new MicrowaveOven("whirlpool", 28, true);

        System.out.println("MicrowaveOven - "+microwaveOven.toString());
        System.out.println(microwaveOven.hashCode());
        System.out.println(System.identityHashCode(microwaveOven));
        System.out.println(microwaveOven1.equals(microwaveOven));


        System.out.println("---------------------------------------------------------------------------");

        WashingMachine washingMachine = new WashingMachine("Samsung", 7, true);
        WashingMachine washingMachine1 = new WashingMachine("Samsung", 7, true);

        System.out.println("WashingMachine - " + washingMachine.toString());
        System.out.println(washingMachine.hashCode());
        System.out.println(System.identityHashCode(washingMachine));
        System.out.println(washingMachine.equals(washingMachine1));
        System.out.println("----------------------------------------------------------------------------");




        AeroPurifier purifier = new AeroPurifier("APX-500", 450, true);
        AeroPurifier purifier1 = new AeroPurifier("APX-510", 450, true);

        System.out.println("AeroPurifier - " + purifier.toString());
        System.out.println(purifier.hashCode());
        System.out.println(System.identityHashCode(purifier));
        System.out.println(purifier1.equals(purifier));

        System.out.println("--------------------------------------------------------------------------");

        Shirts shirts1 = new Shirts();
        shirts1.setBrand("Av");
        shirts1.setColor("black");
        shirts1.setSize(28);

        Shirts shirts2 = new Shirts();
        shirts2.setBrand("Av");
        shirts2.setColor("black");
        shirts2.setSize(28);

        System.out.println("checking same location:" + (shirts1==shirts2));
        boolean same = shirts1.equals(shirts2);
        System.out.println("shirts1 is same as shirt2:"+same);






    }
}


