class Agent{
	static void purchase(String vegetable, int quantity){
		System.out.println("Agent purchased "+vegetable+"at "+quantity+"grams");
		Broker.brokerage(vegetable,quantity);
	}
}