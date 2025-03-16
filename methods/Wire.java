class Wire{
	static void reparing(){
		System.out.println("Method21 reparing is running");
	}
	static void clearing(){
		System.out.println("Method22 clearing is running");
		connecting();
	}
	static void connecting(){
		System.out.println("Method23 connecting is running");
		fixing();
	}
	static void fixing(){
		System.out.println("Method24 fixing is running");
		Braclet.launching();
		Braclet.polishing();
	}
}