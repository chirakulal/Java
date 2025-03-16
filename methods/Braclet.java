class Braclet{
	static void wearing(){
		System.out.println("Method25 wearing is running");
		designing();
	}
	static void designing(){
		System.out.println("Method26 designing is running");
	}
	static void launching(){
		wearing();
		System.out.println("Method27 launching is running");
	}
	static void polishing(){
		System.out.println("Method28 polishing is running");
		Perfume.spray();
		Perfume.fragrance();
	}
}