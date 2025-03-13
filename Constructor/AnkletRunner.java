class AnkletRunner{
	public static void main(String[] args){
		String design = "beaded";
		int length = 25;
		double price = 499.0;
		
		Anklet anklet1 = new Anklet(design,length,price);
		
		System.out.println("the design is "+anklet1.design);
		System.out.println("the length is "+anklet1.length);
		System.out.println("the price is "+anklet1.price);
		
		String design1 = "chain";
		int length1 = 22;
		double price1 = 999;
		
		Anklet anklet2 = new Anklet(design1,length1,price1);
		
		System.out.println("the design is "+anklet2.design);
		System.out.println("the length is "+anklet2.length);
		System.out.println("the price is "+anklet2.price);
		
		String design2 = "charm";
		int length2 = 24;
		double price2 = 199;
		
		Anklet anklet3 = new Anklet (design2,length2,price2);
		
		System.out.println("the design is "+anklet3.design);
		System.out.println("the length is "+anklet3.length);
		System.out.println("the price is "+anklet3.price);
		
		String design4 = "layered";
		int length4 = 22;
		double price4 = 300;
		
		Anklet anklet4 = new Anklet(design4,length4,price4);
		
		System.out.println("the design is "+anklet4.design);
		System.out.println("the length is "+anklet4.length);
		System.out.println("the price is "+anklet4.price);
		
		String design5 = "plain";
		int length5 = 27;
		double price5 = 200;
		
		Anklet anklet5 = new Anklet(design5,length5,price5);
		
		System.out.println("the design is "+anklet5.design);
		System.out.println("the length is "+anklet5.length);
		System.out.println("the price is "+anklet5.price);
		
		
	}
}