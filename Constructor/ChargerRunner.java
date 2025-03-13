class ChargerRunner{
	
	public static void main(String[] args){
		String brand = "Skyen";
		int voltage = 10;
		double price = 1499.0;
		
		Charger charger1 = new Charger(brand,voltage,price);
		
		System.out.println("the brand is "+charger1.brand);
		System.out.println("the voltage is "+charger1.voltage);
		System.out.println("the price is "+charger1.price);
		
		String brand2 = "Realme";
		int voltage2 = 15;
		double price2 = 2000;
		
		Charger charger2 = new Charger(brand2,voltage2,price2);
		
		System.out.println("the brand is "+charger2.brand);
		System.out.println("the voltage is "+charger2.voltage);
		System.out.println("the price is "+charger2.price);
		
		String brand3 = "Vivo";
		int voltage3 = 5;
		double price3 = 999.0;
		
		Charger charger3 = new Charger(brand3,voltage3,price3);
		System.out.println("the brand is "+charger3.brand);
		System.out.println("the voltage is "+charger3.voltage);
		System.out.println("the price is "+charger3.price);
		
		String brand4 ="Oppo";
		int voltage4 = 10;
		double price4 = 2000.0;
		
		Charger charger4 = new Charger(brand4,voltage4,price4);
		System.out.println("the brand is "+charger4.brand);
		System.out.println("the voltage is "+charger4.voltage);
		System.out.println("the price is "+charger4.price);
		
		String brand5 = "sumsung";
		int voltage5 = 15;
		double price5 = 2999.0;
		
		Charger charger5 = new Charger(brand5,voltage5,price5);
		System.out.println("the brand is "+charger5.brand);
		System.out.println("the voltage is "+charger5.voltage);
		System.out.println("the price is "+charger5.price);
	}
}