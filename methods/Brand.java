class Brand{
	public static void bmw(){
		System.out.println("Method9 is running");
	}
	public static void addidas(){
		System.out.println("Method10 is running");
		nike();
	}
	public static void nike(){
		System.out.println("Method11 is running");
		pvma();
	}
	public static void pvma(){
		System.out.println("Method12 is running");
		Pineapple.cut();
		Pineapple.decorating();
	}
}