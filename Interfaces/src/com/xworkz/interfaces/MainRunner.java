package com.xworkz.interfaces;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.xworkz.interfaces.external.*;
import com.xworkz.interfaces.internal.*;

public class MainRunner {


    public static void main(String[] args) {

        Vehicle vehicle = new Truck();
        vehicle.accelerate();
        vehicle.startEngine();
        vehicle.stopEngine();

        Camera camera = new Dslr();
        camera.recordVideo();
        camera.zoom();
        camera.takePhoto();

        Calculator calculator = new ScientificCalculator();
        calculator.add();
        calculator.multiply();
        calculator.subtract();

        Alarm alarm = new DigitalAlarm();
        alarm.setAlarm();
        alarm.stopAlarm();
        alarm.snooze();

        Fan fan = new CellingFan();
        fan.adjustSpeed();
        fan.turnOff();
        fan.turnOn();

        Payment payment = new CreditCard();
        payment.pay();
        payment.checkBalance();
        payment.refund();

        RemoteControl remoteControl = new TVRemote();
        remoteControl.changeChannel();
        remoteControl.powerOff();
        remoteControl.powerOn();

        Messaging messaging = new WhatsApp();
        messaging.deleteMessage();
        messaging.sendMessage();
        messaging.receiveMessage();

        SmartDevice smartDevice = new SmartWatch();
        smartDevice.connect();
        smartDevice.disconnect();
        smartDevice.update();

        Browser browser = new Chrome();
        browser.closeTab();
        browser.openTab();
        browser.refreshPage();

        GamingConsole gamingConsole = new Playstation();
        gamingConsole.endGame();
        gamingConsole.pauseGame();
        gamingConsole.startGame();

        CloudStorage cloudStorage = new GoogleDrive();
        cloudStorage.deleteFile();
        calculator.add();
        calculator.multiply();

        NestThermostat nestThermostat = new NestThermostat();
        nestThermostat.decreaseTemperature();
        nestThermostat.increaseTemperature();
        nestThermostat.setTemperature();

        EBookReader bookReader = new Kindle();
        bookReader.closeBook();
        browser.openTab();
        browser.closeTab();

        NavigationSystem navigationSystem = new GoogleMaps();
        navigationSystem.reroute();
        navigationSystem.showMap();
        navigationSystem.setDestination();

        FoodDelivery foodDelivery = new Zomato();
        foodDelivery.cancelOrder();
        foodDelivery.placeOrder();
        foodDelivery.trackOrder();

        SocialMedia socialMedia = new Instagram();
        socialMedia.like();
        socialMedia.post();
        socialMedia.share();

        Laptop laptop = new Dell();
        laptop.boot();
        laptop.shutdown();
        laptop.sleep();

        Bank bank = new SBI();
        bank.deposit();
        bank.openAccount();
        bank.withdraw();

        Delivery delivery = new AmazonDelivery();
        delivery.deliver();
        delivery.pickup();
        delivery.returnItem();

        Television television = new SonyTV();
        television.changeChannel();
        television.turnOff();
        television.turnOn();

        TicketBooking ticketBooking = new IRCTC();
        ticketBooking.bookTicket();
        ticketBooking.searchTickets();
        ticketBooking.cancelTicket();


        SmartHome smartHome = new Alexa();
        smartHome.adjustThermostat();
        smartHome.lockDoors();
        smartHome.adjustThermostat();

        Ecommerce ecommerce = new Flipkart();
        ecommerce.addToCart();
        ecommerce.browseItems();
        ecommerce.checkout();

        Gaming gaming = new Xbox();
        gaming.endGame();
        gaming.pauseGame();
        gaming.startGame();

        EducationPlatform educationPlatform = new Coursera();
        educationPlatform.completeAssignment();
        educationPlatform.enrollCourse();
        educationPlatform.watchLecture();

        FileManager fileManager = new WindowsExplorer();
        fileManager.closeFile();
        fileManager.openFile();
        fileManager.createFile();

        SmartWatches smartWatches = new AppleWatch();
        smartWatches.monitorHeartRate();
        smartWatches.showTime();
        smartWatches.trackSteps();

        Restaurant restaurant = new KFC();
        restaurant.generateBill();
        restaurant.serveFood();
        restaurant.takeOrder();

        Streaming streaming = new Netflix();
        streaming.pauseVideo();
        streaming.playVideo();
        streaming.stopVideo();

        FlightBooking flightBooking = new Indigo();
        flightBooking.bookFlight();
        flightBooking.cancelFlight();
        flightBooking.searchFlights();

        FitnessApp fitnessApp = new MyFitnessPal();
        fitnessApp.setGoal();
        fitnessApp.startWorkout();
        fitnessApp.trackCalories();

        LanguageTranslator languageTranslator = new GoogleTranslate();
        languageTranslator.detectLanguage();
        languageTranslator.translateToHindi();
        languageTranslator.translateToEnglish();

        CalendarApp calendarApp = new GoogleCalender();
        calendarApp.addEvent();
        calendarApp.deleteEvent();
        calendarApp.viewSchedule();

        VoiceAssistant  voiceAssistant = new Siri();
        voiceAssistant.executeTask();
        voiceAssistant.giveResponse();
        voiceAssistant.listenCommand();

        BlogPlatform blogPlatform = new Medium();
        blogPlatform.deletePost();
        blogPlatform.publishPost();
        blogPlatform.deletePost();

        ReminderApp reminderApp = new Todoist();
        reminderApp.cancelReminder();
        reminderApp.setReminder();
        reminderApp.editReminder();

        SearchEngine searchEngine= new Bing();
        searchEngine.searchQuery();
        searchEngine.displayResults();
        searchEngine.filterResults();

        ScannerDevice scannerDevice = new Epson();
        scannerDevice.preview();
        scannerDevice.saveDocument();
        scannerDevice.scanDocument();

        VideoEditing videoEditing = new AdobePremiere();
        videoEditing.exportVideo();
        videoEditing.addTransition();
        videoEditing.cutClip();

        OnlineShopping onlineShopping = new Meesho();
        onlineShopping.addToCart();
        onlineShopping.searchProduct();
        onlineShopping.checkout();


        CarControl carControl = new Tesla();
        carControl.stopCar();
        carControl.drive();
        carControl.startEngine();

        NoteTaking noteTaking = new Evernote();
        noteTaking.deleteNote();
        noteTaking.writeNote();
        noteTaking.highlightText();

        PDFEditor pdfEditor = new FoxitReader();
        pdfEditor.editPDF();
        pdfEditor.openPDF();
        pdfEditor.savePDF();

        HealthCareApp healthCareApp = new Practo();
        healthCareApp.bookAppointment();
        healthCareApp.contactDoctor();
        healthCareApp.bookAppointment();

        NewsApp newsApp = new Inshorts();
        newsApp.bookmarkNews();
        newsApp.readArticle();
        newsApp.showHeadlines();

        RideHailing rideHailing = new Uber();
        rideHailing.bookRide();
        restaurant.serveFood();
        restaurant.takeOrder();

        LanguageLearning languageLearning = new Duolingo();
        languageLearning.learnWord();
        languageLearning.checkProgress();
        languageLearning.practiceQuiz();

        MusicApp musicApp = new Spotify();
        musicApp.downloadSong();
        musicApp.pauseSong();
        musicApp.playSong();

        ChatApp chatApp = new Telegram();
        chatApp.deleteChat();
        chatApp.startChat();
        chatApp.blockUser();

        TravelBooking travelBooking = new MakeMyTrip();
        travelBooking.bookTicket();
        travelBooking.cancelTicket();
        travelBooking.checkStatus();

        VideoPlatform videoPlatform  = new YouTube();
        videoPlatform.commentVideo();
        videoPlatform.uploadVideo();
        videoPlatform.likeVideo();

        Bag bag = new WildcraftBag();
        bag.carryBag();
        bag.closeBag();
        bag.carryBag();

        DoveSoap doveSoap = new DoveSoap();
        doveSoap.applySoap();
        doveSoap.rinseSoap();
        doveSoap.drySkin();

        Bedsheet bedsheet = new BombayDyeing();
        bedsheet.foldSheet();
        bedsheet.spreadSheet();
        bedsheet.washSheet();

        Coffee coffee = new Nescafe();
        coffee.brewCoffee();
        camera.zoom();
        camera.recordVideo();

        Tea tea = new TajMahalTea();
        tea.addTeaPowder();
        tea.boilWater();
        tea.serveTea();

        Pillow pillow = new Sleepwell();
        pillow.coverPillow();
        pillow.washPillow();
        pillow.fluffPillow();

        Curtain curtain = new HomeCenterCurtain();
        curtain.cleanCurtain();
        curtain.openCurtain();
        curtain.closeCurtain();

        Light light = new PhilipsLight();
        light.adjustBrightness();
        light.turnOff();
        light.turnOn();

        Mug mug = new MiltonMug();
        mug.cleanMug();
        mug.fillMug();
        mug.emptyMug();

        Shampoo shampoo = new ClinicPlus();
        shampoo.applyShampoo();
        shampoo.dryHair();
        shampoo.rinseShampoo();

        Remote remote = new SamsungRemote();
        remote.changeChannel();
        remote.turnOffTV();
        remote.turnOnTV();

        Toothbrush toothbrush = new OralB();
        toothbrush.applyToothpaste();
        toothbrush.brushTeeth();
        toothbrush.rinseMouth();


        Bottle bottle = new MiltonBottle();
        bottle.washBottle();
        bottle.drinkWater();
        bottle.fillWater();

        Mirror mirror = new SaintGobain();
        mirror.cleanMirror();
        mirror.adjustAngle();
        mirror.lookInto();


        Charger charger = new MiCharger();
        charger.chargeDevice();
        charger.plugIn();
        charger.unplug();

        Towel towel = new TridentTowel();
        towel.washTowel();
        towel.dryBody();
        towel.wipeFace();

        Bottle bottle1 = new TravelKit();
        bottle1.fillWater();
        bottle1.washBottle();
        bottle1.drinkWater();

        Towel towel1 = new TravelKit();
        towel1.wipeFace();
        towel1.washTowel();
        towel1.dryBody();

        Toothbrush toothbrush1 = new MorningRoutine();
        toothbrush1.rinseMouth();
        toothbrush1.brushTeeth();
        toothbrush1.applyToothpaste();

        Mirror mirror1 = new MorningRoutine();
        mirror1.lookInto();
        mirror1.cleanMirror();
        mirror1.adjustAngle();

        Fan fan1 = new LivingRoomSetup();
        fan1.turnOn();
        fan1.turnOff();
        fan1.adjustSpeed();

        Light light1 = new LivingRoomSetup();
        light1.turnOn();
        light1.turnOff();
        light1.adjustBrightness();

        NoteTaking noteTaking1 = new CollegeBag();
        noteTaking1.writeNote();
        noteTaking1.deleteNote();
        noteTaking1.highlightText();

        Bottle bottle2 = new CollegeBag();
        bottle2.drinkWater();
        bottle2.washBottle();
        bottle2.fillWater();

        Soap soap = new BAthroomEssentials();
        soap.applySoap();
        soap.rinseSoap();
        soap.drySkin();

        Shampoo shampoo1 = new BAthroomEssentials();
        shampoo1.rinseShampoo();
        shampoo1.applyShampoo();
        shampoo1.dryHair();
































    }
}
