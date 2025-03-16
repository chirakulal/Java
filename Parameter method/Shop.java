class Shop{
	static void sell(String vegetable, int quantity){
		System.out.println("Shopper sells "+vegetable+"of "+quantity+"grams");
		Agent.purchase(vegetable,quantity);
	}
}