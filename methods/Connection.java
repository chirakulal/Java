class Connection{
	static void mouse(){
		Laptop.batteryLow();
		System.out.println("mouse is connected to laptop");
	}
	static void USB(){
		Printer();
		System.out.println("USB is connected");
	}
	static void Printer(){
		Laptop.powerOff();
		System.out.println("Printer is connected");
	}
	static void keyboard(){
		Speaker();
		System.out.println("Keyboard is connected");
	}
	static void Speaker(){
		Laptop.volumeUp();
		System.out.println("Speaker is connected");
	}
}