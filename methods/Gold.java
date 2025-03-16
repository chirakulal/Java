class Gold{
	static void weighing(){
		System.out.println("Method17 weighing is running");
	}
	static void carat(){
		System.out.println("Method18 carat is running");
		sell();
	}
	static void sell(){
		System.out.println("Method19 sell is running");
		buy();
	}
	static void buy(){
		System.out.println("Method20 Buy is running");
		Wire.reparing();
		Wire.clearing();
	}
}