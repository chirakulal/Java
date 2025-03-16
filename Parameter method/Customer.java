class Customer{
	static void buy(String vegetable , int quantity){
		System.out.println("Customer bought "+vegetable+"of "+quantity+"grams" );
		Shop.sell(vegetable,quantity);
	}
}