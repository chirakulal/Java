class Broker{
	static void brokerage(String vegetable,int quantity ){
		System.out.println("Broker purchased "+vegetable+"of "+quantity+"grams");
		Farmer.farm(vegetable,quantity);
	}
}