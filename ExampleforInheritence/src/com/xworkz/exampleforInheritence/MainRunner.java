package com.xworkz.exampleforInheritence;

import com.xworkz.exampleforInheritence.Multilevel.*;
import com.xworkz.exampleforInheritence.external.*;
import com.xworkz.exampleforInheritence.subclass.*;

public class MainRunner {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Cat cat = new Cat();
        cat.run();
        cat.eat();

        Puppy puppy = new Puppy();
        puppy.sleep();
        puppy.eat();
        puppy.bark();

        Diya diya = new Diya();
        diya.Food();
        diya.cloths();

        Amogh amogh = new Amogh();
        amogh.talk();
        amogh.cloths();

        Dhyan dhyan = new Dhyan();
        dhyan.write();
        dhyan.cloths();
        dhyan.Food();

        Pears pears = new Pears();
        pears.foam();
        pears.fragrance();

        Lux lux = new Lux();
        lux.clean();
        lux.fragrance();

        BodyWash bodyWash = new BodyWash();
        bodyWash.wash();
        bodyWash.foam();
        bodyWash.fragrance();

        Student student = new Student();
        student.study();
        student.walk();

        Teacher teacher = new Teacher();
        teacher.teach();
        teacher.walk();

        Principal principal = new Principal();
        principal.makeRules();
        principal.walk();
        principal.teach();

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.powerOn();
        washingMachine.washClothes();

        Fridge fridge = new Fridge();
        fridge.cool();
        fridge.powerOn();

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.clean();
        refrigerator.powerOn();
        refrigerator.cool();

        Account account = new Account();
        account.depositMoney();
        account.openAccount();

        Atm atm = new Atm();
        atm.checkBalance();
        atm.openAccount();

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.saveAmount();
        savingAccount.openAccount();
        savingAccount.depositMoney();

        Mobile mobile = new Mobile();
        mobile.makeCall();
        mobile.turnOn();

        EarPhone earPhone = new EarPhone();
        earPhone.listen();
        earPhone.turnOn();

        SdCard sdCard = new SdCard();
        sdCard.saveMemory();
        sdCard.turnOn();
        sdCard.makeCall();

        Circle circle = new Circle();
        circle.calculateArea();
        circle.display();

        Square square = new Square();
        square.size();
        square.display();

        Cube cube = new Cube();
        cube.dimension();
        cube.display();
        cube.size();

        Printer printer = new Printer();
        printer.printDocument();
        printer.start();

        Mouse mouse = new Mouse();
        mouse.pointer();
        mouse.start();

        MiniPrinter miniPrinter = new MiniPrinter();
        miniPrinter.printImage();
        miniPrinter.printDocument();
        miniPrinter.start();

        Surgeon surgeon = new Surgeon();
        surgeon.performSurgery();
        surgeon.treatPatient();

        Dentist dentist = new Dentist();
        dentist.checkTeeth();
        dentist.treatPatient();

        Specialist specialist = new Specialist();
        specialist.treat();
        specialist.treatPatient();
        specialist.performSurgery();














    }
}
