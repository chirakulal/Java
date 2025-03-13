class HarpicRunner{
	
	public static void main(String[] args){
		String brand1 = "powerplus";
		int price1 =149;
		int volume1 = 750;
		
		Harpic harpic1 = new Harpic(brand1,price1,volume1);
		System.out.println("the brand name is "+harpic1.brand);
		System.out.println("the price is "+harpic1.price);
		System.out.println("the volume is "+harpic1.volume);
		
		String brand2 = "white&shine";
		int price2 = 109;
		int volume2 = 500;
		
		Harpic harpic2 = new Harpic(brand2,price2,volume2);
		System.out.println("the brand name is "+harpic2.brand);
		System.out.println("the price is "+harpic2.price);
		System.out.println("the volume is "+harpic2.volume);
		
		String brand3 = "disinfectant";
		int price3 =249;
		int volume3 = 1000;
		
		Harpic harpic3 = new Harpic(brand3,price3,volume3);
		System.out.println("the brand name is "+harpic3.brand);
		System.out.println("the price is "+harpic3.price);
		System.out.println("the volume is "+harpic3.volume);
		
		String brand4 = "ToiletBucks";
		int price4 = 300;
		int volume4 = 1250;
		
		Harpic harpic4 = new Harpic(brand4,price4,volume4);
		System.out.println("the brand name is "+harpic4.brand);
		System.out.println("the price is "+harpic4.price);
		System.out.println("the volume is "+harpic4.volume);
		
		String brand5 = "Bathroomcenter";
		int price5 = 500;
		int volume5 = 2000;
		
		Harpic harpic5 = new Harpic(brand5,price5,volume5);
		System.out.println("the brand name is "+harpic5.brand);
		System.out.println("the price is "+harpic5.price);
		System.out.println("the volume is "+harpic5.volume);
		
	}
}