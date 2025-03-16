class Lipstick{
	public static void empty(){
		System.out.println("Method1 is running");
	}
	static void useLipstick(){
		
		System.out.println("Method2 is running");
		apply();
	}
	static void apply(){
		
		System.out.println("Method3 is running");
		buylipstick();
	}
	static void buylipstick(){
	    
		System.out.println("Method4 is running");
		 Trafficsignal.redSignal();
		 Trafficsignal.go();
		 
	}
	
}