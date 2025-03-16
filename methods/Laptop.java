class Laptop{
	static void  batteryLow(){
		sleepMood();
		System.out.println("Battery is running low");
	}
	static void sleepMood(){
		System.out.println("Laptop is in sleep mood");
		
	}
	static void  powerOff(){
		powerOn();
		System.out.println("Laptop is shutting down");
	}
	static void powerOn(){
		System.out.println("Laptop is powering On");
	}
	static void volumeUp(){
		System.out.println("Increase the volume");
	}
}