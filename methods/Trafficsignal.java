class Trafficsignal{
	public static void redSignal(){
		System.out.println("Method5 is running");
		yellowSignal();
	}
	public static void yellowSignal(){
		
		System.out.println("Method6 is running");
		greenSignal();
	}
	public static void greenSignal(){
		System.out.println("Method7 is running");
	}
	public static void go(){
		System.out.println("Method8 is running");
		Brand.bmw();
		Brand.addidas();
	}
}