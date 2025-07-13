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
        vehicle.run();

        Camera camera = new Dslr();
        camera.recordVideo();
        camera.zoom();
        camera.takePhoto();
        camera.capture();


        Calculator calculator = new ScientificCalculator();
        calculator.add();
        calculator.multiply();
        calculator.subtract();

        Alarm alarm = new DigitalAlarm();
        alarm.setAlarm();
        alarm.stopAlarm();

        alarm.timer();

        Fan fan = new CellingFan();
        fan.adjustSpeed();
        fan.turnOff();
        fan.turnOn();
        fan.capacitor();

        Payment payment = new CreditCard();
        payment.pay();
        payment.checkBalance();
        payment.refund();
        payment.deposit();

        RemoteControl remoteControl = new TVRemote();
        remoteControl.changeChannel();
        remoteControl.powerOff();
        remoteControl.powerOn();
        remoteControl.increaseVolume();

        Messaging messaging = new WhatsApp();
        messaging.deleteMessage();
        messaging.sendMessage();
        messaging.receiveMessage();
        messaging.draft();

        SmartDevice smartDevice = new SmartWatch();
        smartDevice.connect();
        smartDevice.disconnect();
        smartDevice.update();
        smartDevice.themeChange();

        Browser browser = new Chrome();
        browser.closeTab();
        browser.openTab();
        browser.refreshPage();
        browser.search();

        GamingConsole gamingConsole = new Playstation();
        gamingConsole.endGame();
        gamingConsole.pauseGame();
        gamingConsole.startGame();
        gamingConsole.reset();

        CloudStorage cloudStorage = new GoogleDrive();
        cloudStorage.deleteFile();
        cloudStorage.downloadFile();
        cloudStorage.uploadFile();
        cloudStorage.restoreFile();


        NestThermostat nestThermostat = new NestThermostat();
        nestThermostat.decreaseTemperature();
        nestThermostat.increaseTemperature();
        nestThermostat.setTemperature();
        nestThermostat.checkTemperature();

        EBookReader bookReader = new Kindle();
        bookReader.closeBook();
        bookReader.openBook();
        bookReader.bookmarkPage();
        bookReader.read();

        NavigationSystem navigationSystem = new GoogleMaps();
        navigationSystem.reroute();
        navigationSystem.showMap();
        navigationSystem.setDestination();
        navigationSystem.setSource();

        FoodDelivery foodDelivery = new Zomato();
        foodDelivery.cancelOrder();
        foodDelivery.placeOrder();
        foodDelivery.trackOrder();
        foodDelivery.takeOrder();

        SocialMedia socialMedia = new Instagram();
        socialMedia.like();
        socialMedia.post();
        socialMedia.share();

        Laptop laptop = new Dell();
        laptop.boot();
        laptop.shutdown();
        laptop.sleep();
        laptop.restart();

        Bank bank = new SBI();
        bank.deposit();
        bank.openAccount();
        bank.withdraw();
        bank.savings();

        Delivery delivery = new AmazonDelivery();
        delivery.deliver();
        delivery.pickup();
        delivery.returnItem();
        delivery.cancel();

        Television television = new SonyTV();
        television.changeChannel();
        television.turnOff();
        television.turnOn();
        television.volume();

        TicketBooking ticketBooking = new IRCTC();
        ticketBooking.bookTicket();
        ticketBooking.searchTickets();
        ticketBooking.cancelTicket();
        ticketBooking.booking();


        SmartHome smartHome = new Alexa();
        smartHome.adjustThermostat();
        smartHome.lockDoors();
        smartHome.turnLightsOn();
        smartHome.onLight();

        Ecommerce ecommerce = new Flipkart();
        ecommerce.addToCart();
        ecommerce.browseItems();
        ecommerce.checkout();
        ecommerce.deleteCart();

        Gaming gaming = new Xbox();
        gaming.endGame();
        gaming.pauseGame();
        gaming.startGame();
        gaming.nextGame();

        EducationPlatform educationPlatform = new Coursera();
        educationPlatform.completeAssignment();
        educationPlatform.enrollCourse();
        educationPlatform.watchLecture();
        educationPlatform.receiveCertificate();

        FileManager fileManager = new WindowsExplorer();
        fileManager.closeFile();
        fileManager.openFile();
        fileManager.createFile();
        fileManager.deleteFiles();

        SmartWatches smartWatches = new AppleWatch();
        smartWatches.monitorHeartRate();
        smartWatches.showTime();
        smartWatches.trackSteps();
        smartWatches.call();

        Restaurant restaurant = new KFC();
        restaurant.generateBill();
        restaurant.serveFood();
        restaurant.takeOrder();
        restaurant.deliver();

        Streaming streaming = new Netflix();
        streaming.pauseVideo();
        streaming.playVideo();
        streaming.stopVideo();
        streaming.react();

        FlightBooking flightBooking = new Indigo();
        flightBooking.bookFlight();
        flightBooking.cancelFlight();
        flightBooking.searchFlights();
        flightBooking.checkStatus();

        FitnessApp fitnessApp = new MyFitnessPal();
        fitnessApp.setGoal();
        fitnessApp.startWorkout();
        fitnessApp.trackCalories();
        fitnessApp.dietChart();

        LanguageTranslator languageTranslator = new GoogleTranslate();
        languageTranslator.detectLanguage();
        languageTranslator.translateToHindi();
        languageTranslator.translateToEnglish();
        languageTranslator.translateToUrdu();

        CalendarApp calendarApp = new GoogleCalender();
        calendarApp.addEvent();
        calendarApp.deleteEvent();
        calendarApp.viewSchedule();
        calendarApp.event();

        VoiceAssistant  voiceAssistant = new Siri();
        voiceAssistant.executeTask();
        voiceAssistant.giveResponse();
        voiceAssistant.listenCommand();
        voiceAssistant.askQuestions();

        BlogPlatform blogPlatform = new Medium();
        blogPlatform.deletePost();
        blogPlatform.publishPost();
        blogPlatform.writePost();
        blogPlatform.editPost();

        ReminderApp reminderApp = new Todoist();
        reminderApp.cancelReminder();
        reminderApp.setReminder();
        reminderApp.editReminder();
        reminderApp.deleteReminder();

        SearchEngine searchEngine= new Bing();
        searchEngine.searchQuery();
        searchEngine.displayResults();
        searchEngine.filterResults();
        searchEngine.result();

        ScannerDevice scannerDevice = new Epson();
        scannerDevice.preview();
        scannerDevice.saveDocument();
        scannerDevice.scanDocument();
        scannerDevice.send();

        VideoEditing videoEditing = new AdobePremiere();
        videoEditing.exportVideo();
        videoEditing.addTransition();
        videoEditing.cutClip();
        videoEditing.edit();

        OnlineShopping onlineShopping = new Meesho();
        onlineShopping.addToCart();
        onlineShopping.searchProduct();
        onlineShopping.checkout();
        onlineShopping.deliver();


        CarControl carControl = new Tesla();
        carControl.stopCar();
        carControl.drive();
        carControl.startEngine();
        carControl.manageSpeed();

        NoteTaking noteTaking = new Evernote();
        noteTaking.deleteNote();
        noteTaking.writeNote();
        noteTaking.highlightText();
        noteTaking.editNoter();

        PDFEditor pdfEditor = new FoxitReader();
        pdfEditor.editPDF();
        pdfEditor.openPDF();
        pdfEditor.savePDF();
        pdfEditor.sendPDF();

        HealthCareApp healthCareApp = new Practo();
        healthCareApp.bookAppointment();
        healthCareApp.contactDoctor();
        healthCareApp.viewReports();
        healthCareApp.check();

        NewsApp newsApp = new Inshorts();
        newsApp.bookmarkNews();
        newsApp.readArticle();
        newsApp.showHeadlines();
        newsApp.showArticle();

        RideHailing rideHailing = new Uber();
        rideHailing.bookRide();
        rideHailing.cancelRide();
        rideHailing.rateDriver();
        rideHailing.travel();


        LanguageLearning languageLearning = new Duolingo();
        languageLearning.learnWord();
        languageLearning.checkProgress();
        languageLearning.practiceQuiz();
        languageLearning.takeTest();

        MusicApp musicApp = new Spotify();
        musicApp.downloadSong();
        musicApp.pauseSong();
        musicApp.playSong();
        musicApp.addToLibrary();

        ChatApp chatApp = new Telegram();
        chatApp.deleteChat();
        chatApp.startChat();
        chatApp.blockUser();
        chatApp.sendChat();

        TravelBooking travelBooking = new MakeMyTrip();
        travelBooking.bookTicket();
        travelBooking.cancelTicket();
        travelBooking.checkStatus();
        travelBooking.TRavel();

        VideoPlatform videoPlatform  = new YouTube();
        videoPlatform.commentVideo();
        videoPlatform.uploadVideo();
        videoPlatform.likeVideo();
        videoPlatform.delete();

        Bag bag = new WildcraftBag();
        bag.carryBag();
        bag.closeBag();
        bag.openBag();
        bag.checkBag();

        DoveSoap doveSoap = new DoveSoap();
        doveSoap.applySoap();
        doveSoap.rinseSoap();
        doveSoap.drySkin();
        doveSoap.clean();

        Bedsheet bedsheet = new BombayDyeing();
        bedsheet.foldSheet();
        bedsheet.spreadSheet();
        bedsheet.washSheet();
        bedsheet.cleanSheet();

        Coffee coffee = new Nescafe();
        coffee.brewCoffee();
        coffee.serveCoffee();
        coffee.addSugar();
        coffee.serve();

        Tea tea = new TajMahalTea();
        tea.addTeaPowder();
        tea.boilWater();
        tea.serveTea();
        tea.drinkTea();

        Pillow pillow = new Sleepwell();
        pillow.coverPillow();
        pillow.washPillow();
        pillow.fluffPillow();
        pillow.HelpsTosleep();

        Curtain curtain = new HomeCenterCurtain();
        curtain.cleanCurtain();
        curtain.openCurtain();
        curtain.closeCurtain();
        curtain.throwCurtain();

        Light light = new PhilipsLight();
        light.adjustBrightness();
        light.turnOff();
        light.turnOn();
        light.capacity();

        Mug mug = new MiltonMug();
        mug.cleanMug();
        mug.fillMug();
        mug.emptyMug();
        mug.storeMug();

        Shampoo shampoo = new ClinicPlus();
        shampoo.applyShampoo();
        shampoo.dryHair();
        shampoo.rinseShampoo();
        shampoo.smoothShampoo();

        Remote remote = new SamsungRemote();
        remote.changeChannel();
        remote.turnOffTV();
        remote.turnOnTV();
        remote.increaseVolume();

        Toothbrush toothbrush = new OralB();
        toothbrush.applyToothpaste();
        toothbrush.brushTeeth();
        toothbrush.rinseMouth();
        toothbrush.flavour();


        Bottle bottle = new MiltonBottle();
        bottle.washBottle();
        bottle.drinkWater();
        bottle.fillWater();
        bottle.cleanBottel();

        Mirror mirror = new SaintGobain();
        mirror.cleanMirror();
        mirror.adjustAngle();
        mirror.lookInto();
        mirror.keep();


        Charger charger = new MiCharger();
        charger.chargeDevice();
        charger.plugIn();
        charger.unplug();
        charger.KeepitSafe();

        Towel towel = new TridentTowel();
        towel.washTowel();
        towel.dryBody();
        towel.wipeFace();

        WashingMachine washingMachine = new LGMachine();
        washingMachine.dry();
        washingMachine.wash();
        washingMachine.rinse();
        washingMachine.clean();

        MapApp mapApp = new Waze();
        mapApp.search();
        mapApp.locatePlace();
        mapApp.saveLocation();
        mapApp.measureDistance();

        NoteTaking noteTaking1 = noteTaking;
        noteTaking1.editNoter();
        noteTaking1.writeNote();
        noteTaking1.deleteNote();
        noteTaking1.highlightText();

        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.speed();
        mediaPlayer.stop();
        mediaPlayer.play();
        mediaPlayer.pause();

        BankingApp bankingApp = new AxisBank();
        bankingApp.deposit();
        bankingApp.login();
        bankingApp.transferMoney();
        bankingApp.checkBalance();

        PhotoGallery photoGallery = new GooglePhotos();
        photoGallery.restore();
        photoGallery.deletePhotos();
        photoGallery.editPhotos();
        photoGallery.deletePhotos();

        PhotoEditor photoEditor = new Snapseed();
        photoEditor.delete();
        photoEditor.crop();
        photoEditor.save();
        photoEditor.filter();

        Printer printer = new OfficePrinter();
        printer.edit();
        printer.copy();
        printer.print();
        printer.scan();

        FitnessApp fitnessApp1 = new MyFitnessPal();
        fitnessApp1.dietChart();
        fitnessApp1.trackCalories();
        fitnessApp1.startWorkout();
        fitnessApp1.setGoal();

        CodingPlatform codingPlatform = new HackerRank();
        codingPlatform.compile();
        codingPlatform.submitCode();
        codingPlatform.runTestCases();
        codingPlatform.viewLeaderboard();

        VideoEditing videoEditing1 = new AdobePremiere();
        videoEditing1.edit();
        videoEditing1.exportVideo();
        videoEditing1.addTransition();
        videoEditing1.addTransition();




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

        NoteTaking noteTaking2 = new CollegeBag();
        noteTaking2.writeNote();
        noteTaking2.deleteNote();
        noteTaking2.highlightText();

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

        Remote remote1 = new PowerCorner();
        remote1.turnOnTV();
        remote1.changeChannel();
        remote1.turnOffTV();

        Charger charger1 = new PowerCorner();
        charger1.unplug();
        charger1.plugIn();
        charger1.chargeDevice();

        Pillow pillow1 = new GuestRoomKit();
        pillow1.fluffPillow();
        pillow1.washPillow();
        pillow1.coverPillow();

        Bedsheet bedsheet1 = new GuestRoomKit();
        bedsheet1.washSheet();
        bedsheet1.spreadSheet();
        bedsheet1.foldSheet();

        Coffee coffee1 = new CafeCombo();
        coffee1.brewCoffee();
        coffee1.serveCoffee();
        coffee1.addSugar();

        Mug mug1 = new CafeCombo();
        mug1.emptyMug();
        mug1.fillMug();
        mug1.cleanMug();

        Towel towel2 = new BathroomPack();
        towel2.dryBody();
        towel2.washTowel();
        towel2.wipeFace();

        Soap soap1 = new BathroomPack();
        soap1.drySkin();
        soap1.rinseSoap();
        soap1.applySoap();

        Curtain curtain1 = new HomeSet();
        curtain1.closeCurtain();
        curtain1.openCurtain();
        curtain1.cleanCurtain();

        Light light2 = new HomeSet();
        light2.adjustBrightness();
        light2.turnOff();
        light2.turnOn();

        Restaurant restaurant1 = new ChillCorner();
        restaurant1.takeOrder();
        restaurant1.serveFood();
        restaurant1.generateBill();

        Fan fan2 = new ChillCorner();
        fan2.adjustSpeed();
        fan2.turnOff();
        fan2.turnOn();

        NoteTaking noteTaking4 = new StudyTime();
        noteTaking4.highlightText();
        noteTaking4.deleteNote();
        noteTaking4.writeNote();

        NewsApp newsApp1 = new StudyTime();
        newsApp1.showHeadlines();
        newsApp1.bookmarkNews();
        newsApp1.readArticle();

        Toothbrush toothbrush2 = new MorningSetup();
        toothbrush2.applyToothpaste();
        toothbrush1.brushTeeth();
        toothbrush2.rinseMouth();

        Shampoo shampoo2 = new MorningSetup();
        shampoo2.dryHair();
        shampoo2.applyShampoo();
        shampoo2.rinseShampoo();

        Charger charger2 = new PowerPack();
        charger2.chargeDevice();
        charger2.plugIn();
        charger2.chargeDevice();

        Alarm alarm1 = new PowerPack();
        alarm1.snooze();
        alarm1.stopAlarm();
        alarm1.setAlarm();

        MediaPlayer mediaPlayer1 = new SnackCorner();
        mediaPlayer1.pause();
        mediaPlayer1.play();
        mediaPlayer1.stop();

        Gaming gaming1 = new SnackCorner();
        gaming1.startGame();
        gaming1.pauseGame();
        gaming1.endGame();

        Mug mug2 = new WashroomSetup();
        mug2.cleanMug();
        mug2.fillMug();
        mug2.emptyMug();

        Mirror mirror2 = new WashroomSetup();
        mirror2.adjustAngle();
        mirror2.cleanMirror();
        mirror2.lookInto();













































    }
}
