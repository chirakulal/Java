class RatPoisonRunner{

	public static void main(String[] args){
		String ingredeint = "Bormadiolone";
		int weight = 100;
		double price = 149.99;
		
		RatPoison ratpoison1 = new RatPoison(ingredeint,weight,price);
		
		System.out.println("the ingredeint is "+ratpoison1.ingredient);
		System.out.println("the weight is :"+ratpoison1.weight);
		System.out.println("the price is :"+ratpoison1.price);
		
		String ingredeint1 = "Zinc";
		int weight1 = 120;
		double price1 = 179.0;
		
		RatPoison ratpoison2 = new RatPoison(ingredeint1,weight1,price1);
		
		System.out.println("the ingredeint is "+ratpoison2.ingredient);
		System.out.println("the weight is :"+ratpoison2.weight);
		System.out.println("the price is :"+ratpoison2.price);
		
		String ingredeint2 = "Baygon";
		int weight2 = 90;
		double price2 = 129.9;
		
		RatPoison ratpoison3 = new RatPoison(ingredeint2,weight2,price2);
		
		System.out.println("the ingredeint is "+ratpoison3.ingredient);
		System.out.println("the weight is :"+ratpoison3.weight);
		System.out.println("the price is :"+ratpoison3.price);
		
		String ingredeint3 = "Rodex";
		int weight3 = 110;
		double volume3 = 159.0;
		
		RatPoison ratpoison4 = new RatPoison(ingredeint3,weight3,volume3);
		
		System.out.println("the ingredeint is "+ratpoison4.ingredient);
		System.out.println("the weight is :"+ratpoison4.weight);
		System.out.println("the price is :"+ratpoison4.price);
		
		String ingredeint4 = "just one bite";
		int weight4 = 130;
		int volume4 = 200;
		
		RatPoison ratpoison5 = new RatPoison(ingredeint4,weight4,volume4);
		
		System.out.println("the ingredeint is "+ratpoison5.ingredient);
		System.out.println("the weight is :"+ratpoison5.weight);
		System.out.println("the price is :"+ratpoison5.price);
		}
}